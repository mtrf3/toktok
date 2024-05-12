package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS5S0201000_2;
import Y.AgS120S0100000_2;
import Y.AgS72S0300000_2;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerState;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.67C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C67C extends WM7 implements InterfaceC143795kd, InterfaceC1547265k, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LL;
    public final C82622Wbi LJLIL;
    public InterfaceC152085y0 LJLILLLLZI;
    public final C82631Wbr LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82632Wbs LJLL;
    public final C82632Wbs LJLLI;
    public final C82632Wbs LJLLILLLL;
    public ARunnableS5S0201000_2 LJLLJ;
    public ToolSafeHandler LJLLL;
    public InterfaceC1549866k<View> LJLLLL;
    public FrameLayout LJLLLLLL;
    public InterfaceC137115Zr LJLZ;
    public final C1548866a LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    static {
        TBT tbt = new TBT(C67C.class, "editStickerPanelApi", "getEditStickerPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/panel/EditStickerPanelApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C67C.class, "editPollStickerApi", "getEditPollStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/poll/EditPollStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C67C.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C67C.class, "editInfoStickerApi", "getEditInfoStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/info/EditInfoStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C67C.class, "editMentionStickerApi", "getEditMentionStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/mention/EditMentionStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C67C.class, "editHashTagStickerApi", "getEditHashTagStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/hashtag/EditHashTagStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C67C.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C67C.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C67C.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp), C61845OOz.LIZJ(C67C.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp)};
    }

    public final EditDonationStickerViewModel LLJILJIL() {
        return (EditDonationStickerViewModel) this.LJLJJLL.getValue();
    }

    public final InterfaceC147865rC LLJILJILJ() {
        return (InterfaceC147865rC) this.LJLLILLLL.LIZ(this, LL[9]);
    }

    public final VideoPublishEditModel LLJJ() {
        return (VideoPublishEditModel) this.LJLL.LIZ(this, LL[7]);
    }

    public final C1556769b LLJJI() {
        return (C1556769b) this.LJZI.getValue();
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJLLL.LIZ(this, LL[6]);
    }

    public final void LJJ() {
        List<StickerItemModel> list;
        LLJJI().LJJIJIIJI(getEditPreviewApi().Kh().getValue(), getEditPreviewApi());
        C67E c67e = new C67E(null, 15);
        List<InteractStickerStruct> LJI = C164826dS.LJI(LLJJ().getMainBusinessContext(), 4, EnumC164816dR.TRACK_PAGE_EDIT);
        InfoStickerModel infoStickerModel = LLJJ().infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            Iterator<StickerItemModel> it = list.iterator();
            while (it.hasNext()) {
                StickerItemModel next = it.next();
                if (next.type == 7) {
                    c67e.LJLIL = (C6J6) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), next.extra, OrganizationModel.class);
                    c67e.LJLJI = next.startTime;
                    c67e.LJLJJI = next.endTime;
                    LLJJI().LJJIJ(next.path);
                    LLJJI().LLII = next.stickerId;
                    it.remove();
                }
            }
        }
        if (LJI == null || LJI.isEmpty() || c67e.LJLIL == null) {
            return;
        }
        c67e.LJLILLLLZI = (InteractStickerStruct) ListProtector.get(LJI, 0);
        LLJJI().LJJIZ(c67e, false, true);
        LLJJI().LJJIFFI((InteractStickerStruct) ListProtector.get(LJI, 0));
        EditDonationStickerViewModel LLJILJIL = LLJILJIL();
        if (LLJILJIL == null) {
            return;
        }
        LLJILJIL.setState(C1550266o.LJLIL);
    }

    public final void LLJJIII() {
        CreateAnchorInfo createAnchorInfo;
        PublishExtensionModel fromString = PublishExtensionModel.fromString(LLJJ().commerceData);
        List<CreateAnchorInfo> list = fromString.createAnchorInfos;
        if (list != null) {
            Iterator<CreateAnchorInfo> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    createAnchorInfo = it.next();
                    if (createAnchorInfo.getType() == 19) {
                        break;
                    }
                } else {
                    createAnchorInfo = null;
                    break;
                }
            }
            list.remove(createAnchorInfo);
        }
        LLJJ().commerceData = PublishExtensionModel.toString(fromString);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC152085y0 interfaceC152085y0 = this.LJLILLLLZI;
        if (interfaceC152085y0 != null) {
            interfaceC152085y0.LIZ((C6V4) this.LJZL.getValue());
        } else {
            o.LJIJI("gestureService");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        ToolSafeHandler toolSafeHandler = this.LJLLL;
        if (toolSafeHandler != null) {
            ARunnableS5S0201000_2 aRunnableS5S0201000_2 = this.LJLLJ;
            if (aRunnableS5S0201000_2 != null) {
                toolSafeHandler.removeCallbacks(aRunnableS5S0201000_2);
                return;
            } else {
                o.LJIJI("mNonInfoStickerPlayingRefreshTask");
                throw null;
            }
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        ToolSafeHandler toolSafeHandler = this.LJLLL;
        if (toolSafeHandler != null) {
            ARunnableS5S0201000_2 aRunnableS5S0201000_2 = this.LJLLJ;
            if (aRunnableS5S0201000_2 != null) {
                toolSafeHandler.postDelayed(aRunnableS5S0201000_2, 200L);
                return;
            } else {
                o.LJIJI("mNonInfoStickerPlayingRefreshTask");
                throw null;
            }
        }
        o.LJIJI("safeHandler");
        throw null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C67C(C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
        this.LJLJI = UCI.LJII(c82622Wbi, InterfaceC164126cK.class, null);
        UCI.LJI(c82622Wbi, C63R.class, null);
        this.LJLJJI = UCI.LJI(c82622Wbi, InterfaceC139655dx.class, null);
        this.LJLJJL = UCI.LJI(c82622Wbi, InterfaceC147905rG.class, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 811));
        this.LJLJL = UCI.LJI(c82622Wbi, C63I.class, null);
        this.LJLJLJ = UCI.LJI(c82622Wbi, C63H.class, null);
        this.LJLJLLL = UCI.LJI(c82622Wbi, InterfaceC143655kP.class, null);
        this.LJLL = UCI.LJI(c82622Wbi, VideoPublishEditModel.class, null);
        this.LJLLI = UCI.LJI(c82622Wbi, C137965bE.class, null);
        this.LJLLILLLL = UCI.LJI(c82622Wbi, InterfaceC147865rC.class, null);
        this.LJZ = new C1548866a(LLJJ());
        this.LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 813));
        this.LJZL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 812));
    }

    public final void LLJJIJI(boolean z) {
        LLJJI().LJLJI = z;
    }

    public final void LLJJIJIIJIL(FragmentManager fragmentManager) {
        C42848Grk c42848Grk = new C42848Grk(LLJJ().mShootWay, LLJJ().getCreationId(), H8F.LJI(LLJJ()), H8F.LJII(LLJJ()));
        AbstractC42651GoZ LJJIJIIJIL = C86793Y4n.LJJIJIIJIL(this);
        C42847Grj c42847Grj = (C42847Grj) LJJIJIIJIL.findSceneByTag("EditSelectDonationOrganizationScene");
        if (c42847Grj == null) {
            c42847Grj = new C42847Grj();
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("mob_params", c42848Grk);
        bundle.putBoolean("from_fragment", false);
        c42847Grj.mArguments = bundle;
        if (!LJJIJIIJIL.isAdded(c42847Grj)) {
            LJJIJIIJIL.add(R.id.j5l, c42847Grj, "EditSelectDonationOrganizationScene", R.anim.fq);
        }
        c42847Grj.LJLJL = new InterfaceC42864Gs0() { // from class: X.67D
            @Override // X.InterfaceC42864Gs0
            public final void onDismiss() {
                C67C c67c = C67C.this;
                c67c.getEditPreviewApi().Ml(false);
                InterfaceC153045zY value = c67c.getEditPreviewApi().Kh().getValue();
                if (value != null) {
                    value.play();
                }
            }

            @Override // X.InterfaceC42864Gs0
            public final void LIZ(C6J6 org2) {
                C1557269g c1557269g;
                C6J6 c6j6;
                o.LJIIIZ(org2, "org");
                C67C c67c = C67C.this;
                InterfaceC164126cK interfaceC164126cK = (InterfaceC164126cK) c67c.LJLJI.LIZ(c67c, C67C.LL[0]);
                if (interfaceC164126cK != null) {
                    C164116cJ.LIZ(interfaceC164126cK, false, 0L, 6);
                }
                C67C.this.LLJJIII();
                if (C67C.this.LLJJI().LJLL != null) {
                    C1556769b LLJJI = C67C.this.LLJJI();
                    LLJJI.getClass();
                    String str = null;
                    if (org2.getAddTime() == null) {
                        C67E c67e = LLJJI.LLI;
                        if (c67e != null && (c6j6 = c67e.LJLIL) != null) {
                            str = c6j6.getAddTime();
                        }
                        org2.setAddTime(str);
                    }
                    C67E c67e2 = LLJJI.LLI;
                    if (c67e2 != null) {
                        c67e2.LJLIL = org2;
                    }
                    C156426By c156426By = LLJJI.LJLL;
                    if ((c156426By instanceof C1557269g) && (c1557269g = (C1557269g) c156426By) != null) {
                        c1557269g.LLIIIZ.LIZLLL(org2);
                        return;
                    }
                    return;
                }
                C67C c67c2 = C67C.this;
                C67E c67e3 = new C67E(org2, 14);
                c67c2.LLJJI().LJJIJIIJI(c67c2.getEditPreviewApi().Kh().getValue(), c67c2.getEditPreviewApi());
                c67c2.LLJJI().LJJIZ(c67e3, true, false);
            }
        };
        getEditPreviewApi().Ml(true);
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null) {
            value.pause();
        }
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        LiveData liveData;
        super.onActivityCreated(bundle);
        getEditPreviewApi().Kh().observe(this, new AObserverS70S0100000_2(this, 264));
        EditDonationStickerViewModel LLJILJIL = LLJILJIL();
        if (LLJILJIL != null) {
            C73297Sph.LJIIJJI(this, LLJILJIL, new TBT() { // from class: X.677
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((EditDonationStickerState) obj).getHideHelpBoxEvent();
                }
            }, new AqS184S0100000_2(this, 65));
        }
        EditDonationStickerViewModel LLJILJIL2 = LLJILJIL();
        if (LLJILJIL2 != null && (liveData = (LiveData) LLJILJIL2.LJLJL.getValue()) != null) {
            liveData.observe(this, new AObserverS70S0100000_2(this, 265));
        }
        EditDonationStickerViewModel LLJILJIL3 = LLJILJIL();
        if (LLJILJIL3 != null && (mutableLiveData = LLJILJIL3.LJLJLJ) != null) {
            mutableLiveData.observe(this, new AObserverS70S0100000_2(this, 266));
        }
        LLJILJILJ().N4().observe(this, new AObserverS70S0100000_2(this, 267));
        EditDonationStickerViewModel LLJILJIL4 = LLJILJIL();
        if (LLJILJIL4 != null) {
            MutableLiveData<Boolean> liveData2 = LLJILJILJ().N4();
            o.LJIIIZ(liveData2, "liveData");
            LLJILJIL4.LJLJJLL = liveData2;
        }
        LLJILJILJ().Z60().LIZIZ(this, new AObjectS84S0100000_2(this, 280));
        LLJJI().LJLLILLLL = new C6BO() { // from class: X.66n
            @Override // X.C6BO
            public final void LIZLLL() {
            }

            @Override // X.C6BO
            public final /* synthetic */ void LJI() {
            }

            @Override // X.C6BO
            public final void LJII() {
            }

            @Override // X.C6BO
            public final void LIZ() {
                EditDonationStickerViewModel LLJILJIL5 = C67C.this.LLJILJIL();
                if (LLJILJIL5 != null) {
                    LLJILJIL5.setState(C1550266o.LJLIL);
                }
            }

            @Override // X.C6BO
            public final void LIZIZ() {
                C67C.this.LLJJIII();
                C67C c67c = C67C.this;
                ((C137965bE) c67c.LJLLI.LIZ(c67c, C67C.LL[8])).LIZJ(C67C.this.LLJJI().LLII);
                EditDonationStickerViewModel LLJILJIL5 = C67C.this.LLJILJIL();
                if (LLJILJIL5 != null) {
                    LLJILJIL5.setState(C1546865g.LJLIL);
                }
            }

            @Override // X.C6BO
            public final void LIZJ() {
                C67C c67c = C67C.this;
                Activity activity = c67c.mActivity;
                o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "activity as FragmentActi…y).supportFragmentManager");
                c67c.LLJJIJIIJIL(supportFragmentManager);
                C67C.this.LJZ.LIZJ(6);
            }

            @Override // X.C6BO
            public final void LJIIIZ() {
                LIZJ();
            }

            @Override // X.C6BO
            public final void LJ(boolean z) {
                C67C c67c;
                EditDonationStickerViewModel LLJILJIL5;
                EditDonationStickerState Hv0;
                C67C c67c2 = C67C.this;
                C82632Wbs c82632Wbs = c67c2.LJLJJL;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C67C.LL;
                ((InterfaceC147905rG) c82632Wbs.LIZ(c67c2, interfaceC74236TBoArr[3])).LIZLLL();
                C67C c67c3 = C67C.this;
                ((InterfaceC139655dx) c67c3.LJLJJI.LIZ(c67c3, interfaceC74236TBoArr[2])).LIZLLL();
                if (!z || ((LLJILJIL5 = (c67c = C67C.this).LLJILJIL()) != null && (Hv0 = LLJILJIL5.Hv0(c67c)) != null && Hv0.getInTimeEditView())) {
                    C67C.this.getEditPreviewApi().U2(false, true, false);
                } else {
                    C67C.this.getEditPreviewApi().U2(true, true, true);
                }
            }

            @Override // X.C6BO
            public final void LJFF(boolean z) {
                if (z) {
                    C67C c67c = C67C.this;
                    C82632Wbs c82632Wbs = c67c.LJLJLJ;
                    InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C67C.LL;
                    ((C63H) c82632Wbs.LIZ(c67c, interfaceC74236TBoArr[5])).LIZLLL();
                    C67C c67c2 = C67C.this;
                    ((C63I) c67c2.LJLJL.LIZ(c67c2, interfaceC74236TBoArr[4])).LIZLLL();
                    C67C c67c3 = C67C.this;
                    ((InterfaceC147905rG) c67c3.LJLJJL.LIZ(c67c3, interfaceC74236TBoArr[3])).LIZLLL();
                    WM7 wm7 = C67C.this.mParentScene;
                    o.LJII(wm7, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                    C63R c63r = (C63R) C44384HbQ.LJJJI((WMH) wm7).LJ(C63R.class);
                    if (c63r != null) {
                        c63r.LIZLLL();
                    }
                    C67C c67c4 = C67C.this;
                    ((InterfaceC139655dx) c67c4.LJLJJI.LIZ(c67c4, interfaceC74236TBoArr[2])).LIZLLL();
                }
            }

            @Override // X.C6BO
            public final void LJIIIIZZ(View view) {
                o.LJIIIZ(view, "view");
                EditDonationStickerViewModel LLJILJIL5 = C67C.this.LLJILJIL();
                if (LLJILJIL5 != null) {
                    LLJILJIL5.setState(C1550266o.LJLIL);
                }
                EditDonationStickerViewModel LLJILJIL6 = C67C.this.LLJILJIL();
                if (LLJILJIL6 != null) {
                    LLJILJIL6.LJIILIIL(true);
                }
                InterfaceC1549866k<View> interfaceC1549866k = C67C.this.LJLLLL;
                if (interfaceC1549866k != null) {
                    interfaceC1549866k.accept(view);
                }
                C67C.this.LJZ.LJFF(6);
            }
        };
        this.LJLLL = new ToolSafeHandler(this);
        this.LJLLJ = new ARunnableS5S0201000_2(this, 3);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC1547265k
    public final C10K<C76800UCe> LJJIJIL(InterfaceC153045zY editor, InterfaceC137115Zr compileCallback, InterfaceC88471Ynr<? super String, ? super EnumC43649HBd, String> interfaceC88471Ynr) {
        String draftDir;
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(compileCallback, "compileCallback");
        if (LLJJI().LJIILLIIL()) {
            if (interfaceC88471Ynr == null || (draftDir = interfaceC88471Ynr.invoke("donation_sticker", EnumC43649HBd.DONATION_STICKER)) == null) {
                draftDir = C5YW.LIZIZ().LJJJJL(LLJJ(), "");
            }
            int LIZLLL = compileCallback.LJLLL().LIZLLL();
            int LJI = compileCallback.LJLLL().LJI();
            int i = editor.LLILZ().width;
            int i2 = editor.LLILZ().height;
            o.LJIIIZ(draftDir, "draftDir");
            C1556769b LLJJI = LLJJI();
            LLJJI.getClass();
            C10K LJIILL = LLJJI.LJI(LIZLLL, LJI, i, i2, draftDir).LJIILL(new AgS120S0100000_2(LLJJI, 28));
            o.LJIIIIZZ(LJIILL, "fun compileDonation(draf…else null\n        }\n    }");
            C10K<C76800UCe> LJIILLIIL = LJIILL.LJIILLIIL(new AgS72S0300000_2(editor, this, compileCallback, 7), C10K.LJIIIIZZ);
            o.LJIIIIZZ(LJIILLIIL, "override fun getInteract…ult(Unit)\n        }\n    }");
            return LJIILLIIL;
        }
        C10K<C76800UCe> LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
        o.LJIIIIZZ(LJIIIZ, "{\n            Task.forResult(Unit)\n        }");
        return LJIIIZ;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        FrameLayout frameLayout = (FrameLayout) container;
        LLJJI().getClass();
        LLJJI().LLIIII = LLJJ();
        InterfaceC153045zY value = getEditPreviewApi().Kh().getValue();
        if (value != null) {
            LLJJI().LJLLLLLL = value.LLILZ();
            LLJJI().LJIJ(this.mActivity, frameLayout);
            InterfaceC152085y0 interfaceC152085y0 = this.LJLILLLLZI;
            if (interfaceC152085y0 != null) {
                interfaceC152085y0.LIZIZ((C6V4) this.LJZL.getValue());
            } else {
                o.LJIJI("gestureService");
                throw null;
            }
        }
        this.LJLLLLLL = frameLayout;
        return new View(requireSceneContext());
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
