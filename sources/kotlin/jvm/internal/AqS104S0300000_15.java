package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C245649kW;
import X.C76800UCe;
import X.C77357UXp;
import X.C84418XBe;
import X.C84479XDn;
import X.C84540XFw;
import X.C86478Xwo;
import X.C86482Xws;
import X.C86507XxH;
import X.C96U;
import X.InterfaceC232729Bk;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.X5O;
import X.X5Q;
import X.X5V;
import X.X5W;
import X.XCT;
import X.XDR;
import X.XF5;
import X.Y00;
import X.Y03;
import X.Y0N;
import X.Y0S;
import X.Y0Y;
import X.Y1C;
import X.Y1Y;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionAssem;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPopupWindow;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import com.ss.android.ugc.aweme.ui.DubbingStatusAssem;
import com.ss.ugc.effectplatform.model.Effect;
import java.lang.ref.WeakReference;

/* loaded from: classes16.dex */
public class AqS104S0300000_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS104S0300000_15 aqS104S0300000_15) {
        ((DownloadTask) aqS104S0300000_15.l0).asyncDownload((X5O) aqS104S0300000_15.l1);
        X5Q x5q = (X5Q) aqS104S0300000_15.l2;
        Downloader downloader = Downloader.getInstance(x5q.LIZ);
        X5Q x5q2 = (X5Q) aqS104S0300000_15.l2;
        x5q.LIZIZ = downloader.getDownloadId(x5q2.LIZLLL, x5q2.LJ);
        X5V LIZ = X5W.LIZ();
        if (LIZ != null) {
            X5Q x5q3 = (X5Q) aqS104S0300000_15.l2;
            LIZ.LIZ.put(x5q3.LIZIZ, x5q3);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS104S0300000_15 aqS104S0300000_15) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view = (View) aqS104S0300000_15.l0;
        DubbingStatusAssem dubbingStatusAssem = (DubbingStatusAssem) aqS104S0300000_15.l1;
        if (view == dubbingStatusAssem.LLIIIZ && (objectAnimator2 = dubbingStatusAssem.LLIIII) != null) {
            objectAnimator2.cancel();
        }
        View view2 = (View) aqS104S0300000_15.l2;
        DubbingStatusAssem dubbingStatusAssem2 = (DubbingStatusAssem) aqS104S0300000_15.l1;
        if (view2 == dubbingStatusAssem2.LLIIIZ && (objectAnimator = dubbingStatusAssem2.LLIIII) != null) {
            objectAnimator.start();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS104S0300000_15 aqS104S0300000_15) {
        VideoCLACaptionViewModel r4 = ((VideoCLACaptionAssem) aqS104S0300000_15.l0).r4();
        ((VideoCLACaptionAssem) aqS104S0300000_15.l0).getContext();
        r4.zv0((InterfaceC232729Bk) ((VideoCLACaptionAssem) aqS104S0300000_15.l0).LLIIJLIL.getValue(), !r1.LIZIZ, new OSZ(Integer.valueOf(((C84540XFw) aqS104S0300000_15.l1).LIZ), ((C84540XFw) aqS104S0300000_15.l1).LIZLLL), ((Y0N) ((Y1Y) aqS104S0300000_15.l2)).LIZIZ, new AqS165S0100000_15((VideoCLACaptionAssem) aqS104S0300000_15.l0, 776));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r4 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r4 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AqS104S0300000_15 r7) {
        /*
            X.Xza r6 = new X.Xza
            java.lang.Object r0 = r7.l0
            com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView r0 = (com.ss.android.ugc.aweme.creatorcaption.FeedCaptionView) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r0.LJLLI
            java.lang.Object r4 = r7.l1
            X.9kW r4 = (X.C245649kW) r4
            r3 = 0
            if (r4 == 0) goto L30
            X.8qL r0 = r4.LJIIZILJ
            if (r0 == 0) goto L30
            java.lang.String r2 = r0.LIZJ
        L15:
            X.8qL r0 = r4.LJIIZILJ
            if (r0 == 0) goto L34
            java.lang.String r1 = r0.LIZIZ
        L1b:
            X.8qL r0 = r4.LJIIZILJ
            if (r0 == 0) goto L21
            java.lang.String r3 = r0.LIZ
        L21:
            java.lang.Object r0 = r7.l2
            android.content.Context r0 = (android.content.Context) r0
            X.M89 r0 = X.C2S6.LIZ(r0)
            r0.getPageType()
            r6.<init>(r5, r2, r1, r3)
            return r6
        L30:
            r2 = r3
            if (r4 == 0) goto L34
            goto L15
        L34:
            r1 = r3
            if (r4 == 0) goto L21
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS104S0300000_15.invoke$11(kotlin.jvm.internal.AqS104S0300000_15):java.lang.Object");
    }

    public static final Object invoke$12(AqS104S0300000_15 aqS104S0300000_15) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view = (View) aqS104S0300000_15.l0;
        TranslationStatusAssem translationStatusAssem = (TranslationStatusAssem) ((C96U) aqS104S0300000_15.l1);
        if (view == translationStatusAssem.LLFZ && (objectAnimator2 = translationStatusAssem.LLIIII) != null) {
            objectAnimator2.cancel();
        }
        View view2 = (View) aqS104S0300000_15.l2;
        TranslationStatusAssem translationStatusAssem2 = (TranslationStatusAssem) ((C96U) aqS104S0300000_15.l1);
        if (view2 == translationStatusAssem2.LLFZ && (objectAnimator = translationStatusAssem2.LLIIII) != null) {
            objectAnimator.start();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS104S0300000_15 aqS104S0300000_15) {
        XDR xdr = (XDR) aqS104S0300000_15.l1;
        if (xdr != null) {
            xdr.onSuccess((Effect) aqS104S0300000_15.l2);
        }
        C84479XDn c84479XDn = (C84479XDn) aqS104S0300000_15.l0;
        c84479XDn.LJI.LJJJ.LIZJ(c84479XDn.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS104S0300000_15 aqS104S0300000_15) {
        XDR xdr = (XDR) aqS104S0300000_15.l1;
        if (xdr != null) {
            xdr.onFail(((C84479XDn) aqS104S0300000_15.l0).LJII, (C84418XBe) aqS104S0300000_15.l2);
        }
        C84479XDn c84479XDn = (C84479XDn) aqS104S0300000_15.l0;
        c84479XDn.LJI.LJJJ.LIZJ(c84479XDn.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r4 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AqS104S0300000_15 r6) {
        /*
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            r5 = 0
            if (r0 != 0) goto L15
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment r0 = (com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment) r0
            X.1FM r0 = r0.LLI
            if (r0 == 0) goto L12
            r0.setStickerPath(r5)
        L12:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L15:
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment r0 = (com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment) r0
            X.1FM r2 = r0.LLI
            if (r2 == 0) goto L38
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            java.lang.String r0 = r0.getUnzipPath()
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.setStickerPath(r0)
        L38:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            java.lang.String r0 = r0.getExtra()
            if (r0 == 0) goto L55
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L48
            r1.<init>(r0)     // Catch: java.lang.Exception -> L48
            goto L4d
        L48:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L4d:
            java.lang.String r0 = "textureKey"
            java.lang.String r4 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: java.lang.Throwable -> L12
            if (r4 != 0) goto L57
        L55:
            java.lang.String r4 = "RENDER_COVER"
        L57:
            java.lang.Object r3 = r6.l2     // Catch: java.lang.Throwable -> L12
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r6.l1     // Catch: java.lang.Throwable -> L12
            com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment r0 = (com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment) r0     // Catch: java.lang.Throwable -> L12
            com.ss.android.ugc.aweme.feed.model.PodcastInfo r0 = r0.LLIIJI     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.feed.model.PodcastUrlModel r5 = r0.getCover()     // Catch: java.lang.Throwable -> L12
        L67:
            kotlin.jvm.internal.AqS68S1100000_15 r2 = new kotlin.jvm.internal.AqS68S1100000_15     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r6.l1     // Catch: java.lang.Throwable -> L12
            com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment r1 = (com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment) r1     // Catch: java.lang.Throwable -> L12
            r0 = 7
            r2.<init>(r1, r4, r0)     // Catch: java.lang.Throwable -> L12
            X.C84492XEa.LIZ(r3, r5, r2)     // Catch: java.lang.Throwable -> L12
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS104S0300000_15.invoke$4(kotlin.jvm.internal.AqS104S0300000_15):java.lang.Object");
    }

    public static final Object invoke$5(AqS104S0300000_15 aqS104S0300000_15) {
        InnerPushPopupWindow innerPushPopupWindow;
        int i;
        WeakReference<InnerPushPopupWindow> weakReference;
        InnerPushPopupWindow innerPushPopupWindow2;
        WeakReference<InnerPushPopupWindow> weakReference2 = ((C86507XxH) aqS104S0300000_15.l0).LIZ;
        if (weakReference2 != null && (innerPushPopupWindow = weakReference2.get()) != null) {
            InnerPushMessage innerPushMessage = innerPushPopupWindow.LJLILLLLZI;
            if (innerPushMessage != null) {
                i = innerPushMessage.getType();
            } else {
                i = 0;
            }
            if (i == ((InnerPushMessage) aqS104S0300000_15.l1).getType() && (weakReference = ((C86507XxH) aqS104S0300000_15.l0).LIZ) != null && (innerPushPopupWindow2 = weakReference.get()) != null) {
                InnerPushMessage message = (InnerPushMessage) aqS104S0300000_15.l1;
                int[] areas = (int[]) aqS104S0300000_15.l2;
                o.LJIIIZ(message, "message");
                o.LJIIIZ(areas, "areas");
                C86482Xws c86482Xws = innerPushPopupWindow2.LJLJJI;
                if (c86482Xws != null) {
                    for (int i2 : areas) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    C86478Xwo.LIZIZ("inner_push_platform", "updateView error: area is invalid");
                                } else {
                                    c86482Xws.LJLLI.bindContent(message);
                                    c86482Xws.LJLJJL.setVisibility(c86482Xws.LJLLI.getVisibility());
                                }
                            } else {
                                c86482Xws.LJLL.bindContent(message);
                            }
                        } else {
                            c86482Xws.LJLJLLL.bindContent(message);
                        }
                    }
                    c86482Xws.LIZJ();
                }
                innerPushPopupWindow2.LJLJI.LIZJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS104S0300000_15 aqS104S0300000_15) {
        String str;
        String LIZJ = ((NLELokiResourceProtocol) aqS104S0300000_15.l0).LIZJ();
        o.LJIIIIZZ(LIZJ, "lokiResourceProtocol.effectId");
        XCT xct = ((XF5) aqS104S0300000_15.l1).LIZ;
        if (xct != null && xct.LJIIL((Effect) aqS104S0300000_15.l2)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C77357UXp.LJJJ(LIZJ, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS104S0300000_15 aqS104S0300000_15) {
        String str;
        String LIZJ = ((NLELokiResourceProtocol) aqS104S0300000_15.l0).LIZJ();
        o.LJIIIIZZ(LIZJ, "lokiResourceProtocol.effectId");
        if (((XF5) aqS104S0300000_15.l1).LIZ.LJIIL((Effect) aqS104S0300000_15.l2)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C77357UXp.LJJJ(LIZJ, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS104S0300000_15 aqS104S0300000_15) {
        return new Y0S((Context) aqS104S0300000_15.l0, (Y1C) aqS104S0300000_15.l1, (Y00) aqS104S0300000_15.l2);
    }

    public static final Object invoke$9(AqS104S0300000_15 aqS104S0300000_15) {
        VideoCLACaptionViewModel r4 = ((VideoCLACaptionAssem) aqS104S0300000_15.l0).r4();
        ((VideoCLACaptionAssem) aqS104S0300000_15.l0).getContext();
        r4.zv0((InterfaceC232729Bk) ((VideoCLACaptionAssem) aqS104S0300000_15.l0).LLIIJLIL.getValue(), true, new OSZ(Integer.valueOf(((C84540XFw) aqS104S0300000_15.l1).LIZ), ((C84540XFw) aqS104S0300000_15.l1).LIZLLL), ((Y0Y) ((Y1Y) aqS104S0300000_15.l2)).LIZIZ, new AqS165S0100000_15((VideoCLACaptionAssem) aqS104S0300000_15.l0, 775));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(C84479XDn c84479XDn, XDR xdr, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84479XDn;
        this.l1 = xdr;
        this.l2 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(C84479XDn c84479XDn, XDR xdr, Effect effect, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84479XDn;
        this.l1 = xdr;
        this.l2 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(C86507XxH c86507XxH, InnerPushMessage innerPushMessage, int[] iArr, int i) {
        super(0);
        this.$t = i;
        this.l0 = c86507XxH;
        this.l1 = innerPushMessage;
        this.l2 = iArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(Context context, Y03 y03, Y00 y00, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = y03;
        this.l2 = y00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(View view, View view2, C96U c96u, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = c96u;
        this.l2 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(View view, DubbingStatusAssem dubbingStatusAssem, View view2, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = dubbingStatusAssem;
        this.l2 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(NLELokiResourceProtocol nLELokiResourceProtocol, XF5 xf5, Effect effect, int i) {
        super(0);
        this.$t = i;
        this.l0 = nLELokiResourceProtocol;
        this.l1 = xf5;
        this.l2 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(DownloadTask downloadTask, X5O x5o, X5Q x5q, int i) {
        super(0);
        this.$t = i;
        this.l0 = downloadTask;
        this.l1 = x5o;
        this.l2 = x5q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(VideoCLACaptionAssem videoCLACaptionAssem, C84540XFw c84540XFw, Y1Y y1y, int i) {
        super(0);
        this.$t = i;
        this.l0 = videoCLACaptionAssem;
        this.l1 = c84540XFw;
        this.l2 = y1y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(FeedCaptionView feedCaptionView, C245649kW c245649kW, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = feedCaptionView;
        this.l1 = c245649kW;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS104S0300000_15(com.ss.android.ugc.effectmanager.effect.model.Effect effect, FullEpisodeDetailFragment fullEpisodeDetailFragment, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = effect;
        this.l1 = fullEpisodeDetailFragment;
        this.l2 = context;
    }
}
