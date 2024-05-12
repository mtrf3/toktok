package com.ss.android.ugc.aweme.shortvideo.subtitle;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class FeedbackBody {

    @InterfaceC65349Pkn("utterances")
    public List<Utterance> mUtterances;

    @InterfaceC65349Pkn("vid")
    public String vid;

    public FeedbackBody(String vid, List<Utterance> list) {
        o.LJIIIZ(vid, "vid");
        o.LJIIIZ(list, "list");
        this.vid = "";
        this.vid = vid;
        this.mUtterances = list;
    }
}
