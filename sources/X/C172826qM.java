package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.6qM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172826qM {
    public final Activity LIZ;
    public final CutsameDataItem LIZIZ;
    public final ShortVideoContext LIZJ;

    public final C76800UCe LIZ() {
        String str;
        if (!this.LIZ.isFinishing()) {
            C45244HpI c45244HpI = C45244HpI.LIZ;
            c45244HpI.LIZIZ(new AqS157S0100000_7(this, 615));
            C172656q5.LIZIZ();
            NLETemplateSource nLETemplateSource = new NLETemplateSource(this.LIZ, new CutSource(this.LIZIZ.templateUrl, CutSourceType.URL), this.LIZIZ.md5);
            CutsameDataItem cutsameDataItem = this.LIZIZ;
            if (cutsameDataItem != null) {
                C173046qi.LIZ = new WeakReference<>(cutsameDataItem);
            }
            ShortVideoContext shortVideoContext = this.LIZJ;
            if (shortVideoContext != null) {
                C173046qi.LIZIZ = new WeakReference<>(shortVideoContext);
            }
            final C173166qu c173166qu = new C173166qu(this.LIZJ.LJI(), this.LIZJ.shootWay, this.LIZIZ.templateId, 15);
            final long currentTimeMillis = System.currentTimeMillis();
            nLETemplateSource.LJ(new C82876Wfo(new C82869Wfh(this.LIZ)));
            nLETemplateSource.LJI(c45244HpI.LIZ(EnumC172756qF.CUTSAME));
            final ShortVideoContext shortVideoContext2 = this.LIZJ;
            nLETemplateSource.LJFF(new BinderC172046p6(shortVideoContext2) { // from class: X.6qo
                public final C173166qu LJLILLLLZI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("cutsame.tiktok");
                    String str2;
                    o.LJIIIZ(shortVideoContext2, "shortContext");
                    String LJI = shortVideoContext2.LJI();
                    String str3 = shortVideoContext2.shootWay;
                    CutsameDataItem LIZIZ = C173046qi.LIZIZ();
                    if (LIZIZ != null) {
                        str2 = LIZIZ.templateId;
                    } else {
                        str2 = null;
                    }
                    this.LJLILLLLZI = new C173166qu(LJI, str3, String.valueOf(str2), 15);
                }

                /* JADX WARN: Removed duplicated region for block: B:112:0x0066 A[Catch: Exception -> 0x006e, TryCatch #2 {Exception -> 0x006e, blocks: (B:94:0x001f, B:97:0x002d, B:98:0x0031, B:100:0x0041, B:101:0x0045, B:103:0x004d, B:106:0x0056, B:108:0x005c, B:110:0x0061, B:112:0x0066, B:113:0x006a), top: B:93:0x001f }] */
                @Override // com.ss.android.ugc.cut_reportor_interface.ICutReporter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void report(int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
                    /*
                        Method dump skipped, instructions count: 958
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.BinderC173106qo.report(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
                }
            });
            nLETemplateSource.LIZ(new NLEPrepareListener() { // from class: X.6qq
                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onProgress(float f, String str2) {
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onSuccess(NLETemplateModel nLETemplateModel) {
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                    C173166qu LIZ = C173166qu.this.LIZ();
                    LIZ.LIZLLL = System.currentTimeMillis() - currentTimeMillis;
                    CutsameDataItem cutsameDataItem2 = this.LIZIZ;
                    C173156qt.LJFF(LIZ, cutsameDataItem2.templateUrl, String.valueOf(cutsameDataItem2.md5), C78855Ux9.LJLJL);
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onError(int i, String str2) {
                    C173166qu LIZ = C173166qu.this.LIZ();
                    LIZ.LIZLLL = System.currentTimeMillis() - currentTimeMillis;
                    LIZ.LIZ = 1;
                    LIZ.LIZIZ = i;
                    if (str2 == null) {
                        str2 = "";
                    }
                    LIZ.LIZJ = str2;
                    CutsameDataItem cutsameDataItem2 = this.LIZIZ;
                    C173156qt.LJFF(LIZ, cutsameDataItem2.templateUrl, String.valueOf(cutsameDataItem2.md5), C78855Ux9.LJLJL);
                }
            });
            nLETemplateSource.LIZJ();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_short_video_context", this.LIZJ);
            bundle.putInt("key_choose_scene", 6);
            bundle.putParcelable("Key_cutsame_item", this.LIZIZ);
            ArrayList<String> arrayList = this.LIZIZ.challengeIds;
            if (arrayList != null && (str = (String) ORZ.LJLLLL(arrayList)) != null) {
                bundle.putString("Key_challenge_id", str);
            }
            bundle.putParcelableArrayList("arg_data_process_items", C172266pS.LIZ(this.LIZIZ.extra));
            bundle.putString("picker_mode", EnumC172856qP.MULTI.name());
            HJ9.LIZJ(this.LIZ, bundle, 10113);
        }
        return C76800UCe.LIZ;
    }

    public C172826qM(Activity activity, CutsameDataItem cutSameItem, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cutSameItem, "cutSameItem");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = activity;
        this.LIZIZ = cutSameItem;
        this.LIZJ = shortVideoContext;
    }
}
