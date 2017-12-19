package com.meti.lib.util.fx;

import com.meti.lib.util.Utility;

import java.io.IOException;
import java.net.URL;

/**
 * @author SirMathhman
 * @version 0.0.0
 * @since 12/19/2017
 */
public class Stageables {
    private Stageables() {
    }

    public static void load(URL url, Stageable stageable) throws IOException {
        Utility.load(url, stageable.getStage());
    }
}