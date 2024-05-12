package X;

import Y.AObjectS40S0201000_7;
import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.cutsame.effectfetcher.TemplateSourceConfig;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import com.ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.6qE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172746qE implements H82 {
    @Override // X.H82
    public final ArrayList<Float> LIZIZ(NLETemplateModel model) {
        o.LJIIIZ(model, "model");
        ArrayList<Float> arrayList = new ArrayList<>();
        Iterator<MediaItem> it = C127334zB.LIZ(model).iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((float) it.next().duration) / 1000.0f));
        }
        return arrayList;
    }

    public final void LIZJ(Context context, String templateUrl, final AObjectS40S0201000_7 aObjectS40S0201000_7) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(templateUrl, "templateUrl");
        TemplateSourceConfig LIZ = C45161Hnx.LIZ();
        C45244HpI c45244HpI = C45244HpI.LIZ;
        c45244HpI.LIZIZ(new AqS157S0100000_7(LIZ, 417));
        C172656q5.LIZIZ();
        NLETemplateSource nLETemplateSource = new NLETemplateSource(context, new CutSource(templateUrl, CutSourceType.URL), "");
        nLETemplateSource.LJ(new C82876Wfo(new C82869Wfh(context)));
        nLETemplateSource.LJI(c45244HpI.LIZ(EnumC172756qF.AUTOCUT));
        nLETemplateSource.LIZ(new NLEPrepareListener() { // from class: X.6qH
            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onError(int i, String str) {
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onProgress(float f, String str) {
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onSuccess(NLETemplateModel nLETemplateModel) {
                aObjectS40S0201000_7.invoke(nLETemplateModel);
            }
        });
        nLETemplateSource.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    @Override // X.H82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r5, boolean r6, int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, final X.InterfaceC172786qI r11) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "templateId"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "templateUrl"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "templateMd5"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r0 = 1
            if (r7 == r0) goto L62
            r0 = 2
            if (r7 == r0) goto L5f
            r0 = 3
            if (r7 == r0) goto L62
            r0 = 4
            if (r7 == r0) goto L5f
            r0 = 5
            if (r7 == r0) goto L62
            X.6qF r3 = X.EnumC172756qF.CUTSAME
        L25:
            com.ss.android.ugc.cut_ui.CutSource r1 = new com.ss.android.ugc.cut_ui.CutSource
            com.ss.android.ugc.cut_ui.CutSourceType r0 = com.ss.android.ugc.cut_ui.CutSourceType.URL
            r1.<init>(r9, r0)
            com.bytedance.ies.cutsame.cut_android.NLETemplateSource r2 = new com.bytedance.ies.cutsame.cut_android.NLETemplateSource
            r2.<init>(r5, r1, r10)
            X.Wfo r1 = new X.Wfo
            X.Wfh r0 = new X.Wfh
            r0.<init>(r5)
            r1.<init>(r0)
            r2.LJ(r1)
            X.HpI r0 = X.C45244HpI.LIZ
            com.bytedance.ies.nle.editor_jni.NLEModelDownloader r0 = r0.LIZ(r3)
            r2.LJI(r0)
            if (r6 == 0) goto L53
            X.6pQ r1 = new X.6pQ
            java.lang.String r0 = "UGCTemplate"
            r1.<init>(r0, r8, r7)
            r2.LJFF(r1)
        L53:
            X.6qG r0 = new X.6qG
            r0.<init>()
            r2.LIZ(r0)
            r2.LIZJ()
            return
        L5f:
            X.6qF r3 = X.EnumC172756qF.AUTOCUT
            goto L25
        L62:
            X.6qF r3 = X.EnumC172756qF.UGC
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172746qE.LIZ(android.content.Context, boolean, int, java.lang.String, java.lang.String, java.lang.String, X.6qI):void");
    }
}
