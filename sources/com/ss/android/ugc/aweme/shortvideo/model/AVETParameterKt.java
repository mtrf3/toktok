package com.ss.android.ugc.aweme.shortvideo.model;

import X.C16880lQ;
import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AVETParameterKt {
    public static final AVETParameter generateAVETParam(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        if (bundle.getSerializable("av_et_parameter") != null) {
            Serializable serializable = bundle.getSerializable("av_et_parameter");
            o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.model.AVETParameter");
            return (AVETParameter) serializable;
        }
        AVETParameter aVETParameter = new AVETParameter();
        String string = bundle.getString("creation_id");
        String str = "";
        if (string == null) {
            string = "";
        }
        aVETParameter.setCreationId(string);
        aVETParameter.setDraftId(bundle.getInt("draft_id", 0));
        String string2 = bundle.getString("new_draft_id");
        if (string2 == null) {
            string2 = "";
        }
        aVETParameter.setNewDraftId(string2);
        String string3 = bundle.getString("shoot_way");
        if (string3 == null) {
            string3 = "";
        }
        aVETParameter.setShootWay(string3);
        aVETParameter.setShootMode(bundle.getInt("shoot_mode", 0));
        if (bundle.containsKey("content_type")) {
            String string4 = bundle.getString("content_type");
            if (string4 == null) {
                string4 = "";
            }
            aVETParameter.setContentType(string4);
        }
        if (!bundle.containsKey("content_source")) {
            return aVETParameter;
        }
        String string5 = bundle.getString("content_source");
        if (string5 != null) {
            str = string5;
        }
        aVETParameter.setContentSource(str);
        return aVETParameter;
    }

    public static final AVETParameter generateAVETParam(Intent intent) {
        o.LJIIIZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        return generateAVETParam(LLJJIJI);
    }
}
