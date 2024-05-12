package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C0I6;
import X.C164106cI;
import X.C16880lQ;
import X.C188727au;
import X.C42506GmE;
import X.C42509GmH;
import X.C43703HDf;
import X.C43722HDy;
import X.C44739Hh9;
import X.C44832Hie;
import X.C45804HyK;
import X.C45828Hyi;
import X.C45829Hyj;
import X.C46127I8l;
import X.C46144I9c;
import X.C46145I9d;
import X.C46149I9h;
import X.C46150I9i;
import X.C46151I9j;
import X.C46152I9k;
import X.C46159I9r;
import X.C46163I9v;
import X.C46164I9w;
import X.C46165I9x;
import X.C46172IAe;
import X.C72209SVp;
import X.C76800UCe;
import X.C77413UZt;
import X.C78897Uxp;
import X.C78915Uy7;
import X.EnumC42507GmF;
import X.H9C;
import X.HNU;
import X.HPQ;
import X.HPU;
import X.HRO;
import X.HSS;
import X.HST;
import X.HXO;
import X.I9K;
import X.I9T;
import X.IAK;
import X.IAL;
import X.InterfaceC41450GOo;
import X.InterfaceC46131I8p;
import X.InterfaceC65784Pro;
import X.InterfaceC82548WaW;
import X.InterfaceC88472Yns;
import X.Q7K;
import X.WRQ;
import Y.AObjectS117S0200000_7;
import Y.AObserverS71S0200000_7;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.share.ShareRespSendServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class AqS53S0400000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$3(AqS53S0400000_7 aqS53S0400000_7, Object obj) {
        aqS53S0400000_7.invoke$1((C0I6) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$4(AqS53S0400000_7 aqS53S0400000_7, Object obj) {
        aqS53S0400000_7.invoke$2((C0I6) obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(C46144I9c $receiver) {
        o.LJIIIZ($receiver, "$this$$receiver");
        C46145I9d c46145I9d = new C46145I9d();
        c46145I9d.LIZ = new C46150I9i((ShortVideoContext) this.l2);
        $receiver.LIZ = c46145I9d;
        $receiver.LIZIZ = new C46151I9j(C44739Hh9.LJI(false), C44739Hh9.LJII(), Q7K.LIZIZ("record_bitrate_mode", 1), IAL.LIZ());
        C46163I9v c46163I9v = C46163I9v.LJLIL;
        o.LJIIIZ(c46163I9v, "<set-?>");
        $receiver.LIZLLL = c46163I9v;
        C46152I9k c46152I9k = C46152I9k.LJLIL;
        o.LJIIIZ(c46152I9k, "<set-?>");
        $receiver.LJIIJ = c46152I9k;
        o.LJIIIIZZ(C16880lQ.LLLLLILLIL((ActivityC45651qj) this.l0), "activity.applicationContext");
        $receiver.LJ = new C77413UZt();
        I9K i9k = I9K.LJLIL;
        o.LJIIIZ(i9k, "<set-?>");
        $receiver.LJFF = i9k;
        $receiver.LJI = new C46159I9r(new C46149I9h((WRQ) this.l1));
        $receiver.LJII = true;
        C46164I9w c46164I9w = C46164I9w.LJLIL;
        o.LJIIIZ(c46164I9w, "<set-?>");
        $receiver.LJIILIIL = c46164I9w;
        $receiver.LJIIIIZZ = new C46172IAe((WRQ) this.l1, (ShortVideoContext) this.l2);
        $receiver.LJIIIZ = new IAK((WRQ) this.l1);
        C46165I9x c46165I9x = C46165I9x.LJLIL;
        o.LJIIIZ(c46165I9x, "<set-?>");
        $receiver.LJIILIIL = c46165I9x;
        $receiver.LJIILLIIL = C44832Hie.LIZ();
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l3;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke($receiver);
        }
    }

    public final void invoke$1(HNU it) {
        o.LJIIIZ(it, "it");
        HNU hnu = it;
        hnu.zu().observe((LifecycleOwner) this.l0, new AObserverS71S0200000_7((C46127I8l) this.l2, (C164106cI) this.l3, 2));
        ViewGroup viewGroup = (ViewGroup) this.l1;
        if (viewGroup != null) {
            hnu.dc0(viewGroup);
        }
    }

    public final void invoke$2(InterfaceC46131I8p it) {
        o.LJIIIZ(it, "it");
        InterfaceC46131I8p interfaceC46131I8p = it;
        interfaceC46131I8p.ob().LIZLLL((LifecycleOwner) this.l0, new AObjectS117S0200000_7((C46127I8l) this.l2, (FrameLayout) this.l3, 5));
        ViewGroup viewGroup = (ViewGroup) this.l1;
        if (viewGroup != null) {
            interfaceC46131I8p.ye0(viewGroup);
        }
    }

    public final void invoke$3(AnchorCommonStruct withAnchor) {
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        Context context = ((ViewGroup) this.l0).getContext();
        o.LJIIIIZZ(context, "parent.context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bbj, null, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem");
        C72209SVp c72209SVp = (C72209SVp) LLLLIILL;
        HSS hss = (HSS) this.l1;
        C188727au c188727au = (C188727au) this.l2;
        Dialog dialog = (Dialog) this.l3;
        UrlModel thumbnail = withAnchor.getThumbnail();
        if (thumbnail != null) {
            c72209SVp.setIcon(thumbnail);
        }
        hss.LJJJJ(c72209SVp);
        c72209SVp.setSubTitle(withAnchor.getDescription());
        C16880lQ.LJIIJ(new HST(hss, c188727au, dialog), c72209SVp);
        ((ViewGroup) this.l0).addView(c72209SVp);
    }

    public final void invoke$4(ClosingChooseMediaPageState it) {
        o.LJIIIZ(it, "it");
        if (o.LJ(it, ClosingChooseMediaPageState.Closed.INSTANCE)) {
            ((HXO) this.l0).LIZIZ();
            C16880lQ.LJLLLL((FrameLayout) this.l2, (FrameLayout) this.l1);
            C78897Uxp.LJJJJ((HRO) this.l3).remove((HRO) this.l3);
        }
    }

    public static final Object invoke$0(AqS53S0400000_7 aqS53S0400000_7, Object obj) {
        Effect effect;
        InterfaceC82548WaW templateData = (InterfaceC82548WaW) obj;
        o.LJIIIZ(templateData, "templateData");
        HPQ hpq = (HPQ) aqS53S0400000_7.l0;
        RecordConfig recordConfig = (RecordConfig) aqS53S0400000_7.l1;
        hpq.getClass();
        Intent LIZ = HPU.LIZ(recordConfig);
        if (templateData instanceof CutsameDataItem) {
            LIZ.putExtra("extra_cutsame_reuse_id", ((StickerDownloadConfig) aqS53S0400000_7.l2).getStickerId());
        } else if ((templateData instanceof MvThemeData) && (effect = ((MvThemeData) templateData).effect) != null) {
            LIZ.putExtra("reuse_mvtheme_enter", true);
            LIZ.putExtra("extra_bind_mv_id", effect.getEffectId());
            LIZ.putExtra("extra_mv_effect", (Parcelable) effect);
        }
        InterfaceC65784Pro<C76800UCe> onSuccess = ((StickerDownloadConfig) aqS53S0400000_7.l2).getOnSuccess();
        if (onSuccess != null) {
            onSuccess.invoke();
        }
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getShieldTemplateExp()) {
            Activity LJIJJ = C45804HyK.LJIJJ((Context) aqS53S0400000_7.l3);
            if (LJIJJ != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(R.string.ijy);
                creativeToastBuilder.iconColor(R.attr.eb);
                creativeToastBuilder.duration(3000L);
                C78915Uy7.LJJIIZI(LJIJJ, 3053, creativeToastBuilder);
            }
        } else {
            I9T.LJFF(null);
            ((HPQ) aqS53S0400000_7.l0).LIZ.LJFF();
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity((Context) aqS53S0400000_7.l3, LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS53S0400000_7 aqS53S0400000_7, Object it) {
        o.LJIIIZ(it, "it");
        Activity activity = (Activity) aqS53S0400000_7.l0;
        C43722HDy c43722HDy = (C43722HDy) aqS53S0400000_7.l3;
        String str = c43722HDy.mClientKey;
        C45828Hyi c45828Hyi = C45828Hyi.LJIILL;
        C45829Hyj.LIZIZ("green_screen_kit", str, c45828Hyi, c43722HDy.mShareMediaType);
        ShareRespSendServiceImpl.LJ().LIZJ(activity, c43722HDy, c45828Hyi);
        C43703HDf c43703HDf = (C43703HDf) aqS53S0400000_7.l1;
        ShareKitPanel shareKitPanel = (ShareKitPanel) aqS53S0400000_7.l2;
        c43703HDf.getClass();
        C43703HDf.LIZJ(false, shareKitPanel);
        ((Activity) aqS53S0400000_7.l0).finish();
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS53S0400000_7 aqS53S0400000_7, Object obj) {
        aqS53S0400000_7.invoke$0((C46144I9c) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AqS53S0400000_7 aqS53S0400000_7, Object obj) {
        aqS53S0400000_7.invoke$3((AnchorCommonStruct) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AqS53S0400000_7 aqS53S0400000_7, Object obj) {
        aqS53S0400000_7.invoke$4((ClosingChooseMediaPageState) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS53S0400000_7 aqS53S0400000_7, Object it) {
        o.LJIIIZ(it, "it");
        boolean LJ = o.LJ(((LiveData) ((C42509GmH) aqS53S0400000_7.l0).LJ.getValue()).getValue(), Boolean.TRUE);
        new H9C().LJIIJ((Mission) aqS53S0400000_7.l1, LJ, EnumC42507GmF.POST);
        C42506GmE c42506GmE = (C42506GmE) aqS53S0400000_7.l2;
        ((Keva) c42506GmE.LJLJJI.getValue()).storeBoolean((String) c42506GmE.LJLJI.LIZ(c42506GmE, C42506GmE.LJLJJL[1]), LJ);
        ((InterfaceC41450GOo) aqS53S0400000_7.l3).LIZIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS53S0400000_7 aqS53S0400000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.i58, new AqS53S0400000_7((C42509GmH) aqS53S0400000_7.l0, (Mission) aqS53S0400000_7.l1, (C42506GmE) aqS53S0400000_7.l2, (InterfaceC41450GOo) aqS53S0400000_7.l3, 7));
        actionGroup.LJIIIIZZ(R.string.i57, new AqS111S0300000_7((Mission) aqS53S0400000_7.l1, (C42509GmH) aqS53S0400000_7.l0, (InterfaceC41450GOo) aqS53S0400000_7.l3, 39));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS53S0400000_7(ActivityC45651qj activityC45651qj, ActivityC45651qj activityC45651qj2, WRQ wrq, ShortVideoContext shortVideoContext, InterfaceC88472Yns<? super C46144I9c, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.l0 = activityC45651qj;
        this.l1 = activityC45651qj2;
        this.l2 = wrq;
        this.l3 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0400000_7(C42509GmH c42509GmH, Mission mission, C42506GmE c42506GmE, InterfaceC41450GOo interfaceC41450GOo, int i) {
        super(1);
        this.$t = i;
        this.l0 = c42509GmH;
        this.l1 = mission;
        this.l2 = c42506GmE;
        this.l3 = interfaceC41450GOo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0400000_7(HXO hxo, FrameLayout frameLayout, FrameLayout frameLayout2, HRO hro, int i) {
        super(1);
        this.$t = i;
        this.l0 = hxo;
        this.l1 = frameLayout;
        this.l2 = frameLayout2;
        this.l3 = hro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0400000_7(Activity activity, C43703HDf c43703HDf, ShareKitPanel shareKitPanel, C43722HDy c43722HDy, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = c43703HDf;
        this.l2 = shareKitPanel;
        this.l3 = c43722HDy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0400000_7(Context context, HPQ hpq, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig, int i) {
        super(1);
        this.$t = i;
        this.l0 = hpq;
        this.l1 = recordConfig;
        this.l2 = stickerDownloadConfig;
        this.l3 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0400000_7(ViewGroup viewGroup, HSS hss, C188727au c188727au, Dialog dialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = hss;
        this.l2 = c188727au;
        this.l3 = dialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0400000_7(LifecycleOwner lifecycleOwner, ViewGroup viewGroup, C46127I8l c46127I8l, C164106cI c164106cI, int i) {
        super(1);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = viewGroup;
        this.l2 = c46127I8l;
        this.l3 = c164106cI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S0400000_7(LifecycleOwner lifecycleOwner, ViewGroup viewGroup, C46127I8l c46127I8l, FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = viewGroup;
        this.l2 = c46127I8l;
        this.l3 = frameLayout;
    }
}
