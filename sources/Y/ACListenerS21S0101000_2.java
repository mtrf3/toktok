package Y;

import X.ActivityC45651qj;
import X.AnonymousClass744;
import X.C0JU;
import X.C133785Mw;
import X.C138855cf;
import X.C145995oB;
import X.C153065za;
import X.C153075zb;
import X.C153155zj;
import X.C1545664u;
import X.C1548265u;
import X.C157146Es;
import X.C157176Ev;
import X.C157196Ex;
import X.C161416Vd;
import X.C161436Vf;
import X.C161486Vk;
import X.C169786lS;
import X.C169816lV;
import X.C170426mU;
import X.C170456mX;
import X.C170506mc;
import X.C170596ml;
import X.C171256np;
import X.C171286ns;
import X.C171506oE;
import X.C174446sy;
import X.C174456sz;
import X.C17N;
import X.C188727au;
import X.C1B8;
import X.C224748ru;
import X.C30116Brs;
import X.C44687HgJ;
import X.C5J1;
import X.C5RT;
import X.C60903NvH;
import X.C66I;
import X.C66T;
import X.C66Y;
import X.C67P;
import X.C6XP;
import X.C6XQ;
import X.C6ZT;
import X.C78915Uy7;
import X.C84507XEp;
import X.EnumC135185Sg;
import X.FMX;
import X.G5K;
import X.G9M;
import X.GUT;
import X.GXR;
import X.H7R;
import X.InterfaceC139695e1;
import X.InterfaceC1549166d;
import X.InterfaceC157206Ey;
import X.InterfaceC1797373p;
import X.InterfaceC65784Pro;
import X.KMV;
import X.R3Y;
import X.UYG;
import X.XWS;
import X.XXG;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.detail.panel.MusicFeedPanel;
import com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.StickerEffectTabFragment;
import com.ss.android.ugc.aweme.effect.TimeEffectTabFragment;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.livewallpaper.ui.LocalLiveWallPaperActivity;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchMixUserCell;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes3.dex */
public class ACListenerS21S0101000_2 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                ((DetailAwemeListFragment) aCListenerS21S0101000_2.l0).refresh();
                return;
            case 1:
                C161416Vd c161416Vd = (C161416Vd) aCListenerS21S0101000_2.l0;
                C161436Vf c161436Vf = c161416Vd.LJLJI;
                C161486Vk c161486Vk = c161436Vf.LJLJJL;
                if (c161486Vk != null) {
                    Iterator it = ((ArrayList) c161486Vk.LIZ).iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        C17N.LJJI(c161486Vk.LIZJ).LJIIIIZZ();
                        next.getClass();
                        throw null;
                    }
                }
                c161436Vf.invalidate();
                c161416Vd.LLIIJLIL.clear();
                InterfaceC1549166d interfaceC1549166d = c161416Vd.LLIIJI;
                if (interfaceC1549166d == null || !(interfaceC1549166d instanceof C153155zj)) {
                    return;
                }
                c161416Vd.LLIILZL.getClass();
                throw null;
            default:
                ((SettingNewVersionFragment) aCListenerS21S0101000_2.l0).lambda$initUnits$76(view);
                return;
        }
    }

    public static final void onClick$1(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                ((MusicFeedPanel) ((LifecycleOwner) aCListenerS21S0101000_2.l0)).LLILII();
                return;
            case 1:
                ((LocalLiveWallPaperActivity) ((LifecycleOwner) aCListenerS21S0101000_2.l0)).findWallpapersTvClick(view);
                return;
            case 2:
                ((SettingNewVersionFragment) ((LifecycleOwner) aCListenerS21S0101000_2.l0)).lambda$initUnits$62(view);
                return;
            default:
                VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) ((LifecycleOwner) aCListenerS21S0101000_2.l0);
                InterfaceC65784Pro<Void> interfaceC65784Pro = vEVideoPublishPreviewScene.LLIILII;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                } else {
                    ActivityC45651qj LLII = vEVideoPublishPreviewScene.LLII();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (LLII != null && vEVideoPublishPreviewScene.LLJILJIL != null) {
                        if (!C1B8.LIZJ()) {
                            final ARunnableS21S0200000_2 aRunnableS21S0200000_2 = new ARunnableS21S0200000_2(vEVideoPublishPreviewScene, LLII, currentTimeMillis, 17);
                            C60903NvH.LJIIJJI().getPublishService().LJI();
                            GUT.LIZ(LLII, "jump_to_login_page");
                            C60903NvH.LJIIJJI().getAccountService().LIZ(LLII, "video_post_page", "click_shoot", null, new R3Y() { // from class: X.6aX
                                @Override // X.R3Y
                                public final void onCancel() {
                                }

                                @Override // X.R3Y
                                public final void onSuccess() {
                                    aRunnableS21S0200000_2.run();
                                }
                            });
                        } else {
                            C60903NvH.LJIIJJI().getPublishService().LJIILL(vEVideoPublishPreviewScene.LJLLJ, LLII, vEVideoPublishPreviewScene.LLJILJIL, vEVideoPublishPreviewScene);
                        }
                    }
                }
                vEVideoPublishPreviewScene.LLILL = true;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$10(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        Comment comment;
        char c;
        EffectPointModel effectPointModel = null;
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                AnonymousClass744 anonymousClass744 = (AnonymousClass744) aCListenerS21S0101000_2.l0;
                if (anonymousClass744.LLIL != null && (comment = anonymousClass744.LJLILLLLZI) != null) {
                    C174456sz c174456sz = (C174456sz) ((HashMap) C174446sy.LIZ).get(comment.getFakeId());
                    if (c174456sz != null && c174456sz.LIZ == 2) {
                        ((CommentListFragment) anonymousClass744.LLIL).Jn(anonymousClass744.LJLILLLLZI);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C171286ns c171286ns = (C171286ns) aCListenerS21S0101000_2.l0;
                int adapterPosition = c171286ns.getAdapterPosition();
                if (adapterPosition == -1) {
                    return;
                }
                C171256np c171256np = c171286ns.LJLJJLL;
                if (c171256np.LJLJJL == adapterPosition) {
                    c171256np.LJLJJL = -1;
                    c = 2;
                } else {
                    if (C44687HgJ.LIZIZ(((EffectModel) ListProtector.get(c171256np.LJLILLLLZI, adapterPosition)).resDir)) {
                        c171286ns.LJLJJLL.LJLJJL = adapterPosition;
                    } else {
                        c171286ns.LJLJJLL.LJLJJL = -1;
                    }
                    c = 1;
                }
                C171256np c171256np2 = c171286ns.LJLJJLL;
                C171506oE c171506oE = c171256np2.LJLJJI;
                if (c171506oE != null) {
                    EffectModel effectModel = (EffectModel) ListProtector.get(c171256np2.LJLILLLLZI, c171286ns.getAdapterPosition());
                    if (effectModel.isGoToCapCutEffect) {
                        EditEffectVideoModel editEffectVideoModel = c171506oE.LIZ.LJLLL;
                        if (editEffectVideoModel != null) {
                            g0.LJJIL(editEffectVideoModel.gv0(), effectModel);
                        } else {
                            o.LJIJI("mViewModel");
                            throw null;
                        }
                    } else {
                        StickerEffectTabFragment stickerEffectTabFragment = c171506oE.LIZ;
                        EditEffectVideoModel editEffectVideoModel2 = stickerEffectTabFragment.LJLLL;
                        if (editEffectVideoModel2 != null) {
                            Effect effect = (Effect) ListProtector.get(stickerEffectTabFragment.wl(), adapterPosition);
                            if (c == 2) {
                                if (stickerEffectTabFragment.LJLJLJ != null && C84507XEp.LJ(effect)) {
                                    if (!stickerEffectTabFragment.LJLLILLLL.isEmpty()) {
                                        Object remove = ListProtector.remove(stickerEffectTabFragment.LJLLILLLL, 0);
                                        o.LJIIIIZZ(remove, "mEffectPointModelStack.removeAt(0)");
                                        EffectPointModel effectPointModel2 = (EffectPointModel) remove;
                                        editEffectVideoModel2.hv0().LJI().setValue(C5RT.LJ(effectPointModel2.getIndex(), effectPointModel2.getUuid()));
                                    }
                                    ((TextView) stickerEffectTabFragment._$_findCachedViewById(R.id.lwl)).setText(stickerEffectTabFragment.getString(R.string.byq));
                                }
                            } else {
                                stickerEffectTabFragment.Dl(adapterPosition);
                                if (stickerEffectTabFragment.LJLJLJ != null && C84507XEp.LJ(effect)) {
                                    MutableLiveData<VEEffectSelectOp> jv0 = editEffectVideoModel2.jv0();
                                    if (!stickerEffectTabFragment.LJLLILLLL.isEmpty()) {
                                        effectPointModel = (EffectPointModel) ListProtector.remove(stickerEffectTabFragment.LJLLILLLL, 0);
                                    }
                                    jv0.setValue(VEEffectSelectOp.selectSticker(effectModel, effectPointModel));
                                    LiveData liveData = (LiveData) editEffectVideoModel2.LJLLJ.getValue();
                                    String str = effectModel.hint;
                                    C170596ml c170596ml = new C170596ml();
                                    if (str == null) {
                                        str = "";
                                    }
                                    c170596ml.LIZIZ = str;
                                    c170596ml.LIZJ = 2000L;
                                    liveData.setValue(c170596ml);
                                    ((TextView) stickerEffectTabFragment._$_findCachedViewById(R.id.lwl)).setText(stickerEffectTabFragment.getString(R.string.byq));
                                    ArrayList<EffectPointModel> J7 = editEffectVideoModel2.hv0().J7();
                                    if (!J7.isEmpty()) {
                                        stickerEffectTabFragment.LJLLILLLL.add(ListProtector.get(J7, J7.size() - 1));
                                    } else {
                                        C0JU.LIZLLL("add effect fail");
                                    }
                                } else {
                                    stickerEffectTabFragment.Al(new AqS149S0200000_2(stickerEffectTabFragment, effect, 10));
                                }
                            }
                        } else {
                            o.LJIJI("mViewModel");
                            throw null;
                        }
                    }
                }
                c171286ns.LJLJJLL.notifyDataSetChanged();
                return;
            case 2:
                C161416Vd c161416Vd = (C161416Vd) aCListenerS21S0101000_2.l0;
                C161436Vf c161436Vf = c161416Vd.LJLJI;
                C161486Vk c161486Vk = c161436Vf.LJLJJL;
                if (c161486Vk != null) {
                    Iterator it = ((ArrayList) c161486Vk.LIZ).iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        C17N.LJJI(c161486Vk.LIZJ).LJIIIIZZ();
                        next.getClass();
                        throw null;
                    }
                }
                c161436Vf.invalidate();
                c161416Vd.LJII(false, null);
                return;
            case 3:
                RecyclerView.ViewHolder LJJIZ = ((SearchMixUserCell) aCListenerS21S0101000_2.l0).LJLLILLLL.LJJIZ(0);
                if (LJJIZ instanceof SearchUserViewHolder) {
                    ((SearchUserViewHolder) LJJIZ).onClick(LJJIZ.itemView);
                    return;
                }
                return;
            default:
                Context context = (Context) aCListenerS21S0101000_2.l0;
                context.getClass();
                FMX.onEventV3("enter_age_confirm_setting");
                SmartRouter.buildRoute(context, "aweme://hyd_action/age_confirmation").open();
                return;
        }
    }

    public static final void onClick$11(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        CaptionStruct captionStruct;
        VideoPublishEditModel xl;
        CommentListFragment commentListFragment;
        C224748ru c224748ru;
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                InterfaceC1797373p interfaceC1797373p = ((AnonymousClass744) aCListenerS21S0101000_2.l0).LLIL;
                if (interfaceC1797373p != null && (c224748ru = (commentListFragment = (CommentListFragment) interfaceC1797373p).LJLZ) != null) {
                    commentListFragment.LLIZ.LJJLIIIJ(c224748ru.getHint(), "click_gift_comment");
                    return;
                }
                return;
            case 1:
                ((KMV) aCListenerS21S0101000_2.l0).onBackPressed();
                return;
            case 2:
                C170456mX c170456mX = (C170456mX) aCListenerS21S0101000_2.l0;
                int adapterPosition = c170456mX.getAdapterPosition();
                if (adapterPosition == -1) {
                    return;
                }
                boolean z = ((EffectModel) ListProtector.get(c170456mX.LJLJJI.LJLIL, adapterPosition)).isEnabled;
                C170506mc c170506mc = c170456mX.LJLJJI.LJLILLLLZI;
                if (c170506mc != null && c170506mc.LIZ.mo49getActivity() != null && c170506mc.LIZ.xl() != null) {
                    VideoPublishEditModel xl2 = c170506mc.LIZ.xl();
                    if (xl2 != null) {
                        captionStruct = xl2.captionStruct;
                    } else {
                        captionStruct = null;
                    }
                    if ((captionStruct != null || ((xl = c170506mc.LIZ.xl()) != null && H7R.LJJIIZ(xl))) && adapterPosition != 0) {
                        TimeEffectTabFragment timeEffectTabFragment = c170506mc.LIZ;
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(R.string.bxu);
                        C78915Uy7.LJJIJIIJI(timeEffectTabFragment, 1045, creativeToastBuilder);
                    } else {
                        if (!z) {
                            return;
                        }
                        if (C169816lV.LIZLLL(c170506mc.LIZ.wl(), adapterPosition)) {
                            TimeEffectTabFragment timeEffectTabFragment2 = c170506mc.LIZ;
                            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                            creativeToastBuilder2.messageRes(R.string.fsp);
                            C78915Uy7.LJJIJIIJI(timeEffectTabFragment2, 3011, creativeToastBuilder2);
                            return;
                        }
                        EditEffectVideoModel editEffectVideoModel = c170506mc.LIZ.LJLJI;
                        if (editEffectVideoModel != null) {
                            editEffectVideoModel.jv0().setValue(VEEffectSelectOp.selectTime(adapterPosition));
                            C170426mU c170426mU = c170456mX.LJLJJI;
                            c170426mU.LJLJI = adapterPosition;
                            c170426mU.notifyDataSetChanged();
                            return;
                        }
                        o.LJIJI("viewModel");
                        throw null;
                    }
                }
                if (!z) {
                }
                return;
            case 3:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS21S0101000_2.l0;
                String str = i18nSettingManageMyAccountActivity.LJLJLLL;
                if (str == null || str.isEmpty()) {
                    return;
                }
                i18nSettingManageMyAccountActivity.LJLJL = false;
                SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, i18nSettingManageMyAccountActivity.LJLJLLL).open();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("region_status", i18nSettingManageMyAccountActivity.LJLJLJ);
                c188727au.LJIIIZ("enter_from", "settings_page");
                FMX.LJIIL("account_region_status_click", c188727au.LIZ);
                return;
            default:
                ((SettingNewVersionFragment) aCListenerS21S0101000_2.l0).lambda$initUnits$66(view);
                return;
        }
    }

    public static final void onClick$12(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        String str;
        C153065za c153065za;
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                ((StickerPropDetailFragment) aCListenerS21S0101000_2.l0).Gl("click_icon");
                return;
            default:
                C66Y c66y = (C66Y) aCListenerS21S0101000_2.l0;
                C1548265u c1548265u = c66y.LJLJI;
                if (c1548265u != null && (c153065za = c1548265u.LJLJLJ) != null) {
                    c153065za.LJIIL();
                    c1548265u.invalidate();
                }
                c66y.LJIIJ(false, null, false);
                if (c66y.LL != null) {
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("enter_from", "video_edit_page");
                    c145995oB.LJI("shoot_way", c66y.LL.mShootWay);
                    c145995oB.LJI("creation_id", c66y.LL.getCreationId());
                    c145995oB.LJI("content_type", c66y.LL.getAvetParameter().getContentType());
                    c145995oB.LJI("content_source", c66y.LL.getAvetParameter().getContentSource());
                    InterfaceC1549166d interfaceC1549166d = c66y.LLIL;
                    if (interfaceC1549166d instanceof C153075zb) {
                        str = ((C153075zb) interfaceC1549166d).LJLJI.stickerId;
                    } else if (interfaceC1549166d instanceof C67P) {
                        str = "text_sticker";
                    } else {
                        str = "";
                    }
                    c145995oB.LJI("prop_id", str);
                    GXR.LIZ("prop_pin_cancel", c145995oB.LIZ);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$13(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        C153075zb c153075zb;
        C153065za c153065za;
        int i = 0;
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                AbstractDetailFragment abstractDetailFragment = (AbstractDetailFragment) aCListenerS21S0101000_2.l0;
                abstractDetailFragment.mScrollableLayout.scrollTo(0, -abstractDetailFragment.mScrollableLayout.getCurScrollY());
                return;
            case 1:
                ((SettingNewVersionFragment) aCListenerS21S0101000_2.l0).lambda$initUnits$19(view);
                return;
            default:
                C66Y c66y = (C66Y) aCListenerS21S0101000_2.l0;
                C1548265u c1548265u = c66y.LJLJI;
                if (c1548265u != null && (c153065za = c1548265u.LJLJLJ) != null) {
                    c153065za.LJIIL();
                    c1548265u.invalidate();
                }
                c66y.LLILII.clear();
                InterfaceC1549166d interfaceC1549166d = c66y.LLIL;
                if (interfaceC1549166d == null || !(interfaceC1549166d instanceof C153075zb)) {
                    c153075zb = null;
                } else {
                    c153075zb = (C153075zb) interfaceC1549166d;
                }
                String str = "";
                if (c153075zb != null) {
                    C66T c66t = c66y.LLILLIZIL;
                    c66t.getClass();
                    c153075zb.LJLJI.getId();
                    c66t.LJFF = c153075zb;
                    String str2 = c153075zb.LJLJI.uuid;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c66t.LIZLLL = str2;
                    c66t.LIZIZ.LLJILJIL(false);
                    c66t.LIZIZ.LLIIJLIL(c66t.LJIIJ);
                    C66I c66i = c66t.LJI;
                    if (c66i != null) {
                        c66i.LIZ.LJIIJ(false, null, true);
                    }
                    i = c153075zb.LJLLJ;
                }
                if (c66y.LL != null) {
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("enter_from", "video_edit_page");
                    c145995oB.LJI("shoot_way", c66y.LL.mShootWay);
                    c145995oB.LJI("creation_id", c66y.LL.getCreationId());
                    c145995oB.LJI("content_type", c66y.LL.getAvetParameter().getContentType());
                    c145995oB.LJI("content_source", c66y.LL.getAvetParameter().getContentSource());
                    InterfaceC1549166d interfaceC1549166d2 = c66y.LLIL;
                    if (interfaceC1549166d2 instanceof C153075zb) {
                        str = ((C153075zb) interfaceC1549166d2).LJLJI.stickerId;
                    } else if (interfaceC1549166d2 instanceof C67P) {
                        str = "text_sticker";
                    }
                    c145995oB.LJI("prop_id", str);
                    c145995oB.LIZ(i, "is_diy_prop");
                    GXR.LIZ("prop_pin_confirm", c145995oB.LIZ);
                    return;
                }
                return;
        }
    }

    public static final void onClick$14(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        switch (aCListenerS21S0101000_2.i1) {
            case 1:
                ((SettingNewVersionFragment) aCListenerS21S0101000_2.l0).onVersionClick(view);
                return;
            default:
                NewCutPlayerActivity this$0 = (NewCutPlayerActivity) aCListenerS21S0101000_2.l0;
                o.LJIIIZ(this$0, "this$0");
                this$0.onBackPressed();
                return;
        }
    }

    public static final void onClick$2(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                ((Dialog) aCListenerS21S0101000_2.l0).hide();
                return;
            case 1:
                ((BaseNewMusicTabFragment) aCListenerS21S0101000_2.l0).Ml();
                return;
            case 2:
                ((ShootFeedPanel) aCListenerS21S0101000_2.l0).LLIIL(view);
                return;
            case 3:
                ((LocalLiveWallPaperActivity) aCListenerS21S0101000_2.l0).howSetWallpapersTvClick(view);
                return;
            case 4:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aCListenerS21S0101000_2.l0;
                i18nSettingManageMyAccountActivity.getClass();
                SmartRoute buildRoute = SmartRouter.buildRoute(i18nSettingManageMyAccountActivity, "//account/setting/self");
                buildRoute.withParam("IS_ACCOUNT_INFO", true);
                buildRoute.withParam("dob_status", i18nSettingManageMyAccountActivity.LJLJJI);
                buildRoute.open();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "settings_page");
                FMX.LJIIL("enter_account_info", c188727au.LIZ);
                return;
            default:
                VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aCListenerS21S0101000_2.l0;
                vEVideoPublishPreviewScene.getClass();
                if (C6XP.LIZIZ() || !C6XP.LIZ()) {
                    vEVideoPublishPreviewScene.LLIIJI.setVisibility(4);
                    vEVideoPublishPreviewScene.LLD.setVisibility(4);
                    vEVideoPublishPreviewScene.LL.setVisibility(4);
                } else {
                    vEVideoPublishPreviewScene.LLIIL.setVisibility(0);
                }
                vEVideoPublishPreviewScene.LJZL.setVisibility(4);
                vEVideoPublishPreviewScene.LJZI.setVisibility(4);
                vEVideoPublishPreviewScene.LLIIII.setVisibility(4);
                vEVideoPublishPreviewScene.LLIIIILZ.setVisibility(4);
                VideoPublishEditModel mModel = vEVideoPublishPreviewScene.LJLLJ;
                String str = vEVideoPublishPreviewScene.LLFII;
                o.LJIIIZ(mModel, "mModel");
                FMX.LJIIL("click_delete_virtual_feed_button", C6XQ.LIZ(mModel, str, true).LIZ);
                vEVideoPublishPreviewScene.LLIL = true;
                return;
        }
    }

    public static final void onClick$3(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        C5J1 V8;
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                ((BaseDiscoverAndSearchFragmentNew) aCListenerS21S0101000_2.l0).om();
                return;
            case 1:
                ((SettingNewVersionFragment) aCListenerS21S0101000_2.l0).lambda$initUnits$102(view);
                return;
            case 2:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aCListenerS21S0101000_2.l0;
                VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                videoPublishEditModel.creativeModel.transientPostPageModel.LJJJI = videoPublishEditModel.isPrivate;
                C60903NvH.LJIIJJI().getPublishService().LJJIIZI().getClass();
                G9M.LIZJ(videoPublishContainerScene.LLILZLL, "video_post_page", null);
                G5K g5k = videoPublishContainerScene.LLIIIILZ;
                if (g5k != null) {
                    int LIZ = g5k.LIZ();
                    videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIIJZLJL = "click_audience_select";
                    C60903NvH.LJIIJJI().getPublishService().LJJIIZI().getClass();
                    G9M.LJFF(videoPublishContainerScene.LLILZLL, "video_post_page", LIZ, new AObjectS42S0101000_5(4, videoPublishContainerScene, 55));
                    return;
                }
                return;
            case 3:
                ((UYG) aCListenerS21S0101000_2.l0).LJLLILLLL.run();
                return;
            default:
                NewCutPlayerActivity this$0 = (NewCutPlayerActivity) aCListenerS21S0101000_2.l0;
                o.LJIIIZ(this$0, "this$0");
                this$0.LLIIII.getClass();
                C133785Mw c133785Mw = this$0.LJLJJL;
                if (c133785Mw == null || (V8 = c133785Mw.V8()) == null) {
                    return;
                }
                if (V8.LJJIL() == EnumC135185Sg.STARTED) {
                    V8.pause();
                    return;
                } else {
                    V8.play();
                    return;
                }
        }
    }

    public static final void onClick$4(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                C1545664u c1545664u = (C1545664u) aCListenerS21S0101000_2.l0;
                if (c1545664u.getVisibility() != 0) {
                    return;
                }
                c1545664u.LLIIZ = true;
                if (c1545664u.LLJILJIL == null) {
                    return;
                }
                if (C138855cf.LIZ()) {
                    c1545664u.LLIILII = false;
                }
                C157146Es c157146Es = c1545664u.LLIIJI;
                if (c157146Es != null) {
                    c157146Es.LIZ();
                }
                c1545664u.LLJILJIL.LIZ();
                InterfaceC139695e1 interfaceC139695e1 = c1545664u.LLIIIL;
                if (interfaceC139695e1 == null) {
                    return;
                }
                interfaceC139695e1.LJI();
                return;
            case 1:
                C157176Ev c157176Ev = (C157176Ev) aCListenerS21S0101000_2.l0;
                C30116Brs c30116Brs = c157176Ev.LJLJJI.LJLIL;
                if (c30116Brs != null) {
                    MusicCollectionItem musicCollectionItem = c157176Ev.LJLJI;
                    c157176Ev.getLayoutPosition();
                    InterfaceC157206Ey interfaceC157206Ey = ((XWS) c30116Brs.LJLIL).LJI;
                    if (interfaceC157206Ey != null) {
                        interfaceC157206Ey.LLLF(musicCollectionItem);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = (BaseDiscoverAndSearchFragmentNew) aCListenerS21S0101000_2.l0;
                baseDiscoverAndSearchFragmentNew.getClass();
                if (C6ZT.LIZ(view) || C157196Ex.LIZ()) {
                    return;
                }
                baseDiscoverAndSearchFragmentNew.pm();
                return;
            case 3:
                SettingNewVersionFragment.lambda$initUnits$108((Context) aCListenerS21S0101000_2.l0, view);
                return;
            case 4:
                ((SettingNewVersionFragment) aCListenerS21S0101000_2.l0).lambda$initUnits$96(view);
                return;
            default:
                ((C66Y) aCListenerS21S0101000_2.l0).LIZIZ();
                return;
        }
    }

    public static final void onClick$5(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                ((LiveRoomNotifyWidget) aCListenerS21S0101000_2.l0).LJZI();
                return;
            case 1:
                aCListenerS21S0101000_2.l0.getClass();
                return;
            default:
                ((C66Y) aCListenerS21S0101000_2.l0).LIZJ();
                return;
        }
    }

    public static final void onClick$6(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                ((LiveRoomNotifyWidget) aCListenerS21S0101000_2.l0).LJZI();
                return;
            case 1:
                ((SettingNewVersionFragment) aCListenerS21S0101000_2.l0).lambda$initUnits$111(view);
                return;
            default:
                ((C66Y) aCListenerS21S0101000_2.l0).LJIJ();
                return;
        }
    }

    public static final void onClick$7(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                PublicScreenWidget.LJZ((PublicScreenWidget) aCListenerS21S0101000_2.l0);
                return;
            case 1:
                CommentListFragment.Il((CommentListFragment) aCListenerS21S0101000_2.l0);
                return;
            default:
                C161416Vd c161416Vd = (C161416Vd) aCListenerS21S0101000_2.l0;
                C161436Vf c161436Vf = c161416Vd.LJLJI;
                C161486Vk c161486Vk = c161436Vf.LJLJJL;
                if (c161486Vk != null) {
                    Iterator it = ((ArrayList) c161486Vk.LIZ).iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        C17N.LJJI(c161486Vk.LIZJ).LJIIIIZZ();
                        next.getClass();
                        throw null;
                    }
                }
                c161436Vf.invalidate();
                c161416Vd.LJI(false, null, false);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$8(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                ((DialogFragment) aCListenerS21S0101000_2.l0).dismiss();
                return;
            case 1:
                XXG xxg = (XXG) aCListenerS21S0101000_2.l0;
                xxg.onClick(view);
                if (xxg.T()) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "change_music_page");
                    FMX.LJIIL("play_private_music", c188727au.LIZ);
                    return;
                }
                return;
            default:
                C169786lS c169786lS = (C169786lS) aCListenerS21S0101000_2.l0;
                C5RT c5rt = (C5RT) c169786lS.LIZJ.getValue();
                if (c5rt != null && c5rt.LJI == 0) {
                    return;
                }
                c169786lS.LJIJI.setCurrentItem(((Integer) view.getTag()).intValue());
                return;
        }
    }

    public static final void onClick$9(ACListenerS21S0101000_2 aCListenerS21S0101000_2, View view) {
        switch (aCListenerS21S0101000_2.i1) {
            case 0:
                ((AnonymousClass744) ((LifecycleOwner) aCListenerS21S0101000_2.l0)).P(view, "click_button");
                return;
            case 1:
                ((MusicFeedPanel) ((LifecycleOwner) aCListenerS21S0101000_2.l0)).LLILII();
                return;
            case 2:
                Fragment fragment = (Fragment) ((LifecycleOwner) aCListenerS21S0101000_2.l0);
                fragment.getClass();
                a.LJIILL().LJIJI(fragment.mo49getActivity());
                return;
            default:
                VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) ((LifecycleOwner) aCListenerS21S0101000_2.l0);
                vEVideoPublishPreviewScene.LLLILZ();
                vEVideoPublishPreviewScene.LLIL = false;
                return;
        }
    }

    public ACListenerS21S0101000_2(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
