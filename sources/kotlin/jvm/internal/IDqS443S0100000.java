package kotlin.jvm.internal;

import X.AbstractC24810yD;
import X.AbstractC282819c;
import X.AbstractC29311Db;
import X.AbstractC531926x;
import X.AbstractC65781Prl;
import X.AnonymousClass011;
import X.AnonymousClass164;
import X.AnonymousClass167;
import X.BZI;
import X.C03770Cv;
import X.C04D;
import X.C07770Sf;
import X.C08930Wr;
import X.C09650Zl;
import X.C0DC;
import X.C0G1;
import X.C0MK;
import X.C0NB;
import X.C0OI;
import X.C0OJ;
import X.C0TY;
import X.C10370av;
import X.C11280cO;
import X.C12U;
import X.C14360hM;
import X.C162476Zf;
import X.C1DJ;
import X.C1M2;
import X.C1Q6;
import X.C20000qS;
import X.C20320qy;
import X.C22830v1;
import X.C23450w1;
import X.C23490w5;
import X.C24910yN;
import X.C25710zf;
import X.C25820zq;
import X.C278217i;
import X.C279917z;
import X.C27G;
import X.C28787BRn;
import X.C29306Beo;
import X.C29321Dc;
import X.C31611Lx;
import X.C32001Nk;
import X.C32031Nn;
import X.C32041No;
import X.C33491Td;
import X.C36001bA;
import X.C37621dm;
import X.C3C5;
import X.C41981ko;
import X.C44351od;
import X.C45101pq;
import X.C47261Igj;
import X.C49421wo;
import X.C49431wp;
import X.C51029K0z;
import X.C514920j;
import X.C54512Bz;
import X.C55572Gb;
import X.C61447O9r;
import X.C65777Prh;
import X.C75295Tgp;
import X.C76800UCe;
import X.C78613UtF;
import X.C78939UyV;
import X.CN1;
import X.EnumC08920Wq;
import X.EnumC21150sJ;
import X.EnumC23500w6;
import X.EnumC24710y3;
import X.InterfaceC07740Sc;
import X.InterfaceC07750Sd;
import X.InterfaceC07760Se;
import X.InterfaceC07790Sh;
import X.InterfaceC11470ch;
import X.InterfaceC18170nV;
import X.InterfaceC18630oF;
import X.InterfaceC20310qx;
import X.InterfaceC23370vt;
import X.InterfaceC24520xk;
import X.InterfaceC24760y8;
import X.InterfaceC272515d;
import X.InterfaceC30594Bza;
import X.InterfaceC35811ar;
import X.InterfaceC36571c5;
import X.InterfaceC42241lE;
import X.InterfaceC42251lF;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC78936UyS;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.ORZ;
import X.X1D;
import X.XJL;
import X.XK4;
import X.XKX;
import android.os.Trace;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.effect.music.BGMListFragment;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.live.effect.music.LiveBGMPlaylistFragment;
import com.bytedance.android.live.effect.navi.NaviAvatarListPresenter;
import com.bytedance.android.live.effect.navi.model.ProfileNaviFeature;
import com.bytedance.android.live.effect.navi.model.ProfileNaviStaticImage;
import com.bytedance.android.live.effect.navi.model.ProfileNaviUploadDataModel;
import com.bytedance.android.live.effect.soundeffect.SoundEffectFragment;
import com.bytedance.android.live.effect.soundeffect.SoundEffectMiniWidget;
import com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView;
import com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerListView;
import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.google.gson.internal.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* loaded from: classes.dex */
public class IDqS443S0100000 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            case 17:
                return invoke$17(this, obj, obj2);
            case 18:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case 20:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case 24:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case 33:
                return invoke$33(this, obj, obj2);
            case 34:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case 36:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this, obj, obj2);
            case C61447O9r.LJIIJ:
                return invoke$49(this, obj, obj2);
            case 50:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(C04D c04d, int i) {
        super(2);
        this.$t = i;
        this.l0 = c04d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS443S0100000(C03770Cv c03770Cv, C03770Cv<C55572Gb<T>> c03770Cv2) {
        super(2);
        this.$t = c03770Cv2;
        this.l0 = c03770Cv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(C0G1 c0g1, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0g1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(C0OJ c0oj, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0oj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(InterfaceC07740Sc interfaceC07740Sc, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC07740Sc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(InterfaceC07750Sd interfaceC07750Sd, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC07750Sd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(InterfaceC07760Se interfaceC07760Se, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC07760Se;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(InterfaceC18630oF interfaceC18630oF, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC18630oF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(InterfaceC20310qx interfaceC20310qx, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC20310qx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(InterfaceC24520xk interfaceC24520xk, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC24520xk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS443S0100000(InterfaceC24760y8 interfaceC24760y8, InterfaceC24760y8<? extends InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>> interfaceC24760y82) {
        super(2);
        this.$t = interfaceC24760y82;
        this.l0 = interfaceC24760y8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(C12U c12u, int i) {
        super(2);
        this.$t = i;
        this.l0 = c12u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(AnonymousClass167 anonymousClass167, int i) {
        super(2);
        this.$t = i;
        this.l0 = anonymousClass167;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(C278217i c278217i, int i) {
        super(2);
        this.$t = i;
        this.l0 = c278217i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(AbstractC282819c abstractC282819c, int i) {
        super(2);
        this.$t = i;
        this.l0 = abstractC282819c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(C31611Lx c31611Lx, int i) {
        super(2);
        this.$t = i;
        this.l0 = c31611Lx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(C1Q6 c1q6, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1q6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(InterfaceC35811ar interfaceC35811ar, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC35811ar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(C36001bA c36001bA, int i) {
        super(2);
        this.$t = i;
        this.l0 = c36001bA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(C37621dm c37621dm, int i) {
        super(2);
        this.$t = i;
        this.l0 = c37621dm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(C514920j c514920j, int i) {
        super(2);
        this.$t = i;
        this.l0 = c514920j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS443S0100000(InterfaceC67352kd interfaceC67352kd, InterfaceC67352kd<? super Boolean> interfaceC67352kd2) {
        super(2);
        this.$t = interfaceC67352kd2;
        this.l0 = interfaceC67352kd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(XK4 xk4, int i) {
        super(2);
        this.$t = i;
        this.l0 = xk4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS443S0100000(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super C0MK, Object, ? extends List<Object>> interfaceC88471Ynr2) {
        super(2);
        this.$t = interfaceC88471Ynr2;
        this.l0 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS443S0100000(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super InterfaceC11470ch, C11280cO> interfaceC88472Yns2) {
        super(2);
        this.$t = interfaceC88472Yns2;
        this.l0 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS443S0100000(InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88473Ynt<? super Integer, ? super PTYError, ? super PTYPackageInfo, C76800UCe> interfaceC88473Ynt2) {
        super(2);
        this.$t = interfaceC88473Ynt2;
        this.l0 = interfaceC88473Ynt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(KaraokeSongListFragment karaokeSongListFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = karaokeSongListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(KaraokeViewModel karaokeViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = karaokeViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(BGMListFragment bGMListFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = bGMListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(LiveBGMPlaylistFragment liveBGMPlaylistFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveBGMPlaylistFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(NaviAvatarListPresenter naviAvatarListPresenter, int i) {
        super(2);
        this.$t = i;
        this.l0 = naviAvatarListPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(SoundEffectFragment soundEffectFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = soundEffectFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(SoundEffectMiniWidget soundEffectMiniWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = soundEffectMiniWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(BaseMultiGuestStickerView baseMultiGuestStickerView, int i) {
        super(2);
        this.$t = i;
        this.l0 = baseMultiGuestStickerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(MultiGuestStickerListView multiGuestStickerListView, int i) {
        super(2);
        this.$t = i;
        this.l0 = multiGuestStickerListView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(StickerShortCutWidget stickerShortCutWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = stickerShortCutWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(AqS155S0100000_5 aqS155S0100000_5, int i) {
        super(2);
        this.$t = i;
        this.l0 = aqS155S0100000_5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS443S0100000(IDqS172S0200000 iDqS172S0200000, int i) {
        super(2);
        this.$t = i;
        this.l0 = iDqS172S0200000;
    }

    public static final Object invoke$0(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            ((AbstractC282819c) iDqS443S0100000.l0).LIZ(interfaceC24520xk, 8);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            ((C04D) iDqS443S0100000.l0).LIZ(interfaceC24520xk, 8);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS443S0100000 iDqS443S0100000, Object newVisibleItems, Object obj) {
        TreeMap<Integer, C75295Tgp> allVisibleItems = (TreeMap) obj;
        o.LJIIIZ(newVisibleItems, "newVisibleItems");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        C32031Nn c32031Nn = C32031Nn.LIZ;
        MultiGuestStickerListView multiGuestStickerListView = (MultiGuestStickerListView) iDqS443S0100000.l0;
        c32031Nn.LIZLLL("props", allVisibleItems, multiGuestStickerListView.LJLLLLLL.LJLIL, multiGuestStickerListView.LJLJJLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        C0MK Saver = (C0MK) obj;
        o.LJIIIZ(Saver, "$this$Saver");
        List list = (List) ((InterfaceC88471Ynr) iDqS443S0100000.l0).invoke(Saver, obj2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj3 = ListProtector.get(list, i);
            if (obj3 != null && !Saver.LIZ(obj3)) {
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        if (!list.isEmpty()) {
            return new ArrayList(list);
        }
        return null;
    }

    public static final Object invoke$12(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        boolean z;
        Set<? extends Object> applied = (Set) obj;
        o.LJIIIZ(applied, "applied");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        C0OJ c0oj = (C0OJ) iDqS443S0100000.l0;
        synchronized (c0oj.LIZLLL) {
            C25710zf<C0OI> c25710zf = c0oj.LIZLLL;
            int i = c25710zf.LJLJI;
            z = false;
            if (i > 0) {
                C0OI[] c0oiArr = c25710zf.LJLIL;
                o.LJII(c0oiArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i2 = 0;
                z = false;
                do {
                    if (c0oiArr[i2].LIZIZ(applied) || z) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i2++;
                } while (i2 < i);
            }
        }
        if (z) {
            C0OJ c0oj2 = (C0OJ) iDqS443S0100000.l0;
            c0oj2.LIZ.invoke(new IDqS420S0100000(c0oj2, 65));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        int intValue = ((Number) obj2).intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download song test ");
        LIZ.append(longValue);
        LIZ.append(": progress: ");
        LIZ.append(intValue);
        C0NB.LIZIZ("KaraokeViewModel", X1D.LIZIZ(LIZ));
        XKX.LIZLLL(ViewModelKt.getViewModelScope((KaraokeViewModel) iDqS443S0100000.l0), C78613UtF.LIZJ, null, new C54512Bz((KaraokeViewModel) iDqS443S0100000.l0, longValue, intValue, null), 2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        InterfaceC07790Sh interfaceC07790Sh;
        InterfaceC07790Sh acc = (InterfaceC07790Sh) obj;
        C1M2 element = (C1M2) obj2;
        o.LJIIIZ(acc, "acc");
        o.LJIIIZ(element, "element");
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) iDqS443S0100000.l0;
        Trace.beginSection("modifier:foldIn");
        try {
            if (element instanceof C41981ko) {
                InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, InterfaceC07790Sh> interfaceC88473Ynt = ((C41981ko) element).LJLILLLLZI;
                o.LJII(interfaceC88473Ynt, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                C65777Prh.LJ(3, interfaceC88473Ynt);
                interfaceC07790Sh = C07770Sf.LIZJ(interfaceC24520xk, interfaceC88473Ynt.invoke(InterfaceC07790Sh.LJJJI, interfaceC24520xk, 0));
            } else {
                if (element instanceof InterfaceC42251lF) {
                    C49421wo c49421wo = C07770Sf.LIZ;
                    o.LJII(c49421wo, "null cannot be cast to non-null type kotlin.Function3<androidx.compose.ui.focus.FocusEventModifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    C65777Prh.LJ(3, c49421wo);
                    interfaceC07790Sh = element.LLLIIIL((InterfaceC07790Sh) c49421wo.invoke(element, interfaceC24520xk, 0));
                } else {
                    interfaceC07790Sh = element;
                }
                if (element instanceof InterfaceC42241lE) {
                    C49431wp c49431wp = C07770Sf.LIZIZ;
                    o.LJII(c49431wp, "null cannot be cast to non-null type kotlin.Function3<androidx.compose.ui.focus.FocusRequesterModifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    C65777Prh.LJ(3, c49431wp);
                    interfaceC07790Sh = interfaceC07790Sh.LLLIIIL((InterfaceC07790Sh) c49431wp.invoke(element, interfaceC24520xk, 0));
                }
            }
            return acc.LLLIIIL(interfaceC07790Sh);
        } finally {
            Trace.endSection();
        }
    }

    public static final Object invoke$15(IDqS443S0100000 iDqS443S0100000, Object newVisibleItems, Object obj) {
        TreeMap allVisibleItems = (TreeMap) obj;
        o.LJIIIZ(newVisibleItems, "newVisibleItems");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        StickerShortCutWidget stickerShortCutWidget = (StickerShortCutWidget) iDqS443S0100000.l0;
        C32041No.LJIIJJI(stickerShortCutWidget.dataChannel, "", allVisibleItems, stickerShortCutWidget.LJLJJLL, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        EnumC23500w6 layoutDirection = (EnumC23500w6) obj2;
        o.LJIIIZ(layoutDirection, "layoutDirection");
        return Integer.valueOf(((InterfaceC07740Sc) iDqS443S0100000.l0).LIZ(0, intValue, layoutDirection));
    }

    public static final Object invoke$17(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        long j = ((C23490w5) obj).LIZ;
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        return new C23450w1(C78939UyV.LIZ(0, ((InterfaceC07750Sd) iDqS443S0100000.l0).LIZ(0, C23490w5.LIZIZ(j))));
    }

    public static final Object invoke$18(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        long j = ((C23490w5) obj).LIZ;
        EnumC23500w6 layoutDirection = (EnumC23500w6) obj2;
        o.LJIIIZ(layoutDirection, "layoutDirection");
        return new C23450w1(((InterfaceC07760Se) iDqS443S0100000.l0).q(0L, j, layoutDirection));
    }

    public static final Object invoke$19(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        long j = ((C23490w5) obj).LIZ;
        EnumC23500w6 layoutDirection = (EnumC23500w6) obj2;
        o.LJIIIZ(layoutDirection, "layoutDirection");
        return new C23450w1(C78939UyV.LIZ(((InterfaceC07740Sc) iDqS443S0100000.l0).LIZ(0, (int) (j >> 32), layoutDirection), 0));
    }

    public static final Object invoke$2(IDqS443S0100000 iDqS443S0100000, Object newVisibleItems, Object obj) {
        String str;
        String str2;
        TreeMap<Integer, C75295Tgp> allVisibleItems = (TreeMap) obj;
        o.LJIIIZ(newVisibleItems, "newVisibleItems");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        String str3 = ((C0G1) iDqS443S0100000.l0).LJIIL;
        String str4 = "";
        if (o.LJ(str3, C0TY.LIZIZ)) {
            C0G1 c0g1 = (C0G1) iDqS443S0100000.l0;
            DataChannel dataChannel = c0g1.LIZ;
            C32001Nk c32001Nk = c0g1.LIZJ;
            if (c32001Nk != null && (str2 = c32001Nk.LJLILLLLZI) != null) {
                str4 = str2;
            }
            C32041No.LJIIJJI(dataChannel, str4, allVisibleItems, c0g1.LJIIIIZZ.LJLIL, false);
        } else if (o.LJ(str3, C0TY.LIZJ)) {
            C32031Nn c32031Nn = C32031Nn.LIZ;
            C0G1 c0g12 = (C0G1) iDqS443S0100000.l0;
            C32001Nk c32001Nk2 = c0g12.LIZJ;
            if (c32001Nk2 != null && (str = c32001Nk2.LJLILLLLZI) != null) {
                str4 = str;
            }
            c32031Nn.LIZLLL(str4, allVisibleItems, c0g12.LJIIIIZZ.LJLIL, c0g12.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        TreeMap<Integer, C75295Tgp> allVisibleItems = (TreeMap) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        C1Q6 c1q6 = (C1Q6) iDqS443S0100000.l0;
        InterfaceC30594Bza interfaceC30594Bza = c1q6.LJZL;
        if (interfaceC30594Bza != null) {
            interfaceC30594Bza.LIZ(allVisibleItems, c1q6.LJZ.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        o.LJIIIZ(obj, "$this$null");
        return new C11280cO(((C11280cO) ((InterfaceC88472Yns) iDqS443S0100000.l0).invoke(obj)).LIZ);
    }

    public static final Object invoke$22(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        String newKey = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        o.LJIIIZ(newKey, "newKey");
        C514920j.LJIIL((C514920j) iDqS443S0100000.l0, newKey, booleanValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        String newKey = (String) obj;
        double doubleValue = ((Number) obj2).doubleValue();
        o.LJIIIZ(newKey, "newKey");
        C514920j.LJIILIIL((C514920j) iDqS443S0100000.l0, newKey, doubleValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        String newKey = (String) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(newKey, "newKey");
        C514920j.LJIILJJIL((C514920j) iDqS443S0100000.l0, newKey, intValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        String newKey = (String) obj;
        long longValue = ((Number) obj2).longValue();
        o.LJIIIZ(newKey, "newKey");
        C514920j.LJIILL((C514920j) iDqS443S0100000.l0, newKey, longValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        String newKey = (String) obj;
        String newValue = (String) obj2;
        o.LJIIIZ(newKey, "newKey");
        o.LJIIIZ(newValue, "newValue");
        C514920j.LJIILLIIL((C514920j) iDqS443S0100000.l0, newKey, newValue);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        String err = (String) obj;
        o.LJIIIZ(err, "err");
        ((InterfaceC18170nV) iDqS443S0100000.l0).LIZ(err);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(IDqS443S0100000 iDqS443S0100000, Object Saver, Object obj) {
        long longValue = ((Number) obj).longValue();
        o.LJIIIZ(Saver, "$this$Saver");
        if (C20320qy.LIZ((InterfaceC20310qx) iDqS443S0100000.l0, longValue)) {
            return Long.valueOf(longValue);
        }
        return null;
    }

    public static final Object invoke$29(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        long j = ((C10370av) obj2).LIZ;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        ((InterfaceC18630oF) iDqS443S0100000.l0).LIZLLL(j);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        ((InterfaceC88473Ynt) iDqS443S0100000.l0).invoke(-4, obj, obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        long j = ((C10370av) obj2).LIZ;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        ((InterfaceC18630oF) iDqS443S0100000.l0).LIZLLL(j);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        C0NB.LIZIZ("KaraokeDownloader", "onFail");
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDqS443S0100000.l0;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(IDqS443S0100000 iDqS443S0100000, Object newVisibleItems, Object obj) {
        EnumC21150sJ enumC21150sJ;
        TreeMap allVisibleItems = (TreeMap) obj;
        o.LJIIIZ(newVisibleItems, "newVisibleItems");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        KaraokeSongListFragment karaokeSongListFragment = (KaraokeSongListFragment) iDqS443S0100000.l0;
        DataChannel dataChannel = karaokeSongListFragment.LJLJLLL;
        List<C279917z> data = karaokeSongListFragment.Al().getData();
        long j = ((KaraokeSongListFragment) iDqS443S0100000.l0).LJLJJLL;
        if (!allVisibleItems.isEmpty()) {
            if (j == -997) {
                enumC21150sJ = EnumC21150sJ.SEARCH;
            } else if (j == -998) {
                enumC21150sJ = EnumC21150sJ.REQUESTS;
            } else if (j == -999) {
                enumC21150sJ = EnumC21150sJ.QUEUE;
            } else {
                enumC21150sJ = EnumC21150sJ.NORMAL;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (C279917z c279917z : data) {
                C279917z c279917z2 = c279917z;
                if (!c279917z2.LJII() && !c279917z2.LJIIIIZZ()) {
                    arrayList3.add(c279917z);
                }
            }
            for (Map.Entry entry : allVisibleItems.entrySet()) {
                AnonymousClass011 anonymousClass011 = (AnonymousClass011) ORZ.LJLLLLLL(((C75295Tgp) entry.getValue()).LIZ, arrayList3);
                if (anonymousClass011 != null) {
                    long j2 = anonymousClass011.LIZ;
                    arrayList.add(Integer.valueOf(((C75295Tgp) entry.getValue()).LIZ + 1));
                    arrayList2.add(Long.valueOf(j2));
                }
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_live_karaoke_song_show");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJIIJ(dataChannel))) ? 1 : 0), "is_anchor");
            LIZ.LJIJJ(arrayList.toString(), "song_position_set");
            LIZ.LJIJJ(arrayList2.toString(), "music_id_set");
            LIZ.LJIJJ(enumC21150sJ.getValue(), "panel");
            LIZ.LJJIIJZLJL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(IDqS443S0100000 iDqS443S0100000, Object changed, Object obj) {
        o.LJIIIZ(changed, "changed");
        o.LJIIIZ(obj, "<anonymous parameter 1>");
        ((InterfaceC78936UyS) iDqS443S0100000.l0).LJIILLIIL(changed);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(IDqS443S0100000 iDqS443S0100000, Object changed, Object obj) {
        XJL<C76800UCe> xjl;
        o.LJIIIZ(changed, "changed");
        o.LJIIIZ(obj, "<anonymous parameter 1>");
        C36001bA c36001bA = (C36001bA) iDqS443S0100000.l0;
        synchronized (c36001bA.LIZLLL) {
            if (((EnumC24710y3) c36001bA.LJIILLIIL.getValue()).compareTo(EnumC24710y3.Idle) >= 0) {
                ((ArrayList) c36001bA.LJII).add(changed);
                xjl = c36001bA.LJJIFFI();
            } else {
                xjl = null;
            }
        }
        if (xjl != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            xjl.resumeWith(c76800UCe);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$35(IDqS443S0100000 iDqS443S0100000, Object set, Object obj) {
        InterfaceC07790Sh it = (InterfaceC07790Sh) obj;
        o.LJIIIZ(set, "$this$set");
        o.LJIIIZ(it, "it");
        T t = ((C03770Cv) iDqS443S0100000.l0).LIZ;
        o.LJI(t);
        ((AbstractC531926x) t).setModifier(it);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$36(IDqS443S0100000 iDqS443S0100000, Object set, Object obj) {
        InterfaceC23370vt it = (InterfaceC23370vt) obj;
        o.LJIIIZ(set, "$this$set");
        o.LJIIIZ(it, "it");
        T t = ((C03770Cv) iDqS443S0100000.l0).LIZ;
        o.LJI(t);
        ((AbstractC531926x) t).setDensity(it);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$37(IDqS443S0100000 iDqS443S0100000, Object set, Object obj) {
        LifecycleOwner it = (LifecycleOwner) obj;
        o.LJIIIZ(set, "$this$set");
        o.LJIIIZ(it, "it");
        T t = ((C03770Cv) iDqS443S0100000.l0).LIZ;
        o.LJI(t);
        ((AbstractC531926x) t).setLifecycleOwner(it);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$38(IDqS443S0100000 iDqS443S0100000, Object set, Object obj) {
        InterfaceC36571c5 it = (InterfaceC36571c5) obj;
        o.LJIIIZ(set, "$this$set");
        o.LJIIIZ(it, "it");
        T t = ((C03770Cv) iDqS443S0100000.l0).LIZ;
        o.LJI(t);
        ((AbstractC531926x) t).setSavedStateRegistryOwner(it);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$39(IDqS443S0100000 iDqS443S0100000, Object set, Object obj) {
        InterfaceC88472Yns it = (InterfaceC88472Yns) obj;
        o.LJIIIZ(set, "$this$set");
        o.LJIIIZ(it, "it");
        T t = ((C03770Cv) iDqS443S0100000.l0).LIZ;
        o.LJI(t);
        ((C55572Gb) t).setUpdateBlock(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        ((InterfaceC88472Yns) iDqS443S0100000.l0).invoke(new C22830v1(((Number) obj).intValue(), null, (PTYError) obj2, null, 10));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$40(IDqS443S0100000 iDqS443S0100000, Object set, Object obj) {
        EnumC23500w6 it = (EnumC23500w6) obj;
        o.LJIIIZ(set, "$this$set");
        o.LJIIIZ(it, "it");
        T t = ((C03770Cv) iDqS443S0100000.l0).LIZ;
        o.LJI(t);
        View view = (View) t;
        int i = C24910yN.LIZ[it.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new C162476Zf();
            }
        } else {
            i2 = 0;
        }
        view.setLayoutDirection(i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            C25820zq.LIZIZ(b.LJJII(InterfaceC07790Sh.LJJJI, false, C27G.LJLIL), C1DJ.LJ(interfaceC24520xk, -533674951, new IDqS443S0100000((InterfaceC24760y8) iDqS443S0100000.l0, (InterfaceC24760y8<? extends InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>>) 42)), interfaceC24520xk, 48, 0);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$42(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            ((InterfaceC88471Ynr) ((InterfaceC24760y8) iDqS443S0100000.l0).getValue()).invoke(interfaceC24520xk, 0);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !interfaceC24520xk.LIZ()) {
            ((InterfaceC88471Ynr) ((InterfaceC24760y8) iDqS443S0100000.l0).getValue()).invoke(interfaceC24520xk, 0);
        } else {
            interfaceC24520xk.LIZLLL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        ((C12U) iDqS443S0100000.l0).LIZ.LIZ.LLLLZLLIL(((Number) obj).intValue(), ((Number) obj2).intValue());
        ((C12U) iDqS443S0100000.l0).LIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$45(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C12U c12u = (C12U) iDqS443S0100000.l0;
        C278217i c278217i = c12u.LIZ;
        C45101pq c45101pq = c278217i.LIZ;
        c12u.LJJII(c278217i, c45101pq.LJLJJL, intValue, c45101pq.LJLJJLL, intValue2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$46(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        ((C278217i) iDqS443S0100000.l0).LIZ.LLLLZLLIL(((Number) obj).intValue(), ((Number) obj2).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$47(IDqS443S0100000 iDqS443S0100000, Object newVisibleItems, Object obj) {
        TreeMap allVisibleItems = (TreeMap) obj;
        o.LJIIIZ(newVisibleItems, "newVisibleItems");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        SoundEffectFragment soundEffectFragment = (SoundEffectFragment) iDqS443S0100000.l0;
        DataChannel dataChannel = soundEffectFragment.dataChannel;
        C44351od c44351od = soundEffectFragment.LJLILLLLZI;
        if (c44351od != null) {
            C08930Wr.LIZLLL(dataChannel, allVisibleItems, c44351od.LJLIL, EnumC08920Wq.NORMAL);
            return C76800UCe.LIZ;
        }
        o.LJIJI("soundEffectAdapter");
        throw null;
    }

    public static final Object invoke$48(IDqS443S0100000 iDqS443S0100000, Object newVisibleItems, Object obj) {
        TreeMap allVisibleItems = (TreeMap) obj;
        o.LJIIIZ(newVisibleItems, "newVisibleItems");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        SoundEffectFragment soundEffectFragment = (SoundEffectFragment) iDqS443S0100000.l0;
        DataChannel dataChannel = soundEffectFragment.dataChannel;
        C44351od c44351od = soundEffectFragment.LJLILLLLZI;
        if (c44351od != null) {
            C08930Wr.LIZLLL(dataChannel, allVisibleItems, c44351od.LJLIL, EnumC08920Wq.NORMAL);
            return C76800UCe.LIZ;
        }
        o.LJIJI("soundEffectAdapter");
        throw null;
    }

    public static final Object invoke$49(IDqS443S0100000 iDqS443S0100000, Object newVisibleItems, Object obj) {
        TreeMap allVisibleItems = (TreeMap) obj;
        o.LJIIIZ(newVisibleItems, "newVisibleItems");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        SoundEffectMiniWidget soundEffectMiniWidget = (SoundEffectMiniWidget) iDqS443S0100000.l0;
        DataChannel dataChannel = soundEffectMiniWidget.dataChannel;
        C44351od c44351od = soundEffectMiniWidget.LJLJJL;
        if (c44351od != null) {
            C08930Wr.LIZLLL(dataChannel, allVisibleItems, c44351od.LJLIL, EnumC08920Wq.SHORTCUT);
            return C76800UCe.LIZ;
        }
        o.LJIJI("soundEffectAdapter");
        throw null;
    }

    public static final Object invoke$5(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((InterfaceC65784Pro) iDqS443S0100000.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$50(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        AbstractC24810yD it = (AbstractC24810yD) obj2;
        o.LJIIIZ(obj, "$this$null");
        o.LJIIIZ(it, "it");
        ((AnonymousClass167) iDqS443S0100000.l0).LIZ().LIZIZ = it;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$51(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        C29321Dc c29321Dc = (C29321Dc) obj;
        final InterfaceC88471Ynr it = (InterfaceC88471Ynr) obj2;
        o.LJIIIZ(c29321Dc, "$this$null");
        o.LJIIIZ(it, "it");
        final AnonymousClass164 LIZ = ((AnonymousClass167) iDqS443S0100000.l0).LIZ();
        final String str = LIZ.LJIIJJI;
        c29321Dc.LJFF(new AbstractC29311Db(str) { // from class: X.1pd
            @Override // X.InterfaceC273215k
            public final InterfaceC273515n LIZJ(InterfaceC44861pS measure, List<? extends InterfaceC39071g7> measurables, long j) {
                o.LJIIIZ(measure, "$this$measure");
                o.LJIIIZ(measurables, "measurables");
                C55902Hi c55902Hi = AnonymousClass164.this.LJI;
                EnumC23500w6 layoutDirection = measure.getLayoutDirection();
                c55902Hi.getClass();
                o.LJIIIZ(layoutDirection, "<set-?>");
                c55902Hi.LJLIL = layoutDirection;
                AnonymousClass164.this.LJI.LJLILLLLZI = measure.getDensity();
                AnonymousClass164.this.LJI.LJLJI = measure.LJJJJI();
                AnonymousClass164 anonymousClass164 = AnonymousClass164.this;
                anonymousClass164.LIZLLL = 0;
                final InterfaceC273515n invoke = it.invoke(anonymousClass164.LJI, new C23360vs(j));
                final AnonymousClass164 anonymousClass1642 = AnonymousClass164.this;
                final int i = anonymousClass1642.LIZLLL;
                return new InterfaceC273515n() { // from class: X.1gL
                    @Override // X.InterfaceC273515n
                    public final void LIZJ() {
                        anonymousClass1642.LIZLLL = i;
                        InterfaceC273515n.this.LIZJ();
                        AnonymousClass164 anonymousClass1643 = anonymousClass1642;
                        anonymousClass1643.LIZ(anonymousClass1643.LIZLLL);
                    }

                    @Override // X.InterfaceC273515n
                    public final java.util.Map<AbstractC272415c, Integer> LJI() {
                        return InterfaceC273515n.this.LJI();
                    }

                    @Override // X.InterfaceC273515n
                    public final int getHeight() {
                        return InterfaceC273515n.this.getHeight();
                    }

                    @Override // X.InterfaceC273515n
                    public final int getWidth() {
                        return InterfaceC273515n.this.getWidth();
                    }
                };
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$52(IDqS443S0100000 iDqS443S0100000, Object obj, Object it) {
        C29321Dc c29321Dc = (C29321Dc) obj;
        o.LJIIIZ(c29321Dc, "$this$null");
        o.LJIIIZ(it, "it");
        AnonymousClass167 anonymousClass167 = (AnonymousClass167) iDqS443S0100000.l0;
        AnonymousClass164 anonymousClass164 = c29321Dc.LLIIII;
        if (anonymousClass164 == null) {
            anonymousClass164 = new AnonymousClass164(c29321Dc, anonymousClass167.LIZ);
            c29321Dc.LLIIII = anonymousClass164;
        }
        anonymousClass167.LIZIZ = anonymousClass164;
        ((AnonymousClass167) iDqS443S0100000.l0).LIZ().LIZIZ();
        AnonymousClass164 LIZ = ((AnonymousClass167) iDqS443S0100000.l0).LIZ();
        InterfaceC272515d value = ((AnonymousClass167) iDqS443S0100000.l0).LIZ;
        o.LJIIIZ(value, "value");
        if (LIZ.LIZJ != value) {
            LIZ.LIZJ = value;
            LIZ.LIZ(0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        List<MusicSong> list;
        TreeMap allVisibleItems = (TreeMap) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        BGMListFragment bGMListFragment = (BGMListFragment) iDqS443S0100000.l0;
        DataChannel dataChannel = bGMListFragment.LJLILLLLZI;
        C33491Td c33491Td = bGMListFragment.LJLJL;
        if (c33491Td != null) {
            list = c33491Td.LJLL;
        } else {
            list = null;
        }
        C14360hM.LJFF(dataChannel, allVisibleItems, list, false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        TreeMap allVisibleItems = (TreeMap) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(allVisibleItems, "allVisibleItems");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL((LiveBGMPlaylistFragment) iDqS443S0100000.l0);
        BGMPlaylistViewModel bGMPlaylistViewModel = ((LiveBGMPlaylistFragment) iDqS443S0100000.l0).LJLILLLLZI;
        if (bGMPlaylistViewModel != null) {
            C14360hM.LJFF(LJIILIIL, allVisibleItems, bGMPlaylistViewModel.jv0(), true);
            return C76800UCe.LIZ;
        }
        o.LJIJI("playlistViewModel");
        throw null;
    }

    public static final Object invoke$8(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        List<ProfileNaviFeature> list;
        List<String> list2 = (List) obj;
        String uri = (String) obj2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("uploadNaviAsset: ");
        LIZ.append(list2);
        LIZ.append(", ");
        LIZ.append(uri);
        C0NB.LJ("auto_creation", X1D.LIZIZ(LIZ));
        if (list2.isEmpty()) {
            o.LJIIIIZZ(uri, "uri");
            if (uri.length() == 0) {
                C0NB.LJ("auto_creation", "uploadNaviAsset failed");
                ((NaviAvatarListPresenter) iDqS443S0100000.l0).LJ();
                return C76800UCe.LIZ;
            }
        }
        C20000qS c20000qS = ((NaviAvatarListPresenter) iDqS443S0100000.l0).LJLLLL;
        List list3 = null;
        if (c20000qS != null) {
            UrlModel urlModel = new UrlModel();
            urlModel.uri = uri;
            urlModel.urlList = list2;
            c20000qS.LIZLLL = new ProfileNaviStaticImage("webp", null, urlModel);
        }
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        Gson gson = C09650Zl.LIZJ;
        String LIZ2 = C0DC.LIZ();
        C20000qS c20000qS2 = ((NaviAvatarListPresenter) iDqS443S0100000.l0).LJLLLL;
        if (c20000qS2 != null) {
            list = c20000qS2.LIZJ;
            ProfileNaviStaticImage profileNaviStaticImage = c20000qS2.LIZLLL;
            if (profileNaviStaticImage != null) {
                list3 = C47261Igj.LJJIJ(profileNaviStaticImage);
            }
        } else {
            list = null;
        }
        iHostAction.createNewNavi(GsonProtectorUtils.toJson(gson, new ProfileNaviUploadDataModel(null, LIZ2, "#A5E6FF", list, list3)), new IDqS416S0100000((NaviAvatarListPresenter) iDqS443S0100000.l0, 73));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS443S0100000 iDqS443S0100000, Object obj, Object obj2) {
        String key = (String) obj;
        String filePath = (String) obj2;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(filePath, "filePath");
        return Integer.valueOf(((BaseMultiGuestStickerView) iDqS443S0100000.l0).LJLL.LJI(key, filePath));
    }
}
