package Y;

import X.C121594pv;
import X.C122034qd;
import X.C141335gf;
import X.C17N;
import X.C3C5;
import X.C41090GAs;
import X.C41723GZb;
import X.C42557Gn3;
import X.C43622HAc;
import X.C43772HFw;
import X.C44422Hc2;
import X.C44687HgJ;
import X.C45049Hm9;
import X.C45125HnN;
import X.C45126HnO;
import X.C45128HnQ;
import X.C45146Hni;
import X.C62814Ol0;
import X.C68322mC;
import X.C73411SrX;
import X.C73893SzJ;
import X.C76800UCe;
import X.C78685UuP;
import X.EnumC123864ta;
import X.G66;
import X.G7K;
import X.G7X;
import X.H78;
import X.HGQ;
import X.InterfaceC42558Gn4;
import X.InterfaceC43623HAd;
import X.InterfaceC45141Hnd;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.ORZ;
import X.X1D;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse;
import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponseExtra;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.panel.model.CommentStickerPanelResponse;
import com.ss.android.ugc.aweme.panel.net.CommentStickerPanelRequestApi;
import com.ss.android.ugc.aweme.shortvideo.CheckTitleSensitivityResult;
import defpackage.t1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class AfS46S0300000_7 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS46S0300000_7 afS46S0300000_7, Object obj) {
        C73411SrX c73411SrX;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MvNetModule submitRequest throwable ");
        LIZ.append(H78.LJFF((Throwable) obj));
        LIZ.append(" errToast ");
        LIZ.append((String) ((C68322mC) afS46S0300000_7.l0).element);
        H78.LJII(X1D.LIZIZ(LIZ));
        ((InterfaceC43623HAd) afS46S0300000_7.l1).LIZIZ((String) ((C68322mC) afS46S0300000_7.l0).element, ((C43622HAc) afS46S0300000_7.l2).LJ);
        C73411SrX c73411SrX2 = ((C43622HAc) afS46S0300000_7.l2).LIZLLL;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = ((C43622HAc) afS46S0300000_7.l2).LIZLLL) != null) {
            c73411SrX.dispose();
        }
    }

    public static final void accept$1(AfS46S0300000_7 afS46S0300000_7, Object obj) {
        H78.LIZ("TitleSensitivity finish request in time");
        G7K g7k = (G7K) afS46S0300000_7.l0;
        g7k.LIZJ = (CheckTitleSensitivityResult) obj;
        g7k.LIZ();
        ((G66) afS46S0300000_7.l1).LJLJL.invoke();
        ((G66) afS46S0300000_7.l1).LJ((G7X) afS46S0300000_7.l2);
    }

    public static final void accept$2(AfS46S0300000_7 afS46S0300000_7, Object obj) {
        H78.LIZ("TitleSensitivity finish request in time");
        G7K g7k = (G7K) afS46S0300000_7.l0;
        g7k.LIZJ = (CheckTitleSensitivityResult) obj;
        g7k.LIZ();
        ((InterfaceC65784Pro) afS46S0300000_7.l1).invoke();
        ((InterfaceC65784Pro) afS46S0300000_7.l2).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS46S0300000_7 afS46S0300000_7, Object obj) {
        String str;
        String str2;
        Object LIZ;
        Object LIZ2;
        Object LIZ3;
        Object LIZ4;
        String str3;
        Object obj2;
        T t;
        String str4;
        String str5 = (String) obj;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("remove execId=");
        NLEModelRequestParams nLEModelRequestParams = (NLEModelRequestParams) afS46S0300000_7.l0;
        String str6 = null;
        if (nLEModelRequestParams != null) {
            str = SmartMovieJniJNI.NLEModelRequestParams_getExecId(nLEModelRequestParams.LIZ, nLEModelRequestParams);
        } else {
            str = null;
        }
        LIZ5.append(str);
        X1D.LIZIZ(LIZ5);
        Map<String, InterfaceC92693kP> map = ((C45125HnN) afS46S0300000_7.l1).LIZIZ;
        NLEModelRequestParams nLEModelRequestParams2 = (NLEModelRequestParams) afS46S0300000_7.l0;
        if (nLEModelRequestParams2 != null) {
            str2 = SmartMovieJniJNI.NLEModelRequestParams_getExecId(nLEModelRequestParams2.LIZ, nLEModelRequestParams2);
        } else {
            str2 = null;
        }
        map.remove(str2);
        NLEModelResponse nLEModelResponse = (NLEModelResponse) GsonProtectorUtils.fromJson(new Gson(), str5, NLEModelResponse.class);
        if (nLEModelResponse.statusCode == 0) {
            String str7 = nLEModelResponse.data;
            if (str7 == null || str7.length() == 0) {
                throw new C45128HnQ(nLEModelResponse, null, 2, null);
            }
            new o();
            try {
                LIZ = o.LIZ(nLEModelResponse.data).LJIIZILJ();
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            m mVar = (m) LIZ;
            if (mVar != null) {
                try {
                    j LJJIJ = mVar.LJIIZILJ().LJJIJ("nle_config_before_fix");
                    if (LJJIJ == null || (LIZ2 = LJJIJ.toString()) == null) {
                        LIZ2 = "";
                    }
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th2) {
                    LIZ2 = C141335gf.LIZ(th2);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = null;
                }
                String str8 = (String) LIZ2;
                if (str8 != null) {
                    try {
                        j LJJIJ2 = mVar.LJIIZILJ().LJJIJ("nle_config");
                        if (LJJIJ2 == null || (LIZ3 = LJJIJ2.toString()) == null) {
                            LIZ3 = "";
                        }
                        C3C5.m7constructorimpl(LIZ3);
                    } catch (Throwable th3) {
                        LIZ3 = C141335gf.LIZ(th3);
                        C3C5.m7constructorimpl(LIZ3);
                    }
                    if (C3C5.m12isFailureimpl(LIZ3)) {
                        LIZ3 = null;
                    }
                    String str9 = (String) LIZ3;
                    if (str9 != null) {
                        try {
                            j LJJIJ3 = mVar.LJIIZILJ().LJJIJ("nle_dual_version_mode");
                            if (LJJIJ3 == null || (LIZ4 = LJJIJ3.toString()) == null) {
                                LIZ4 = "";
                            }
                            C3C5.m7constructorimpl(LIZ4);
                        } catch (Throwable th4) {
                            LIZ4 = C141335gf.LIZ(th4);
                            C3C5.m7constructorimpl(LIZ4);
                        }
                        if (C3C5.m12isFailureimpl(LIZ4) || LIZ4 == null) {
                            throw new C45128HnQ(nLEModelResponse, null, 2, null);
                        }
                        if (kotlin.jvm.internal.o.LJ(LIZ4, "2")) {
                            str3 = str9;
                        } else {
                            str3 = str8;
                            str8 = str9;
                        }
                        if (C78685UuP.LJJJZ(str8)) {
                            if (str8.length() == 0) {
                                throw new C45128HnQ(nLEModelResponse, "");
                            }
                            NLEEditor nLEEditor = new NLEEditor();
                            nLEEditor.LJI(str8);
                            nLEEditor.LIZIZ();
                            nLEEditor.LIZJ();
                            NLEModel LJ = nLEEditor.LJ();
                            if (LJ.getMainTrack() == null) {
                                StringBuilder sb = new StringBuilder("AutoCutNLEModelDelegate checkAutoCutNLE: logId=");
                                NLEModelResponseExtra nLEModelResponseExtra = nLEModelResponse.extra;
                                if (nLEModelResponseExtra != null) {
                                    str4 = nLEModelResponseExtra.logId;
                                } else {
                                    str4 = null;
                                }
                                sb.append(str4);
                                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, sb.toString());
                            }
                            Iterator LIZJ = t1.LIZJ(LJ, "nleModel.tracks");
                            while (true) {
                                if (LIZJ.hasNext()) {
                                    obj2 = LIZJ.next();
                                    if (((NLETrack) obj2).LJIIZILJ() == EnumC123864ta.AUDIO) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            NLETrack nLETrack = (NLETrack) obj2;
                            if (nLETrack != null) {
                                LJ.removeTrack(nLETrack);
                            }
                            UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
                            C68322mC c68322mC = new C68322mC();
                            try {
                                if (mVar.LJIIZILJ().LJJIJLIJ("template_type")) {
                                    t = mVar.LJIIZILJ().LJJIJ("template_type").toString();
                                } else {
                                    t = 0;
                                }
                                c68322mC.element = t;
                                if (mVar.LJIIZILJ().LJJIJLIJ("template_group_id")) {
                                    str6 = mVar.LJIIZILJ().LJJIJ("template_group_id").toString();
                                }
                            } catch (RuntimeException unused) {
                            }
                            if (C78685UuP.LJJJZ((String) c68322mC.element)) {
                                unorderedMapStrStr.put("template_type", c68322mC.element);
                            }
                            if (C78685UuP.LJJJZ(str6)) {
                                unorderedMapStrStr.put("autocut_template_group_id", str6);
                            }
                            C45125HnN c45125HnN = (C45125HnN) afS46S0300000_7.l1;
                            c45125HnN.LIZ(LJ, new C45126HnO(mVar, unorderedMapStrStr, str3, (NLEModelRequestCallback) afS46S0300000_7.l2, c45125HnN, (NLEModelRequestParams) afS46S0300000_7.l0, nLEModelResponse, c68322mC, LJ));
                            return;
                        }
                        throw new C45128HnQ(nLEModelResponse, null);
                    }
                    throw new C45128HnQ(nLEModelResponse, null, 2, null);
                }
                throw new C45128HnQ(nLEModelResponse, null, 2, null);
            }
            throw new C45128HnQ(nLEModelResponse, null, 2, null);
        }
        throw new C45128HnQ(nLEModelResponse, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$4(Y.AfS46S0300000_7 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS46S0300000_7.accept$4(Y.AfS46S0300000_7, java.lang.Object):void");
    }

    public static final void accept$5(AfS46S0300000_7 afS46S0300000_7, Object obj) {
        String str;
        String str2 = (String) obj;
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((C68322mC) afS46S0300000_7.l0).element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTosDelegate getTosUrl success zipUrl=");
        LIZ.append(str2);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        CommonRequestCallback commonRequestCallback = (CommonRequestCallback) afS46S0300000_7.l1;
        if (commonRequestCallback != null) {
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
            commonRequestCallback.onSuccess(str);
        }
        InterfaceC45141Hnd interfaceC45141Hnd = ((C45146Hni) afS46S0300000_7.l2).LIZJ;
        if (interfaceC45141Hnd != null) {
            if (str2 == null) {
                str2 = "";
            }
            interfaceC45141Hnd.LJFF(0, null, str2, true);
        }
    }

    public static final void accept$6(AfS46S0300000_7 afS46S0300000_7, Object obj) {
        ((C43772HFw) afS46S0300000_7.l0).LJI((List) afS46S0300000_7.l1);
        ((HGQ) afS46S0300000_7.l2).onFinish(false);
        ((C43772HFw) afS46S0300000_7.l0).getClass();
        C44422Hc2.LIZJ();
        ((C43772HFw) afS46S0300000_7.l0).LJ();
    }

    public static final void accept$7(AfS46S0300000_7 afS46S0300000_7, Object obj) {
        InterfaceC88472Yns interfaceC88472Yns;
        Iterable it = (Iterable) obj;
        kotlin.jvm.internal.o.LJIIIIZZ(it, "it");
        List<TranslatedRegion> LJLL = ORZ.LJLL(it);
        C41090GAs.LIZ = LJLL;
        if (LJLL.isEmpty()) {
            T t = ((C68322mC) afS46S0300000_7.l0).element;
            if (t != 0 && (interfaceC88472Yns = (InterfaceC88472Yns) afS46S0300000_7.l2) != null) {
                interfaceC88472Yns.invoke(t);
                return;
            }
            return;
        }
        InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) afS46S0300000_7.l1;
        if (interfaceC88472Yns2 == null) {
            return;
        }
        interfaceC88472Yns2.invoke(C62814Ol0.LJIIIIZZ(C41090GAs.LIZ));
    }

    public static final void accept$8(AfS46S0300000_7 afS46S0300000_7, Object obj) {
        CommentStickerPanelResponse commentStickerPanelResponse = (CommentStickerPanelResponse) obj;
        Integer num = commentStickerPanelResponse.statusCode;
        if (num == null || num.intValue() != 0) {
            ((CommentStickerPanelRequestApi) afS46S0300000_7.l0).LIZIZ(2);
            ((C73893SzJ) afS46S0300000_7.l2).onNext(Boolean.FALSE);
        } else {
            ((CommentStickerPanelRequestApi) afS46S0300000_7.l0).LIZIZ(1);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS46S0300000_7.l1;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(commentStickerPanelResponse);
            }
            ((C73893SzJ) afS46S0300000_7.l2).onNext(Boolean.TRUE);
        }
        ((C73893SzJ) afS46S0300000_7.l2).onComplete();
    }

    public static final void accept$9(AfS46S0300000_7 afS46S0300000_7, Object obj) {
        C41723GZb c41723GZb = (C41723GZb) obj;
        C42557Gn3 c42557Gn3 = (C42557Gn3) afS46S0300000_7.l0;
        StickerItemModel stickerItemModel = c42557Gn3.LIZJ;
        stickerItemModel.path = c41723GZb.LIZ;
        InterfaceC42558Gn4 interfaceC42558Gn4 = (InterfaceC42558Gn4) afS46S0300000_7.l1;
        c42557Gn3.LJIIL = c41723GZb;
        if (c42557Gn3.LIZIZ || (C78685UuP.LJJJZ(stickerItemModel.uuid) && C44687HgJ.LIZIZ(c42557Gn3.LIZJ.path))) {
            c42557Gn3.LJIIJJI = c42557Gn3.LIZJ.uuid;
        } else {
            c42557Gn3.LJFF(c41723GZb, interfaceC42558Gn4.LIZIZ());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addStickerOnBitmapRender,xOffset:");
            LIZ.append(c42557Gn3.LJFF);
            LIZ.append(",yOffset:");
            LIZ.append(c42557Gn3.LJI);
            C42557Gn3.LJII(X1D.LIZIZ(LIZ));
            C121594pv c121594pv = new C121594pv(0);
            c121594pv.LJIIL = c41723GZb.LIZ;
            c121594pv.LJ = c42557Gn3.LJFF;
            c121594pv.LJFF = c42557Gn3.LJI;
            c121594pv.LJIILIIL = c41723GZb.LIZIZ / interfaceC42558Gn4.LIZIZ().getFirst().floatValue();
            c121594pv.LJIILJJIL = c41723GZb.LIZJ / interfaceC42558Gn4.LIZIZ().getSecond().floatValue();
            c121594pv.LIZIZ = c42557Gn3.LIZJ.layerWeight;
            C122034qd LJJI = C17N.LJJI(interfaceC42558Gn4.getEditor());
            if (LJJI != null) {
                String LJJJJIZL = LJJI.LJIIIIZZ().LJJJJIZL(c121594pv);
                c42557Gn3.LJIIJJI = LJJJJIZL;
                c42557Gn3.LIZJ.uuid = LJJJJIZL;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        ((InterfaceC65784Pro) afS46S0300000_7.l2).invoke();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS46S0300000_7(com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback r2, com.bytedance.ies.smartmovie.jni.NLEModelRequestParams r3, X.C45125HnN r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 3: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS46S0300000_7.<init>(com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback, com.bytedance.ies.smartmovie.jni.NLEModelRequestParams, X.HnN, int):void");
    }

    public AfS46S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS46S0300000_7(CommentStickerPanelRequestApi commentStickerPanelRequestApi, CommentStickerPanelRequestApi commentStickerPanelRequestApi2, int i, InterfaceC88472Yns<? super CommentStickerPanelResponse, C76800UCe> interfaceC88472Yns, C73893SzJ<Boolean> c73893SzJ) {
        this.$t = c73893SzJ;
        this.l0 = commentStickerPanelRequestApi;
        this.l1 = i;
        this.l2 = interfaceC88472Yns;
    }
}
