package com.ss.android.ugc.effectmanager.algorithm;

import android.content.res.AssetManager;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import defpackage.i0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes16.dex */
public final class AssetManagerWrapper {
    public final AssetManager mAssetManager;
    public final Pattern mExclusionPattern;

    public AssetManager getWrapped() {
        return this.mAssetManager;
    }

    public boolean exists(String str) {
        try {
            InputStream open = open(str);
            if (open != null) {
                try {
                    open.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            }
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public InputStream open(String str) {
        String nameOfModel = ModelNameProcessor.getNameOfModel(str);
        Pattern pattern = this.mExclusionPattern;
        if (pattern == null || !pattern.matcher(nameOfModel).matches()) {
            return this.mAssetManager.open(str, 2);
        }
        throw new FileNotFoundException(i0.LJFF(str, " manually excluded by DownloadableModelSupport.exclusionPattern"));
    }

    public AssetManagerWrapper(AssetManager assetManager, Pattern pattern) {
        this.mAssetManager = assetManager;
        this.mExclusionPattern = pattern;
    }
}
