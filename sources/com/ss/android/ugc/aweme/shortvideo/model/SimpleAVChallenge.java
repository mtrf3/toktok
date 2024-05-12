package com.ss.android.ugc.aweme.shortvideo.model;

import X.C60903NvH;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;

/* loaded from: classes8.dex */
public class SimpleAVChallenge {
    public static final Gson GSON = C60903NvH.LJIIJJI().LIZ();
    public String challengeName;
    public String cid;
    public String stickerId;
    public int type;
    public int userCount;
    public long viewCount = -1;

    public AVChallenge parse2AVChallenge() {
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = this.cid;
        aVChallenge.challengeName = this.challengeName;
        aVChallenge.type = this.type;
        aVChallenge.stickerId = this.stickerId;
        aVChallenge.viewCount = this.viewCount;
        aVChallenge.userCount = this.userCount;
        return aVChallenge;
    }

    public static SimpleAVChallenge deserializeFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (SimpleAVChallenge) GSON.LJI(str, SimpleAVChallenge.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static SimpleAVChallenge fromAVChallenge(AVChallenge aVChallenge) {
        SimpleAVChallenge simpleAVChallenge = new SimpleAVChallenge();
        simpleAVChallenge.cid = aVChallenge.cid;
        simpleAVChallenge.challengeName = aVChallenge.challengeName;
        simpleAVChallenge.type = aVChallenge.type;
        simpleAVChallenge.stickerId = aVChallenge.stickerId;
        simpleAVChallenge.viewCount = aVChallenge.viewCount;
        simpleAVChallenge.userCount = aVChallenge.userCount;
        return simpleAVChallenge;
    }

    public static String serializeToStr(SimpleAVChallenge simpleAVChallenge) {
        if (simpleAVChallenge == null) {
            return null;
        }
        try {
            return GSON.LJIILL(simpleAVChallenge);
        } catch (Exception unused) {
            return null;
        }
    }
}
