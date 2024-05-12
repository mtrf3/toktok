package com.ss.android.ugc.aweme.services.external.ui;

import X.C43722HDy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ShareConfig {
    public String appName;
    public String file;
    public List<String> imageList;
    public Effect presetEffect;
    public final C43722HDy shareContext;
    public final int type;
    public List<String> videoList;

    public final String getAppName() {
        return this.appName;
    }

    public final String getFile() {
        return this.file;
    }

    public final List<String> getImageList() {
        return this.imageList;
    }

    public final Effect getPresetEffect() {
        return this.presetEffect;
    }

    public final C43722HDy getShareContext() {
        return this.shareContext;
    }

    public final int getType() {
        return this.type;
    }

    public final List<String> getVideoList() {
        return this.videoList;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final void setImageList(List<String> list) {
        this.imageList = list;
    }

    public final void setPresetEffect(Effect effect) {
        this.presetEffect = effect;
    }

    public final void setVideoList(List<String> list) {
        this.videoList = list;
    }

    public ShareConfig(C43722HDy shareContext, int i) {
        o.LJIIIZ(shareContext, "shareContext");
        this.shareContext = shareContext;
        this.type = i;
    }
}
