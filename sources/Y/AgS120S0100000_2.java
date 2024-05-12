package Y;

import X.ActivityC45651qj;
import X.AnonymousClass679;
import X.AnonymousClass699;
import X.C10I;
import X.C10K;
import X.C122024qc;
import X.C122034qd;
import X.C123744tO;
import X.C139875eJ;
import X.C142185i2;
import X.C150345vC;
import X.C153075zb;
import X.C1556669a;
import X.C1556769b;
import X.C1557269g;
import X.C1557369h;
import X.C1558669u;
import X.C156086Aq;
import X.C156426By;
import X.C156526Ci;
import X.C156626Cs;
import X.C156636Ct;
import X.C156666Cw;
import X.C157426Fu;
import X.C161516Vn;
import X.C163186ao;
import X.C163236at;
import X.C16880lQ;
import X.C170606mm;
import X.C17N;
import X.C26227ARb;
import X.C39579Fg7;
import X.C44384HbQ;
import X.C44687HgJ;
import X.C5MG;
import X.C5S1;
import X.C66T;
import X.C67A;
import X.C67E;
import X.C67H;
import X.C67J;
import X.C67P;
import X.C6BX;
import X.C6ID;
import X.C6IE;
import X.C6IG;
import X.C76800UCe;
import X.C78841Uwv;
import X.C84939XVf;
import X.GSU;
import X.H5E;
import X.H5F;
import X.H78;
import X.InterfaceC126004x2;
import X.InterfaceC141565h2;
import X.InterfaceC169156kR;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.ProgressDialogC164766dM;
import X.UC0;
import X.V1M;
import X.X1D;
import X.XRT;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.internal.ShoutOutServiceImpl;
import com.ss.android.ugc.aweme.kids.music.model.MusicList;
import com.ss.android.ugc.aweme.mediaplayer.MediaPlayerModule;
import com.ss.android.ugc.aweme.qasticker.permission.AllowUserToQuestionResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity;
import com.ss.android.ugc.aweme.shoutouts.ShoutoutPrice;
import com.ss.android.ugc.aweme.shoutouts.network.CheckWalletResponse;
import com.ss.android.ugc.aweme.shoutouts.network.ShoutoutsGetListResponse;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.draft.music.DraftOnlineMusicProcessor;
import com.ss.android.ugc.aweme.tools.draft.music.DraftSoundEffectProcessor;
import com.ss.android.ugc.aweme.tools.draft.music.DraftStreamMusicProcessor;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AgS120S0100000_2 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            case 7:
                return then$7(this, c10k);
            case 8:
                return then$8(this, c10k);
            case 9:
                return then$9(this, c10k);
            case 10:
                return then$10(this, c10k);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return then$11(this, c10k);
            case 12:
                return then$12(this, c10k);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return then$13(this, c10k);
            case 14:
                return then$14(this, c10k);
            case 15:
                return then$15(this, c10k);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return then$16(this, c10k);
            case 17:
                return then$17(this, c10k);
            case 18:
                return then$18(this, c10k);
            case 19:
                return then$19(this, c10k);
            case 20:
                return then$20(this, c10k);
            case 21:
                return then$21(this, c10k);
            case 22:
                return then$22(this, c10k);
            case 23:
                return then$23(this, c10k);
            case 24:
                return then$24(this, c10k);
            case 25:
                return then$25(this, c10k);
            case 26:
                return then$26(this, c10k);
            case 27:
                return then$27(this, c10k);
            case 28:
                return then$28(this, c10k);
            case 29:
                return then$29(this, c10k);
            case 30:
                return then$30(this, c10k);
            case 31:
                return then$31(this, c10k);
            case 32:
                return then$32(this, c10k);
            case 33:
                return then$33(this, c10k);
            case 34:
                return then$34(this, c10k);
            case 35:
                return then$35(this, c10k);
            case 36:
                return then$36(this, c10k);
            case 37:
                return then$37(this, c10k);
            case 38:
                return then$38(this, c10k);
            case 39:
                return then$39(this, c10k);
            default:
                return null;
        }
    }

    public AgS120S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        C1558669u LJ = ((C157426Fu) agS120S0100000_2.l0).LJLL.LJ();
        C67J c67j = (C67J) c10k.LJIIJJI();
        if (c67j != null) {
            return new C6BX(LJ, c67j);
        }
        return null;
    }

    public static final Object then$1(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        if (c10k.LJIILIIL() && c10k.LJIIJJI() != null) {
            C142185i2 c142185i2 = C142185i2.INSTANCE;
            String str = ((MyMediaModel) agS120S0100000_2.l0).fileLocalUriPath;
            o.LJIIIIZZ(str, "mediaModel.fileLocalUriPath");
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJI(LJIIJJI);
            c142185i2.put(str, LJIIJJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$10(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        C1556669a c1556669a = (C1556669a) agS120S0100000_2.l0;
        c1556669a.getClass();
        C67A c67a = null;
        if (c10k.LJIIJJI() == null) {
            return null;
        }
        C156086Aq c156086Aq = ((C1557369h) c1556669a.LJLL).LLIIIZ;
        if (c156086Aq != null) {
            c67a = c156086Aq.LJIJ();
        }
        return new AnonymousClass679(c67a, (C67J) c10k.LJIIJJI());
    }

    public static final Object then$11(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        ((Runnable) agS120S0100000_2.l0).run();
        return C76800UCe.LIZ;
    }

    public static final Object then$12(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        Bundle bundle;
        VideoEditContainerScene u = ((C139875eJ) agS120S0100000_2.l0).u();
        if (u != null) {
            bundle = u.LLJILJILJ();
        } else {
            bundle = new Bundle();
        }
        VideoPublishEditModel LLZZJLIL = ((C139875eJ) agS120S0100000_2.l0).LLZZJLIL();
        C139875eJ c139875eJ = (C139875eJ) agS120S0100000_2.l0;
        long j = c139875eJ.LLLL;
        long j2 = c139875eJ.LLLLIIIILLL;
        long j3 = ((C139875eJ) agS120S0100000_2.l0).LLLLIIL;
        C139875eJ c139875eJ2 = (C139875eJ) agS120S0100000_2.l0;
        H5E.LIZ(bundle, LLZZJLIL, j, j2, j3, new H5F(c139875eJ2.LLLLII, c139875eJ2.LLLLIILLL, c139875eJ2.LLLLILI, c139875eJ2.LLLLIL, c139875eJ2.LLLLJI));
        return C76800UCe.LIZ;
    }

    public static final Object then$13(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        boolean z;
        MediaPlayerModule mediaPlayerModule = (MediaPlayerModule) agS120S0100000_2.l0;
        mediaPlayerModule.getClass();
        int intValue = ((Integer) c10k.LJIIJJI()).intValue();
        MutableLiveData<C170606mm> mutableLiveData = mediaPlayerModule.LJLJLJ;
        if (intValue >= 0) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.setValue(new C170606mm(1, z));
        return Integer.valueOf(intValue);
    }

    public static final Object then$14(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        ((MediaPlayerModule) agS120S0100000_2.l0).LJLJLJ.setValue(new C170606mm(2, ((Boolean) c10k.LJIIJJI()).booleanValue()));
        return null;
    }

    public static final Object then$15(AgS120S0100000_2 agS120S0100000_2, C10K task) {
        o.LJIIIZ(task, "task");
        if (task.LJIIJJI() != null) {
            return new TextStickerCompileResult(((C67P) agS120S0100000_2.l0).LJ(), (C67J) task.LJIIJJI());
        }
        return null;
    }

    public static final Object then$16(AgS120S0100000_2 agS120S0100000_2, C10K task) {
        o.LJIIIZ(task, "task");
        if (task.LJIIJJI() != null) {
            return new TextStickerCompileResult(((C67P) agS120S0100000_2.l0).LJ(), (C67J) task.LJIIJJI());
        }
        return null;
    }

    public static final Object then$17(AgS120S0100000_2 agS120S0100000_2, C10K task) {
        o.LJIIIZ(task, "task");
        if (task.LJIIJJI() != null) {
            return new TextStickerCompileResult(((C67P) agS120S0100000_2.l0).getData(), (C67J) task.LJIIJJI());
        }
        return null;
    }

    public static final Object then$18(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        ProgressDialogC164766dM progressDialogC164766dM;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FTCVideoPublish finishPrepareEffectPlatform:");
        LIZ.append(((FTCVideoPublishFragment) agS120S0100000_2.l0).LJLILLLLZI);
        H78.LJI(X1D.LIZIZ(LIZ));
        FTCVideoPublishFragment fTCVideoPublishFragment = (FTCVideoPublishFragment) agS120S0100000_2.l0;
        ActivityC45651qj mo49getActivity = fTCVideoPublishFragment.mo49getActivity();
        if (mo49getActivity != null && fTCVideoPublishFragment.LJLJI.decrementAndGet() == 0 && (progressDialogC164766dM = fTCVideoPublishFragment.LJLILLLLZI) != null && progressDialogC164766dM.isShowing() && !mo49getActivity.isFinishing()) {
            ProgressDialogC164766dM progressDialogC164766dM2 = fTCVideoPublishFragment.LJLILLLLZI;
            if (progressDialogC164766dM2 != null) {
                progressDialogC164766dM2.dismiss();
            }
            fTCVideoPublishFragment.LJLILLLLZI = null;
        }
        return null;
    }

    public static final Object then$19(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        if (c10k.LJIILIIL() && c10k.LJIIJJI() != null) {
            C142185i2 c142185i2 = C142185i2.INSTANCE;
            String str = ((MyMediaModel) agS120S0100000_2.l0).fileLocalUriPath;
            o.LJIIIIZZ(str, "mediaModel.fileLocalUriPath");
            c142185i2.put(str, c10k.LJIIJJI());
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        if (c10k != null && c10k.LJIIJJI() != null) {
            InterfaceC141565h2 interfaceC141565h2 = (InterfaceC141565h2) agS120S0100000_2.l0;
            if (interfaceC141565h2 != null) {
                c10k.LJIIJJI();
                interfaceC141565h2.LIZ(true);
                return null;
            }
            return null;
        }
        InterfaceC141565h2 interfaceC141565h22 = (InterfaceC141565h2) agS120S0100000_2.l0;
        if (interfaceC141565h22 == null) {
            return null;
        }
        interfaceC141565h22.LIZ(false);
        return null;
    }

    public static final Object then$20(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        if (c10k == null || c10k.LJIIJJI() == null) {
            InterfaceC126004x2 interfaceC126004x2 = (InterfaceC126004x2) agS120S0100000_2.l0;
            if (interfaceC126004x2 != null) {
                interfaceC126004x2.onFailed();
                return null;
            }
            return null;
        }
        InterfaceC126004x2 interfaceC126004x22 = (InterfaceC126004x2) agS120S0100000_2.l0;
        if (interfaceC126004x22 == null) {
            return null;
        }
        Object LJIIJJI = c10k.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "task.result");
        interfaceC126004x22.LIZ(((Number) LJIIJJI).intValue());
        return null;
    }

    public static final Object then$21(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) agS120S0100000_2.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object then$22(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        DraftOnlineMusicProcessor draftOnlineMusicProcessor = (DraftOnlineMusicProcessor) agS120S0100000_2.l0;
        InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> interfaceC88473Ynt = draftOnlineMusicProcessor.LJLILLLLZI;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(Boolean.TRUE, Boolean.valueOf(draftOnlineMusicProcessor.LJLJI), ((DraftOnlineMusicProcessor) agS120S0100000_2.l0).LJLJJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$23(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        DraftSoundEffectProcessor draftSoundEffectProcessor = (DraftSoundEffectProcessor) agS120S0100000_2.l0;
        InterfaceC169156kR interfaceC169156kR = draftSoundEffectProcessor.LJLILLLLZI;
        if (interfaceC169156kR != null) {
            interfaceC169156kR.LIZ(draftSoundEffectProcessor.LJLJJI);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object then$24(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        DraftStreamMusicProcessor draftStreamMusicProcessor = (DraftStreamMusicProcessor) agS120S0100000_2.l0;
        InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> interfaceC88473Ynt = draftStreamMusicProcessor.LJLILLLLZI;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(Boolean.TRUE, Boolean.valueOf(draftStreamMusicProcessor.LJLJI), ((DraftStreamMusicProcessor) agS120S0100000_2.l0).LJLJJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$25(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        if (c10k == null || c10k.LJIIJJI() == null) {
            InterfaceC126004x2 interfaceC126004x2 = (InterfaceC126004x2) agS120S0100000_2.l0;
            if (interfaceC126004x2 != null) {
                interfaceC126004x2.onFailed();
                return null;
            }
            return null;
        }
        InterfaceC126004x2 interfaceC126004x22 = (InterfaceC126004x2) agS120S0100000_2.l0;
        if (interfaceC126004x22 == null) {
            return null;
        }
        Object LJIIJJI = c10k.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "task.result");
        interfaceC126004x22.LIZ(((Number) LJIIJJI).intValue());
        return null;
    }

    public static final Object then$26(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        if (c10k != null && c10k.LJIIJJI() != null) {
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "it.result");
            if (((Number) LJIIJJI).intValue() >= 0) {
                InterfaceC126004x2 interfaceC126004x2 = (InterfaceC126004x2) agS120S0100000_2.l0;
                if (interfaceC126004x2 == null) {
                    return null;
                }
                Object LJIIJJI2 = c10k.LJIIJJI();
                o.LJIIIIZZ(LJIIJJI2, "it.result");
                interfaceC126004x2.LIZ(((Number) LJIIJJI2).intValue());
                return null;
            }
        }
        InterfaceC126004x2 interfaceC126004x22 = (InterfaceC126004x2) agS120S0100000_2.l0;
        if (interfaceC126004x22 != null) {
            interfaceC126004x22.onFailed();
            return null;
        }
        return null;
    }

    public static final Object then$27(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) agS120S0100000_2.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object then$28(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        if (c10k.LJIIJJI() != null) {
            C156426By c156426By = ((C1556769b) agS120S0100000_2.l0).LJLL;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.DonationStickerInteractView");
            C67E LJIJ = ((C1557269g) c156426By).LLIIIZ.LJIJ();
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "it.result");
            return new C67H(LJIJ, (C67J) LJIIJJI);
        }
        return null;
    }

    public static final Object then$29(AgS120S0100000_2 agS120S0100000_2, C10K task) {
        o.LJIIIZ(task, "task");
        if (task.LJIILJJIL() || task.LJIIL()) {
            C5S1 c5s1 = new C5S1(((C163186ao) agS120S0100000_2.l0).requireActivity());
            c5s1.LIZJ(R.string.rf3);
            c5s1.LJ();
            ((C163186ao) agS120S0100000_2.l0).LLJJI();
        } else {
            ((C163186ao) agS120S0100000_2.l0).LLJJI();
            CheckWalletResponse.Data data = ((CheckWalletResponse) task.LJIIJJI()).data;
            if (data == null || data.canGoWallet == null) {
                C5S1 c5s12 = new C5S1(((C163186ao) agS120S0100000_2.l0).requireActivity());
                c5s12.LIZJ(R.string.rf3);
                c5s12.LJ();
            }
            CheckWalletResponse.Data data2 = ((CheckWalletResponse) task.LJIIJJI()).data;
            o.LJI(data2);
            Boolean bool = data2.canGoWallet;
            o.LJI(bool);
            if (bool.booleanValue()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C163236at.LIZ().LIZLLL());
                LIZ.append("&reviewed=");
                LIZ.append(((C163186ao) agS120S0100000_2.l0).LLJJ().getReviewed());
                Uri build = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", X1D.LIZIZ(LIZ)).build();
                IBulletService LIZ2 = BulletService.LIZ();
                Activity requireActivity = ((C163186ao) agS120S0100000_2.l0).requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                String uri = build.toString();
                o.LJIIIIZZ(uri, "schema.toString()");
                LIZ2.LJIIIIZZ(requireActivity, uri);
                ((C163186ao) agS120S0100000_2.l0).LJLLLL.push("setting_currency_page");
            } else {
                String LIZJ = C163236at.LIZ().LIZJ();
                if (((C163186ao) agS120S0100000_2.l0).LLJJ().getPrice() != null) {
                    StringBuilder LIZJ2 = b1.LIZJ(LIZJ, "&coin=");
                    ShoutoutPrice price = ((C163186ao) agS120S0100000_2.l0).LLJJ().getPrice();
                    o.LJI(price);
                    LIZJ2.append(price.getCoin());
                    LIZJ2.append("&reviewed=");
                    LIZJ2.append(((C163186ao) agS120S0100000_2.l0).LLJJ().getReviewed());
                    LIZJ = X1D.LIZIZ(LIZJ2);
                }
                Uri build2 = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", LIZJ).build();
                IBulletService LIZ3 = BulletService.LIZ();
                Activity requireActivity2 = ((C163186ao) agS120S0100000_2.l0).requireActivity();
                o.LJIIIIZZ(requireActivity2, "requireActivity()");
                String uri2 = build2.toString();
                o.LJIIIIZZ(uri2, "schema.toString()");
                LIZ3.LJIIIIZZ(requireActivity2, uri2);
                ((C163186ao) agS120S0100000_2.l0).LJLLLL.push("setting_price_page");
            }
            C163186ao c163186ao = (C163186ao) agS120S0100000_2.l0;
            SceneExtensionsKt.LIZJ(c163186ao, new ARunnableS38S0100000_2(c163186ao, 172), 100L);
            ((C163186ao) agS120S0100000_2.l0).LLJJI();
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        C1558669u LJ = ((C156426By) agS120S0100000_2.l0).LJ();
        C67J c67j = (C67J) c10k.LJIIJJI();
        if (c67j != null) {
            return new C6BX(LJ, c67j);
        }
        return null;
    }

    public static final Object then$30(AgS120S0100000_2 agS120S0100000_2, C10K task) {
        C163186ao c163186ao;
        Activity activity;
        o.LJIIIZ(task, "task");
        if (task.LJIILJJIL() || task.LJIIL()) {
            C5S1 c5s1 = new C5S1(((C163186ao) agS120S0100000_2.l0).requireActivity());
            c5s1.LIZJ(R.string.rf3);
            c5s1.LJ();
            ((C163186ao) agS120S0100000_2.l0).LLJJI();
        } else {
            ((C163186ao) agS120S0100000_2.l0).LLJJI();
            Activity activity2 = ((C163186ao) agS120S0100000_2.l0).mActivity;
            if (activity2 != null && !activity2.isFinishing() && (activity = (c163186ao = (C163186ao) agS120S0100000_2.l0).mActivity) != null && !activity.isFinishing()) {
                Intent intent = new Intent(c163186ao.requireActivity(), (Class<?>) ShoutOutsEditSuccessActivity.class);
                GSU gsu = c163186ao.LJLLILLLL;
                o.LJI(gsu);
                if (TextUtils.isEmpty(String.valueOf(gsu.getText())) && TextUtils.isEmpty(c163186ao.LJLLL)) {
                    intent.putExtra("shoutout_edit_price", true);
                } else {
                    GSU gsu2 = c163186ao.LJLLILLLL;
                    o.LJI(gsu2);
                    if (o.LJ(String.valueOf(gsu2.getText()), c163186ao.LJLLL)) {
                        intent.putExtra("shoutout_edit_price", true);
                    }
                }
                if (TextUtils.isEmpty(c163186ao.LLJJ().getCoverUrl())) {
                    intent.putExtra("shoutout_hide_button", true);
                }
                C16880lQ.LIZIZ(c163186ao.requireActivity(), intent);
                c163186ao.requireActivity().finish();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$31(AgS120S0100000_2 agS120S0100000_2, C10K task) {
        C163186ao c163186ao;
        Activity activity;
        C163186ao c163186ao2;
        Activity activity2;
        o.LJIIIZ(task, "task");
        if (task.LJIILJJIL() || task.LJIIL()) {
            C5S1 c5s1 = new C5S1(((C163186ao) agS120S0100000_2.l0).requireActivity());
            c5s1.LIZJ(R.string.rf3);
            c5s1.LJ();
            ((C163186ao) agS120S0100000_2.l0).LLJJI();
        } else {
            ((C163186ao) agS120S0100000_2.l0).LLJJI();
            if (((ShoutoutsGetListResponse) task.LJIIJJI()).total > 0 && (activity2 = (c163186ao2 = (C163186ao) agS120S0100000_2.l0).mActivity) != null && !activity2.isFinishing()) {
                C26227ARb c26227ARb = new C26227ARb(activity2);
                c26227ARb.LJ(R.string.jce);
                c26227ARb.LIZ(R.string.jcc);
                UC0.LIZJ(c26227ARb, new AqS168S0100000_2(c163186ao2, 533));
                c26227ARb.LJI().LIZLLL();
            }
            if (((ShoutoutsGetListResponse) task.LJIIJJI()).total == 0 && (activity = (c163186ao = (C163186ao) agS120S0100000_2.l0).mActivity) != null && !activity.isFinishing()) {
                C26227ARb c26227ARb2 = new C26227ARb(activity);
                c26227ARb2.LJ(R.string.jcd);
                c26227ARb2.LIZ(R.string.jcb);
                UC0.LIZJ(c26227ARb2, new AqS168S0100000_2(c163186ao, 531));
                c26227ARb2.LJI().LIZLLL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$32(AgS120S0100000_2 agS120S0100000_2, C10K task) {
        o.LJIIIZ(task, "task");
        if (task.LJIILJJIL() || task.LJIIL()) {
            C5S1 c5s1 = new C5S1(((C163186ao) agS120S0100000_2.l0).requireActivity());
            c5s1.LIZJ(R.string.rf3);
            c5s1.LJ();
            ((C163186ao) agS120S0100000_2.l0).LLJJI();
            return C76800UCe.LIZ;
        }
        ((C163186ao) agS120S0100000_2.l0).LLJJI();
        ShoutOutServiceImpl.LIZJ().LIZ();
        Activity activity = ((C163186ao) agS120S0100000_2.l0).mActivity;
        if (activity != null) {
            activity.finish();
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object then$33(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        String str;
        long j;
        long j2;
        StickerItemModel stickerItemModel;
        String str2;
        StickerItemModel stickerItemModel2;
        StickerItemModel stickerItemModel3;
        C66T c66t = (C66T) agS120S0100000_2.l0;
        C153075zb c153075zb = c66t.LJFF;
        Integer num = null;
        if (c153075zb != null && (stickerItemModel3 = c153075zb.LJLJI) != null) {
            str = stickerItemModel3.pinAlgorithmFile;
        } else {
            str = null;
        }
        if (C44687HgJ.LIZIZ(str)) {
            C153075zb c153075zb2 = c66t.LJFF;
            if (c153075zb2 != null && (stickerItemModel2 = c153075zb2.LJLJI) != null) {
                str2 = stickerItemModel2.pinAlgorithmFile;
            } else {
                str2 = null;
            }
            C39579Fg7.LJIL(str2);
        }
        String LJIIIZ = V1M.LJIIIZ(c66t.LIZ);
        c66t.LJ = LJIIIZ;
        C39579Fg7.LJ(LJIIIZ, true);
        C153075zb c153075zb3 = c66t.LJFF;
        if (c153075zb3 != null && (stickerItemModel = c153075zb3.LJLJI) != null) {
            stickerItemModel.setPinAlgorithmFile(c66t.LJ);
        }
        C66T c66t2 = (C66T) agS120S0100000_2.l0;
        c66t2.LJIIIIZZ = c66t2.LIZIZ.LJZL();
        C122034qd LJJI = C17N.LJJI(((C66T) agS120S0100000_2.l0).LIZIZ);
        if (LJJI != null) {
            C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(((C66T) agS120S0100000_2.l0).LIZLLL);
            if (LJJJJLI != null) {
                C66T c66t3 = (C66T) agS120S0100000_2.l0;
                C153075zb c153075zb4 = c66t3.LJFF;
                if (c153075zb4 != null) {
                    j = c153075zb4.LJLJI.startTime;
                } else {
                    j = 0;
                }
                LJJJJLI.LIZJ = j;
                if (c153075zb4 != null) {
                    j2 = c153075zb4.LJLJI.endTime;
                } else {
                    j2 = -2;
                }
                LJJJJLI.LIZLLL = j2;
                LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                num = Integer.valueOf(LJJI.LJIIIIZZ().LIZ().LJIIIIZZ(c66t3.LIZLLL));
            }
            o.LJIIIIZZ(num, "wrapper.element");
            if (num.intValue() < 0) {
                ((C66T) agS120S0100000_2.l0).LIZIZ();
            }
            return C76800UCe.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object then$34(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        ((InterfaceC65784Pro) agS120S0100000_2.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object then$35(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        ((InterfaceC88472Yns) agS120S0100000_2.l0).invoke(c10k.LJIIJJI());
        return C76800UCe.LIZ;
    }

    public static final Object then$36(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        int i = C6ID.LIZ[((C6IE) agS120S0100000_2.l0).ordinal()];
        if (i != 1) {
            if (i == 2) {
                C6IG.LIZIZ = ((AllowUserToQuestionResponse) c10k.LJIIJJI()).allowAskQuestion;
            }
        } else {
            C6IG.LIZ = ((AllowUserToQuestionResponse) c10k.LJIIJJI()).allowAskQuestion;
        }
        AnonymousClass699.LIZIZ().LJFF = C6IG.LIZIZ;
        return C76800UCe.LIZ;
    }

    public static final Object then$37(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        C84939XVf c84939XVf = (C84939XVf) agS120S0100000_2.l0;
        c84939XVf.LJ = false;
        if (c10k.LJIILJJIL()) {
            c84939XVf.LIZIZ.jv0(1, "loadmore_status_music_list");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        c84939XVf.LIZIZ.jv0(0, "loadmore_status_music_list");
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        List list = (List) ((XRT) c84939XVf.LIZIZ.get("music_list")).LIZ("list_data");
        list.addAll(C44384HbQ.LJIJJLI(musicList.items));
        XRT xrt = new XRT();
        int i = musicList.radioCursor;
        if (i <= 0) {
            i = musicList.cursor;
        }
        xrt.LIZ.put("list_cursor", Integer.valueOf(i));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(musicList.hasMore));
        xrt.LIZ.put("action_type", 2);
        xrt.LIZIZ("list_data", list);
        c84939XVf.LIZIZ.jv0(xrt, "music_list");
        return null;
    }

    public static final Object then$38(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        if (c10k.LJIIJJI() != null) {
            C156426By c156426By = ((C156526Ci) agS120S0100000_2.l0).LJLL;
            o.LJII(c156426By, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.location.LocationStickerInteractView");
            C156636Ct c156636Ct = ((C156626Cs) c156426By).LLIIJI;
            InteractStickerStruct interactStickerStruct = c156636Ct.getStickerController().getInteractStickerStruct();
            if (interactStickerStruct == null) {
                interactStickerStruct = new InteractStickerStruct();
            }
            c156636Ct.LJLLLLLL = interactStickerStruct;
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "it.result");
            return new C156666Cw(interactStickerStruct, (C67J) LJIIJJI);
        }
        return null;
    }

    public static final Object then$39(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        C161516Vn c161516Vn = (C161516Vn) agS120S0100000_2.l0;
        c161516Vn.getClass();
        Integer num = null;
        if (C44687HgJ.LIZIZ(null)) {
            C39579Fg7.LJIL(null);
        }
        String LJIIIZ = V1M.LJIIIZ(c161516Vn.LIZ);
        c161516Vn.LJ = LJIIIZ;
        C39579Fg7.LJ(LJIIIZ, true);
        C161516Vn c161516Vn2 = (C161516Vn) agS120S0100000_2.l0;
        c161516Vn2.LJII = c161516Vn2.LIZIZ.LJZL();
        C122034qd LJJI = C17N.LJJI(((C161516Vn) agS120S0100000_2.l0).LIZIZ);
        if (LJJI != null) {
            C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(((C161516Vn) agS120S0100000_2.l0).LIZLLL);
            if (LJJJJLI != null) {
                C161516Vn c161516Vn3 = (C161516Vn) agS120S0100000_2.l0;
                c161516Vn3.getClass();
                LJJJJLI.LIZJ = 0L;
                LJJJJLI.LIZLLL = -2L;
                LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                num = Integer.valueOf(LJJI.LJIIIIZZ().LIZ().LJIIIIZZ(c161516Vn3.LIZLLL));
            }
            o.LJIIIIZZ(num, "wrapper.element");
            if (num.intValue() < 0) {
                C161516Vn c161516Vn4 = (C161516Vn) agS120S0100000_2.l0;
                c161516Vn4.LJI = false;
                c161516Vn4.LIZ();
            }
            return C76800UCe.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object then$4(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        ((Runnable) agS120S0100000_2.l0).run();
        return null;
    }

    public static final Object then$5(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        ((InterfaceC88472Yns) agS120S0100000_2.l0).invoke(c10k.LJIIJJI());
        return C76800UCe.LIZ;
    }

    public static final Object then$6(AgS120S0100000_2 agS120S0100000_2, C10K res) {
        LoudnessDetectResult loudnessDetectResult;
        o.LJIIIIZZ(res, "res");
        LoudnessDetectResult[] loudnessDetectResultArr = (LoudnessDetectResult[]) res.LJIIJJI();
        if (loudnessDetectResultArr != null && (loudnessDetectResult = loudnessDetectResultArr[0]) != null && loudnessDetectResult.result == 0) {
            double d = loudnessDetectResult.peakLoudness;
            double d2 = loudnessDetectResult.avgLoudness;
            C5MG c5mg = (C5MG) agS120S0100000_2.l0;
            C78841Uwv.LJJIII(c5mg, "VEVideoEditor.addBalanceFilterWithDetect", c5mg.LJIJ(), new C123744tO(agS120S0100000_2, d, d2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$7(AgS120S0100000_2 agS120S0100000_2, C10K task) {
        o.LJIIIZ(task, "task");
        if (task.LJIIJJI() != null) {
            return new TextStickerCompileResult(((C67P) agS120S0100000_2.l0).LJ(), (C67J) task.LJIIJJI());
        }
        return null;
    }

    public static final Object then$8(AgS120S0100000_2 agS120S0100000_2, C10K task) {
        o.LJIIIZ(task, "task");
        if (task.LJIIJJI() != null) {
            return new TextStickerCompileResult(((C67P) agS120S0100000_2.l0).LJ(), (C67J) task.LJIIJJI());
        }
        return null;
    }

    public static final Object then$9(AgS120S0100000_2 agS120S0100000_2, C10K c10k) {
        ((C150345vC) agS120S0100000_2.l0).LJJLJLI();
        ((C150345vC) agS120S0100000_2.l0).LJJLIIJ().dG();
        return null;
    }
}
