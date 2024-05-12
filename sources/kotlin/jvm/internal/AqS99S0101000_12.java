package kotlin.jvm.internal;

import X.AEK;
import X.ARI;
import X.AbstractC65781Prl;
import X.AbstractC71950SLq;
import X.AbstractC73133Sn3;
import X.ActivityC45651qj;
import X.C142425iQ;
import X.C16880lQ;
import X.C187447Xg;
import X.C188727au;
import X.C1A7;
import X.C1B3;
import X.C212428Vi;
import X.C213358Yx;
import X.C26048AKe;
import X.C26227ARb;
import X.C2U8;
import X.C33381Ss;
import X.C43I;
import X.C69947Rcl;
import X.C70404Rk8;
import X.C70691Rol;
import X.C71951SLr;
import X.C72019SOh;
import X.C72062SPy;
import X.C72197SVd;
import X.C72513Sd3;
import X.C72983Skd;
import X.C73310Spu;
import X.C76800UCe;
import X.C8YN;
import X.EnumC72126SSk;
import X.FMX;
import X.InterfaceC88472Yns;
import X.OPB;
import X.OSZ;
import X.SI5;
import X.SIN;
import X.SND;
import X.SNE;
import X.SRH;
import X.SVL;
import X.SVX;
import X.TBV;
import X.WHL;
import Y.ACListenerS46S1100000_12;
import Y.IDDListenerS151S0100000_12;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.PrivateAccountViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.QuitBaAccountProcessor;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.widget.PdpHeadNavBarAssem;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryState;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpHeaderViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelCounterWidget;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.music.ab.MusicCollectUiStyleConfig;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes13.dex */
public class AqS99S0101000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0176, code lost:
    
        if (r3.intValue() == 1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS99S0101000_12 r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS99S0101000_12.invoke$0(kotlin.jvm.internal.AqS99S0101000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJIIIIZZ(R.string.ey7, new AqS99S0101000_12((SNE) aqS99S0101000_12.l0, aqS99S0101000_12.i1, 2));
        actionGroup.LJI(R.string.ey6, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        MusicModel musicModel;
        String str;
        String str2;
        Music music;
        C187447Xg it = (C187447Xg) obj;
        o.LJIIIZ(it, "it");
        String str3 = ((MusicDetailViewModel) ((MusicFavoriteButtonAssem) aqS99S0101000_12.l0).LJLLILLLL.getValue()).LJLILLLLZI;
        if (str3 != null) {
            MusicDetail LIZ = it.LJLIL.LIZ();
            if (LIZ != null && (music = LIZ.music) != null) {
                music.setCollectStatus(aqS99S0101000_12.i1);
                musicModel = music.convertToMusicModel();
            } else {
                musicModel = null;
            }
            C72197SVd c72197SVd = new C72197SVd(musicModel, aqS99S0101000_12.i1);
            c72197SVd.LJLJI = "music_detail";
            C2U8.LIZ(c72197SVd);
            C2U8.LIZ(new C213358Yx(str3, aqS99S0101000_12.i1, false));
            MobClick obtain = MobClick.obtain();
            if (aqS99S0101000_12.i1 == 1) {
                str = "collection_music_cancel";
            } else {
                str = "collection_music";
            }
            obtain.setEventName(str);
            obtain.setLabelName("single_song");
            if (musicModel != null) {
                str2 = musicModel.getMusicId();
            } else {
                str2 = null;
            }
            obtain.setValue(String.valueOf(str2));
            obtain.setExtValueLong(0L);
            FMX.onEvent(obtain);
            if (aqS99S0101000_12.i1 == 1) {
                MusicFavoriteButtonAssem musicFavoriteButtonAssem = (MusicFavoriteButtonAssem) aqS99S0101000_12.l0;
                musicFavoriteButtonAssem.getClass();
                boolean LIZJ = C1A7.LJIILJJIL().LIZJ("is_need_show_collect_succed_dialog", true);
                ActivityC45651qj LIZ2 = C212428Vi.LIZ(musicFavoriteButtonAssem);
                if (LIZ2 != null) {
                    if (LIZJ) {
                        musicFavoriteButtonAssem.LJLZ = true;
                        C1A7.LJIILJJIL().LJI("is_need_show_collect_succed_dialog", false);
                        SVX.LIZ.getClass();
                        if (((MusicCollectUiStyleConfig) SVX.LIZJ.getValue()).newMusicCollectDialog) {
                            String str4 = musicFavoriteButtonAssem.N3().LJLIL;
                            if (str4 != null && !TextUtils.isEmpty(str4)) {
                                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(musicFavoriteButtonAssem.x3().getContext()), R.layout.buw, null, false);
                                o.LJIIIIZZ(LLLLIILL, "from(contentView.context…ed_favorite, null, false)");
                                TextView textView = (TextView) LLLLIILL.findViewById(R.id.gt2);
                                C72062SPy c72062SPy = new C72062SPy();
                                c72062SPy.LIZJ(R.string.ii8);
                                c72062SPy.LJ(4);
                                c72062SPy.LIZ = true;
                                c72062SPy.LIZIZ(42);
                                textView.setText(c72062SPy.LIZ(LIZ2));
                                C16880lQ.LJIIJ(new ACListenerS46S1100000_12(musicFavoriteButtonAssem, str4, 11), LLLLIILL);
                                C142425iQ c142425iQ = new C142425iQ(LIZ2);
                                c142425iQ.LJI(WHL.BOTTOM);
                                c142425iQ.LIZIZ(musicFavoriteButtonAssem.x3());
                                c142425iQ.LIZ.LJIJ = LLLLIILL;
                                c142425iQ.LJIIJ(null, true);
                                c142425iQ.LJIIIZ(R.attr.d5);
                                c142425iQ.LJ(new AqS162S0100000_12(musicFavoriteButtonAssem, 1195));
                                c142425iQ.LIZJ().show();
                                SVL.LIZIZ("2", "New format", musicFavoriteButtonAssem.M3(), musicFavoriteButtonAssem.N3().LJLIL);
                            }
                        } else {
                            ARI ari = new ARI(LIZ2);
                            ari.LJI(R.string.icb, null);
                            C26227ARb c26227ARb = new C26227ARb(LIZ2);
                            c26227ARb.LIZ(R.string.bgh);
                            c26227ARb.LJ(R.string.bgf);
                            c26227ARb.LJIIL = ari;
                            C33381Ss c33381Ss = new C33381Ss();
                            c33381Ss.LJLIL = R.drawable.bc6;
                            c26227ARb.LJIIIZ = new C73310Spu(0, LIZ2, c33381Ss.LIZ(LIZ2));
                            c26227ARb.LIZLLL = new IDDListenerS151S0100000_12(musicFavoriteButtonAssem, 4);
                            c26227ARb.LJI().LIZLLL();
                        }
                    } else if (!musicFavoriteButtonAssem.LJZ) {
                        musicFavoriteButtonAssem.LJZ = true;
                        C8YN.LJII(musicFavoriteButtonAssem, musicFavoriteButtonAssem.N3(), new TBV() { // from class: X.8SQ
                            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                            public final Object get(Object obj2) {
                                return ((C8SO) obj2).LJLILLLLZI;
                            }

                            @Override // X.TBV, X.AbstractC74224TBc
                            public final void set(Object obj2, Object obj3) {
                                ((C8SO) obj2).LJLILLLLZI = (CollectMusicResponse) obj3;
                            }
                        }, null, new AqS194S0100000_12(musicFavoriteButtonAssem, 259), 6);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        SIN setState = (SIN) obj;
        o.LJIIIZ(setState, "$this$setState");
        return SIN.LIZ(setState, null, null, null, null, null, new C43I(new SRH((EnumC72126SSk) aqS99S0101000_12.l0, aqS99S0101000_12.i1)), null, null, null, 991);
    }

    public static final Object invoke$12(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        MiniPdpHeaderViewModel.MiniPdpHeaderState setState = (MiniPdpHeaderViewModel.MiniPdpHeaderState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return MiniPdpHeaderViewModel.MiniPdpHeaderState.copy$default(setState, null, new OPB(aqS99S0101000_12.i1, (Image) aqS99S0101000_12.l0, setState.getImages()), 1, null);
    }

    public static final Object invoke$13(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        int intValue = aqS99S0101000_12.i1 - ((Number) obj).intValue();
        AbstractC73133Sn3 abstractC73133Sn3 = (AbstractC73133Sn3) aqS99S0101000_12.l0;
        abstractC73133Sn3.LJLJI = Math.max(abstractC73133Sn3.LJLJI, intValue);
        AbstractC73133Sn3 abstractC73133Sn32 = (AbstractC73133Sn3) aqS99S0101000_12.l0;
        if (abstractC73133Sn32.LJLJI > 0 && !abstractC73133Sn32.LJLIL) {
            abstractC73133Sn32.LJLIL = true;
            abstractC73133Sn32.LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        SkuState state = (SkuState) obj;
        o.LJIIIZ(state, "state");
        if (aqS99S0101000_12.i1 > state.getCurrentQuantityLimit().LJLILLLLZI) {
            SkuPanelCounterWidget skuPanelCounterWidget = (SkuPanelCounterWidget) aqS99S0101000_12.l0;
            View view = skuPanelCounterWidget.contentView;
            if (view != null) {
                String string = skuPanelCounterWidget.getContainer().getContext().getResources().getString(R.string.f3v, Integer.valueOf(state.getCurrentQuantityLimit().LJLILLLLZI));
                o.LJIIIIZZ(string, "container.context.resour…                        )");
                C26048AKe c26048AKe = new C26048AKe(view);
                c26048AKe.LJI(string);
                c26048AKe.LJII();
            }
            ((SkuPanelCounterWidget) aqS99S0101000_12.l0).getMViewModel().hw0(state.getCurrentQuantityLimit().LJLILLLLZI, new C70404Rk8(true, true));
            return C76800UCe.LIZ;
        }
        if (aqS99S0101000_12.i1 < state.getCurrentQuantityLimit().LJLIL) {
            SkuPanelCounterWidget skuPanelCounterWidget2 = (SkuPanelCounterWidget) aqS99S0101000_12.l0;
            View view2 = skuPanelCounterWidget2.contentView;
            if (view2 != null) {
                if (skuPanelCounterWidget2.getMViewModel().Z90()) {
                    skuPanelCounterWidget2.LIZ().LIZIZ(skuPanelCounterWidget2.LIZ().LJFF);
                } else {
                    String string2 = skuPanelCounterWidget2.getContainer().getContext().getResources().getString(R.string.f42, Integer.valueOf(state.getCurrentQuantityLimit().LJLIL));
                    o.LJIIIIZZ(string2, "container.context.resour…                        )");
                    C26048AKe c26048AKe2 = new C26048AKe(view2);
                    c26048AKe2.LJI(string2);
                    c26048AKe2.LJII();
                }
                return C76800UCe.LIZ;
            }
            return null;
        }
        ((SkuPanelCounterWidget) aqS99S0101000_12.l0).getMViewModel().hw0(aqS99S0101000_12.i1, new C70404Rk8(true, false));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS99S0101000_12 aqS99S0101000_12, Object it) {
        o.LJIIIZ(it, "it");
        ((AbstractC71950SLq) aqS99S0101000_12.l0).LLIIIL(aqS99S0101000_12.i1);
        C71951SLr.LIZ(((AbstractC71950SLq) aqS99S0101000_12.l0).LLIIIZ(), true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.p5i, new AqS99S0101000_12((AbstractC71950SLq) aqS99S0101000_12.l0, aqS99S0101000_12.i1, 15));
        actionGroup.LJIIIIZZ(R.string.p5h, new AqS178S0100000_12((AbstractC71950SLq) aqS99S0101000_12.l0, 471));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(aqS99S0101000_12.i1, new AqS177S0100000_11((QuitBaAccountProcessor) aqS99S0101000_12.l0, 29));
        actionGroup.LJIIIIZZ(R.string.pbh, C72019SOh.LJLIL);
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        boolean z;
        C69947Rcl it = (C69947Rcl) obj;
        o.LJIIIZ(it, "it");
        if (it.LJLJI == -1) {
            PdpHeadNavBarAssem pdpHeadNavBarAssem = (PdpHeadNavBarAssem) aqS99S0101000_12.l0;
            float f = (1.0f / PdpHeadNavBarAssem.LJLZ) * aqS99S0101000_12.i1;
            pdpHeadNavBarAssem.LJLLILLLL = f;
            boolean z2 = true;
            pdpHeadNavBarAssem.LJLLJ = 1 - f;
            View _$_findCachedViewById = pdpHeadNavBarAssem._$_findCachedViewById(R.id.e3b);
            if (((PdpHeadNavBarAssem) aqS99S0101000_12.l0).LJLLJ > 0.9f) {
                z = true;
            } else {
                z = false;
            }
            _$_findCachedViewById.setClickable(z);
            View _$_findCachedViewById2 = ((PdpHeadNavBarAssem) aqS99S0101000_12.l0)._$_findCachedViewById(R.id.e3a);
            if (((PdpHeadNavBarAssem) aqS99S0101000_12.l0).LJLLILLLL <= 0.9f) {
                z2 = false;
            }
            _$_findCachedViewById2.setClickable(z2);
            ((PdpHeadNavBarAssem) aqS99S0101000_12.l0)._$_findCachedViewById(R.id.e3a).setAlpha(((PdpHeadNavBarAssem) aqS99S0101000_12.l0).LJLLILLLL);
            ((PdpHeadNavBarAssem) aqS99S0101000_12.l0)._$_findCachedViewById(R.id.e3b).setAlpha(((PdpHeadNavBarAssem) aqS99S0101000_12.l0).LJLLJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        int i;
        if (!((Boolean) obj).booleanValue() && ((C72983Skd) aqS99S0101000_12.l0).LJLILLLLZI < aqS99S0101000_12.i1) {
            i = 0;
        } else {
            i = ((C72983Skd) aqS99S0101000_12.l0).LJLILLLLZI - aqS99S0101000_12.i1;
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$2(AqS99S0101000_12 aqS99S0101000_12, Object it) {
        o.LJIIIZ(it, "it");
        ((SNE) aqS99S0101000_12.l0).LLIIIL(aqS99S0101000_12.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("drop_down_list_name", "CPF");
        logView.plusAssign("action_type", "show");
        logView.plusAssign("item_num", Integer.valueOf(((CpfVH) aqS99S0101000_12.l0).LJLJLLL));
        logView.plusAssign("rank", Integer.valueOf(aqS99S0101000_12.i1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70691Rol) aqS99S0101000_12.l0).getClass();
        C70691Rol.LIZIZ(logNode);
        int i = aqS99S0101000_12.i1;
        if (i == 1) {
            logNode.plusAssign("button_name", "relevance");
        } else if (i == 2) {
            logNode.plusAssign("button_name", "recent");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70691Rol) aqS99S0101000_12.l0).getClass();
        C70691Rol.LIZIZ(logNode);
        logNode.plusAssign("notice_number", Integer.valueOf(aqS99S0101000_12.i1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        ((C70691Rol) aqS99S0101000_12.l0).getClass();
        C70691Rol.LIZIZ(logNode);
        int i = aqS99S0101000_12.i1;
        if (i == 1) {
            logNode.plusAssign("button_name", "relevance");
        } else if (i == 2) {
            logNode.plusAssign("button_name", "recent");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        ReviewGalleryState it = (ReviewGalleryState) obj;
        o.LJIIIZ(it, "it");
        if (it.getSubstate().getHasMore().LIZ) {
            if (aqS99S0101000_12.i1 > it.getSubstate().getList().size() - 4) {
                ((ReviewGalleryViewModel) aqS99S0101000_12.l0).LJIIJJI();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        Object obj2;
        Object obj3;
        LaneParams update = (LaneParams) obj;
        o.LJIIIZ(update, "$this$update");
        update.plusAssign("data_state", Integer.valueOf(aqS99S0101000_12.i1));
        HashMap<String, Object> trackParams = ((IPdpStarter.PdpEnterParam) aqS99S0101000_12.l0).getTrackParams();
        Object obj4 = null;
        if (trackParams != null) {
            obj2 = trackParams.get("entrance_form");
        } else {
            obj2 = null;
        }
        update.plusAssign("entrance_form", obj2);
        HashMap<String, Object> trackParams2 = ((IPdpStarter.PdpEnterParam) aqS99S0101000_12.l0).getTrackParams();
        if (trackParams2 != null) {
            obj3 = trackParams2.get("source_page_type");
        } else {
            obj3 = null;
        }
        update.plusAssign("source_page_type", obj3);
        HashMap<String, Object> trackParams3 = ((IPdpStarter.PdpEnterParam) aqS99S0101000_12.l0).getTrackParams();
        if (trackParams3 != null) {
            obj4 = trackParams3.get("enter_from_info");
        }
        update.plusAssign("enter_from_info", obj4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJIIIIZZ(R.string.eif, new AqS99S0101000_12((SND) aqS99S0101000_12.l0, aqS99S0101000_12.i1, 27));
        actionGroup.LJI(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS99S0101000_12 aqS99S0101000_12, Object it) {
        o.LJIIIZ(it, "it");
        ((SND) aqS99S0101000_12.l0).LLIIIL(aqS99S0101000_12.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        ProfileNaviDataModel navi = (ProfileNaviDataModel) obj;
        o.LJIIIZ(navi, "navi");
        ((ProfileNaviActivity) aqS99S0101000_12.l0).LLIIIILZ().Nv0(navi);
        ((ProfileNaviActivity) aqS99S0101000_12.l0).LLIIIZ(aqS99S0101000_12.i1, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS99S0101000_12 aqS99S0101000_12, Object it) {
        FragmentManager supportFragmentManager;
        o.LJIIIZ(it, "it");
        SI5 si5 = ((C72513Sd3) aqS99S0101000_12.l0).LJLIL.LJLJJLL;
        Fragment fragment = si5.LJLILLLLZI;
        if (fragment == null || (supportFragmentManager = fragment.getFragmentManager()) == null) {
            supportFragmentManager = si5.LJLIL.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        }
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        Fragment LJJJIL = supportFragmentManager.LJJJIL("DELETE_NOTICE_ACTION_SHEET_TAG");
        if (LJJJIL != null) {
            c1b3.LJJI(LJJJIL);
            c1b3.LJI();
        }
        ((C72513Sd3) aqS99S0101000_12.l0).LIZ(aqS99S0101000_12.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.b4a, new AqS99S0101000_12((PrivateAccountViewModel) aqS99S0101000_12.l0, aqS99S0101000_12.i1, 5));
        actionGroup.LJIIIIZZ(R.string.ehl, null);
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.eiv, new AqS99S0101000_12((PrivateAccountViewModel) aqS99S0101000_12.l0, aqS99S0101000_12.i1, 6));
        actionGroup.LJIIIIZZ(R.string.eiw, AEK.LJLIL);
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS99S0101000_12 aqS99S0101000_12, Object it) {
        o.LJIIIZ(it, "it");
        PrivateAccountViewModel privateAccountViewModel = (PrivateAccountViewModel) aqS99S0101000_12.l0;
        privateAccountViewModel.LJLJJLL = 1;
        privateAccountViewModel.lv0(aqS99S0101000_12.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS99S0101000_12 aqS99S0101000_12, Object it) {
        String str;
        o.LJIIIZ(it, "it");
        PrivateAccountViewModel privateAccountViewModel = (PrivateAccountViewModel) aqS99S0101000_12.l0;
        privateAccountViewModel.LJLJJLL = 2;
        privateAccountViewModel.lv0(aqS99S0101000_12.i1);
        if (aqS99S0101000_12.i1 == 1) {
            str = "on";
        } else {
            str = "off";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "privacy_and_safety_settings");
        c188727au.LJIIIZ("status", str);
        FMX.LJIIL("click_live_change_privacy_account_popup", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((AnchorPanelAdapter) aqS99S0101000_12.l0).LL(aqS99S0101000_12.i1, false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        PdpMainState it = (PdpMainState) obj;
        o.LJIIIZ(it, "it");
        if (it.getLoadingStatus() == -1) {
            PdpHeadNavBarWidget.Companion.getClass();
            float f = (1.0f / PdpHeadNavBarWidget.HEADER_HEIGHT) * aqS99S0101000_12.i1;
            ((PdpHeadNavBarWidget) aqS99S0101000_12.l0).configTab(f, it.getTabs());
            ((PdpHeadNavBarWidget) aqS99S0101000_12.l0).tryLoadOtherData(f);
        }
        ((PdpHeadNavBarWidget) aqS99S0101000_12.l0).trySendCartEntryShowLog();
        ((PdpHeadNavBarWidget) aqS99S0101000_12.l0).trySendShareIconShowLog();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS99S0101000_12 aqS99S0101000_12, Object obj) {
        SkuState setState = (SkuState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return SkuState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OSZ(Integer.valueOf(aqS99S0101000_12.i1), (C70404Rk8) aqS99S0101000_12.l0), 0, null, null, false, null, null, null, false, null, null, null, false, null, null, null, null, 2147467263, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(int i, C70404Rk8 c70404Rk8, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c70404Rk8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(int i, QuitBaAccountProcessor quitBaAccountProcessor, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = quitBaAccountProcessor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(int i, IPdpStarter.PdpEnterParam pdpEnterParam, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = pdpEnterParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(int i, PdpHeadNavBarWidget pdpHeadNavBarWidget, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = pdpHeadNavBarWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(int i, ReviewGalleryViewModel reviewGalleryViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = reviewGalleryViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(int i, SkuPanelCounterWidget skuPanelCounterWidget, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = skuPanelCounterWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(int i, Image image, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = image;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(C70691Rol c70691Rol, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c70691Rol;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(AbstractC71950SLq abstractC71950SLq, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = abstractC71950SLq;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(SND snd, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = snd;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(SNE sne, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = sne;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(EnumC72126SSk enumC72126SSk, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = enumC72126SSk;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(C72513Sd3 c72513Sd3, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c72513Sd3;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(C72983Skd c72983Skd, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c72983Skd;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(AbstractC73133Sn3 abstractC73133Sn3, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = abstractC73133Sn3;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(PrivateAccountViewModel privateAccountViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = privateAccountViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(AnchorPanelAdapter anchorPanelAdapter, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = anchorPanelAdapter;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(CpfVH cpfVH, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = cpfVH;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(PdpHeadNavBarAssem pdpHeadNavBarAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = pdpHeadNavBarAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(MusicFavoriteButtonAssem musicFavoriteButtonAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = musicFavoriteButtonAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS99S0101000_12(ProfileNaviActivity profileNaviActivity, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = profileNaviActivity;
        this.i1 = i;
    }
}
