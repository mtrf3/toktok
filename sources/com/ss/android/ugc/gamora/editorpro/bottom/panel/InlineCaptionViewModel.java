package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.C152605yq;
import X.C29901Fi;
import X.C5FC;
import X.C79057V0z;
import X.H78;
import X.X1D;
import X.XS7;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class InlineCaptionViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final C29901Fi<String> LJLIL = new C29901Fi<>();
    public final C29901Fi<LanguageDetail> LJLILLLLZI = new C29901Fi<>();
    public List<LanguageDetail> LJLJI;
    public final C152605yq LJLJJI;
    public XS7 LJLJJL;

    public InlineCaptionViewModel() {
        new ArrayList();
        this.LJLJJI = new C152605yq();
    }

    public final String gv0(String localName) {
        LanguageDetail languageDetail;
        String str;
        o.LJIIIZ(localName, "localName");
        List<LanguageDetail> list = this.LJLJI;
        if (list != null) {
            Iterator<LanguageDetail> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    languageDetail = it.next();
                    if (o.LJ(languageDetail.localName, localName)) {
                        break;
                    }
                } else {
                    languageDetail = null;
                    break;
                }
            }
            LanguageDetail languageDetail2 = languageDetail;
            if (languageDetail2 != null && (str = languageDetail2.code) != null) {
                return str;
            }
        }
        return "";
    }

    public final void hv0(long j, EditorProContext editorContext) {
        NLETrackSlot nLETrackSlot;
        String uuid;
        o.LJIIIZ(editorContext, "editorContext");
        H78.LIZ("InlineCaptionFragment -> click mIvFont, showEditCaptionFont");
        editorContext.getPlayer().pause();
        String str = "";
        long j2 = 0;
        if (j >= 0) {
            NLETrack LIZLLL = C5FC.LIZLLL(C79057V0z.LJJI(editorContext));
            if (LIZLLL != null) {
                Iterator<NLETrackSlot> it = LIZLLL.LJIILL().iterator();
                while (true) {
                    if (it.hasNext()) {
                        nLETrackSlot = it.next();
                        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                        if (nLETrackSlot2.getStartTime() <= 1000 * j && nLETrackSlot2.getEndTime() >= j) {
                            break;
                        }
                    } else {
                        nLETrackSlot = null;
                        break;
                    }
                }
                NLETrackSlot nLETrackSlot3 = nLETrackSlot;
                if (nLETrackSlot3 != null && (uuid = nLETrackSlot3.getUUID()) != null) {
                    str = uuid;
                }
            }
            editorContext.getPlayer().M9(1000 * j);
            this.LJLIL.LJI(str);
            return;
        }
        long H9 = editorContext.getPlayer().H9();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InlineCaptionFragment -> current time = ");
        LIZ.append(H9);
        H78.LIZ(X1D.LIZIZ(LIZ));
        NLETrack LIZLLL2 = C5FC.LIZLLL(C79057V0z.LJJI(editorContext));
        if (LIZLLL2 != null) {
            Iterator<NLETrackSlot> it2 = LIZLLL2.LJIILL().iterator();
            long j3 = Long.MAX_VALUE;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NLETrackSlot next = it2.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("InlineCaptionFragment -> startTime = ");
                LIZ2.append(next.getStartTime());
                H78.LIZ(X1D.LIZIZ(LIZ2));
                if (next.getStartTime() <= H9 && next.getEndTime() >= H9) {
                    j2 = next.getStartTime();
                    str = next.getUUID();
                    o.LJIIIIZZ(str, "it.uuid");
                    break;
                } else if (next.getStartTime() > H9) {
                    if (next.getStartTime() - H9 < j3) {
                        j2 = next.getStartTime();
                        str = next.getUUID();
                        o.LJIIIIZZ(str, "it.uuid");
                    }
                } else if (H9 - next.getEndTime() < j3) {
                    j3 = H9 - next.getEndTime();
                    j2 = next.getStartTime();
                    str = next.getUUID();
                    o.LJIIIIZZ(str, "it.uuid");
                }
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("InlineCaptionFragment -> showEditCaptionFont -> seekPosition = ");
        LIZ3.append(j2);
        H78.LIZ(X1D.LIZIZ(LIZ3));
        editorContext.getPlayer().M9(j2);
        this.LJLIL.LJI(str);
    }
}
