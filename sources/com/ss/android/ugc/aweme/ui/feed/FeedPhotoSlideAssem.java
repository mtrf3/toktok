package com.ss.android.ugc.aweme.ui.feed;

import X.ActivityC45651qj;
import X.AnonymousClass810;
import X.AnonymousClass811;
import X.AnonymousClass813;
import X.AnonymousClass814;
import X.AnonymousClass815;
import X.AnonymousClass816;
import X.AnonymousClass818;
import X.C018905p;
import X.C0C3;
import X.C161266Uo;
import X.C161296Ur;
import X.C16880lQ;
import X.C184077Kh;
import X.C188907bC;
import X.C1DH;
import X.C201347vG;
import X.C201467vS;
import X.C201667vm;
import X.C202947xq;
import X.C202957xr;
import X.C203027xy;
import X.C2044080m;
import X.C2044180n;
import X.C2044780t;
import X.C2044880u;
import X.C2044980v;
import X.C2045080w;
import X.C2045180x;
import X.C2045280y;
import X.C2045380z;
import X.C2048982j;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C224498rV;
import X.C2K0;
import X.C2U8;
import X.C38995FSd;
import X.C47704Ins;
import X.C51029K0z;
import X.C52535Kjb;
import X.C53947LFf;
import X.C55096Ljo;
import X.C55749LuL;
import X.C57072Lv;
import X.C57092Lx;
import X.C5H3;
import X.C61447O9r;
import X.C62364Odk;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6U6;
import X.C78926UyI;
import X.C78963Uyt;
import X.C7MY;
import X.C81A;
import X.C81C;
import X.C81I;
import X.C81P;
import X.C81Q;
import X.C81S;
import X.C82A;
import X.C82I;
import X.C82L;
import X.C82N;
import X.C82Y;
import X.C83G;
import X.C84K;
import X.C88S;
import X.C8SG;
import X.C8W0;
import X.C8YN;
import X.EnumC201127uu;
import X.InterfaceC161306Us;
import X.InterfaceC203057y1;
import X.InterfaceC2043980l;
import X.InterfaceC2048082a;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.JHI;
import X.KL2;
import X.NT2;
import X.ORZ;
import X.QD3;
import X.TBT;
import X.V16;
import X.X1D;
import X.XKQ;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS6S0201000_3;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.PanelSingleTapInterceptAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS14S0202000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class FeedPhotoSlideAssem extends BasePhotoSlidesAssem implements C83G, C0C3, C82Y, PanelSingleTapInterceptAbility, IPhotoModeAbility, IPhotoSlidesAbility, C6U6, PauseTimeAbility, InterfaceC2043980l, InterfaceC55102Lju {
    public final C5H3 LLIIIJ;
    public final C214378bB LLIIIL;
    public final C55749LuL LLIIIZ;
    public final C5H3 LLIIJI;
    public C84K LLIIJLIL;
    public C81C LLIIL;
    public C161266Uo LLIILII;
    public C82L LLIILZL;
    public AnonymousClass818 LLIIZ;
    public C82A LLIL;
    public C82N LLILII;
    public int LLILIL;
    public boolean LLILL;
    public boolean LLILLIZIL;
    public C203027xy LLILLJJLI;
    public final ARunnableS39S0100000_3 LLILLL;
    public boolean LLILZ;
    public XKQ LLILZIL;

    @Override // X.InterfaceC2043980l
    public final void T2(EnumC201127uu enumC201127uu) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c1s;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == 1493204508 || hashCode == 1649553494 || hashCode == 1804422228) {
            return this;
        }
        return null;
    }

    public final C82N r4() {
        Object obj;
        C82N c82n;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        PhotoModeImageUrlModel photoModeImageUrlModel2;
        int i;
        PhotoModeImageUrlModel photoModeImageUrlModel3;
        PhotoModeImageUrlModel photoModeImageUrlModel4;
        int i2;
        try {
            C84K c84k = this.LLIIJLIL;
            if (c84k != null) {
                int currentItem = c84k.getCurrentItem();
                C82N c82n2 = this.LLILII;
                if (c82n2 != null) {
                    C82I c82i = c82n2.LJIIJJI;
                    if (c82i != null) {
                        photoModeImageUrlModel3 = c82i.LIZIZ;
                    } else {
                        photoModeImageUrlModel3 = null;
                    }
                    C82L c82l = this.LLIILZL;
                    if (c82l != null) {
                        ArrayList<PhotoModeImageUrlModel> arrayList = c82l.LJLLILLLL;
                        if (c82l.LJJIII() > 0) {
                            i2 = currentItem % c82l.LJJIII();
                        } else {
                            i2 = currentItem;
                        }
                        photoModeImageUrlModel4 = (PhotoModeImageUrlModel) ORZ.LJLLLLLL(i2, arrayList);
                    } else {
                        photoModeImageUrlModel4 = null;
                    }
                    if (o.LJ(photoModeImageUrlModel3, photoModeImageUrlModel4)) {
                        return this.LLILII;
                    }
                }
                C84K c84k2 = this.LLIIJLIL;
                if (c84k2 != null) {
                    int childCount = c84k2.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        C84K c84k3 = this.LLIIJLIL;
                        if (c84k3 != null) {
                            View childAt = c84k3.getChildAt(i3);
                            if (childAt != null) {
                                obj = childAt.getTag(R.id.bpq);
                            } else {
                                obj = null;
                            }
                            if ((obj instanceof C82N) && (c82n = (C82N) obj) != null) {
                                C82I c82i2 = c82n.LJIIJJI;
                                if (c82i2 != null) {
                                    photoModeImageUrlModel = c82i2.LIZIZ;
                                } else {
                                    photoModeImageUrlModel = null;
                                }
                                C82L c82l2 = this.LLIILZL;
                                if (c82l2 != null) {
                                    ArrayList<PhotoModeImageUrlModel> arrayList2 = c82l2.LJLLILLLL;
                                    if (c82l2.LJJIII() > 0) {
                                        i = currentItem % c82l2.LJJIII();
                                    } else {
                                        i = currentItem;
                                    }
                                    photoModeImageUrlModel2 = (PhotoModeImageUrlModel) ORZ.LJLLLLLL(i, arrayList2);
                                } else {
                                    photoModeImageUrlModel2 = null;
                                }
                                if (o.LJ(photoModeImageUrlModel, photoModeImageUrlModel2)) {
                                    this.LLILII = c82n;
                                    return c82n;
                                }
                            }
                        } else {
                            o.LJIJI("viewPager");
                            throw null;
                        }
                    }
                    return null;
                }
                o.LJIJI("viewPager");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public FeedPhotoSlideAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LLIIIJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(PhotoViewModelV2.class), AnonymousClass814.INSTANCE);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1138);
        C65776Prg LIZ = C65352Pkq.LIZ(PhotoSharedViewModel.class);
        AnonymousClass816 anonymousClass816 = AnonymousClass816.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 1139);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LLIIIL = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, anonymousClass816, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LLIIIZ = new C55749LuL(C47704Ins.LJ(this, C2044180n.class, null), checkSupervisorPrepared());
        this.LLIIJI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), AnonymousClass815.INSTANCE);
        this.LLILIL = 1;
        this.LLILLL = new ARunnableS39S0100000_3(this, 100);
        this.LLILZ = JHI.LIZ().LJFF;
    }

    public final PhotoViewModelV2 B4() {
        return (PhotoViewModelV2) this.LLIIIJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoModeAbility
    public final int Jg() {
        C84K c84k = this.LLIIJLIL;
        if (c84k != null) {
            return c84k.getCurrentItem();
        }
        return -1;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS39S0100000_3(this, 99));
    }

    public final void q4() {
        Integer num;
        String str;
        int i;
        Aweme aweme;
        BaseFeedPageParams baseFeedPageParams;
        if (this.LLILL) {
            VideoItemParams videoItemParams = B4().LJLLI;
            if (videoItemParams != null && (baseFeedPageParams = videoItemParams.baseFeedPageParams) != null) {
                num = Integer.valueOf(baseFeedPageParams.awemeFromPage);
            } else {
                num = null;
            }
            IAdPhotoModeService LIZ = AdPhotoModeServiceImpl.LIZ();
            if (LIZ != null && LIZ.d1()) {
                VideoItemParams videoItemParams2 = B4().LJLLI;
                if (videoItemParams2 != null) {
                    str = videoItemParams2.mEventType;
                } else {
                    str = null;
                }
                if (num != null) {
                    num.intValue();
                }
                C81P c81p = new C81P(str);
                Context context = getContext();
                if (context != null) {
                    i = context.hashCode();
                } else {
                    i = 0;
                }
                if (num != null) {
                    num.intValue();
                }
                C224498rV c224498rV = new C224498rV(i, 0);
                B4();
                C2U8.LIZ(c81p);
                C2U8.LIZ(c224498rV);
                IAdSceneService LJII = AdSceneServiceImpl.LJII();
                if (LJII != null && LJII.LIZJ() != null) {
                    VideoItemParams videoItemParams3 = B4().LJLLI;
                    if (videoItemParams3 != null) {
                        aweme = videoItemParams3.getAweme();
                    } else {
                        aweme = null;
                    }
                    NT2.LJJIZ(aweme, getContext());
                }
            } else {
                IAdSceneService LJII2 = AdSceneServiceImpl.LJII();
                if (LJII2 != null && LJII2.LIZJ() != null) {
                    NT2.LJJJJI(getContext());
                }
            }
            this.LLILLIZIL = true;
        }
        if (this.LLILIL == 1) {
            C84K c84k = this.LLIIJLIL;
            if (c84k != null) {
                if (c84k.getCurrentItem() == B4().mv0()) {
                    new Handler().post(new ARunnableS39S0100000_3(this, 98));
                    return;
                }
                return;
            }
            o.LJIJI("viewPager");
            throw null;
        }
    }

    public final int u4() {
        int i;
        Aweme aweme;
        if (this.LLILZ && JHI.LIZ().LJIILJJIL > 0) {
            i = JHI.LIZ().LJIILJJIL;
        } else {
            i = 0;
        }
        VideoItemParams videoItemParams = B4().LJLLI;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && aweme.isAd()) {
            i = AdPhotoModeServiceImpl.LIZ().y1(aweme);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getInitPosition: ");
        LIZ.append(i);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        return i;
    }

    public final int A4() {
        return B4().mv0();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void a4() {
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void b4() {
        Aweme aweme;
        if (!C52535Kjb.LIZ() && (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) != null) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "it.aid");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("refreshFavoriteState: ");
            LIZ.append(aid);
            C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
            ((VideoFavoriteVM) this.LLFZ.LIZ(this, BasePhotoSlidesAssem.LLIIIILZ[0])).pv0(aid, false, false);
        }
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility
    public final long cc0() {
        return B4().LJLLJ;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.BasePhotoSlidesAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C82Y
    public final void p2() {
        PhotoViewModelV2 B4 = B4();
        B4.setState(C202947xq.LJLIL);
        B4.withState(new AqS169S0100000_3(B4, 1009));
        XKQ xkq = this.LLILZIL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    public final String z4() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoSlide_");
        LIZ.append(hashCode());
        String LIZ2 = C201347vG.LIZ(null, X1D.LIZIZ(LIZ), 1);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getPhotoSharedVMKey: ");
        LIZ3.append(LIZ2);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ3));
        return LIZ2;
    }

    public final void C4(PostModeEntranceMechanism mech) {
        o.LJIIIZ(mech, "mech");
        C8YN.LJIJJ(B4(), new AqS134S0200000_3(this, mech, 165));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        InterfaceC161306Us interfaceC161306Us;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        B4().ov0(item);
        Aweme it = item.getAweme();
        this.LLIIZ = FeedAdServiceImpl.LJJIJLIJ().LJIJJLI(new AnonymousClass813(this, it));
        C82L c82l = this.LLIILZL;
        if (c82l != null) {
            o.LJIIIIZZ(it, "it");
            c82l.LJJIIZI(V16.LJIJJLI(it), this.LLIIZ);
        }
        C82A c82a = this.LLIL;
        if (c82a != null) {
            o.LJIIIIZZ(it, "it");
            c82a.setTotalNum(V16.LJJIFFI(it));
        }
        int u4 = u4();
        onPageSelected(u4);
        boolean z = false;
        D4(u4, false);
        if (C188907bC.LIZ()) {
            if (((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getInteractStickerStructs() != null && (!r0.isEmpty())) {
                if (this.LLIILII == null) {
                    View findViewById = getContainerView().findViewById(R.id.hp2);
                    o.LJII(findViewById, "null cannot be cast to non-null type android.view.ViewStub");
                    ((ViewStub) findViewById).setVisibility(0);
                    this.LLIILII = (C161266Uo) getContainerView().findViewById(R.id.hou);
                }
                C161266Uo c161266Uo = this.LLIILII;
                if (c161266Uo != null) {
                    C161266Uo.LIZ(c161266Uo, new RectF(0.0f, 0.0f, KL2.LIZJ(getContext(), C53947LFf.LIZLLL()), C57092Lx.LIZ.LIZJ));
                }
                C161266Uo c161266Uo2 = this.LLIILII;
                if (c161266Uo2 != null && (interfaceC161306Us = c161266Uo2.LJLIL) != null) {
                    interfaceC161306Us.destroy();
                }
                C161266Uo c161266Uo3 = this.LLIILII;
                if (c161266Uo3 != null) {
                    C161266Uo.LIZJ(c161266Uo3, new C161296Ur(this, null, null, null, 14));
                }
                C161266Uo c161266Uo4 = this.LLIILII;
                if (c161266Uo4 != null) {
                    List<InteractStickerStruct> interactStickerStructs = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getInteractStickerStructs();
                    o.LJIIIIZZ(interactStickerStructs, "item.aweme.interactStickerStructs");
                    ArrayList arrayList = new ArrayList();
                    for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                        if (!interactStickerStruct.getNoGlobal()) {
                            arrayList.add(interactStickerStruct);
                        }
                    }
                    c161266Uo4.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), arrayList);
                }
            } else {
                C161266Uo c161266Uo5 = this.LLIILII;
                if (c161266Uo5 != null) {
                    c161266Uo5.setVisibility(8);
                }
            }
        }
        C84K c84k = this.LLIIJLIL;
        if (c84k != null) {
            Aweme aweme = item.getAweme();
            if (aweme != null && !aweme.isAd() && item.mPageType != 1000 && item.mPageType != 2000 && ((Boolean) C81Q.LIZ.getValue()).booleanValue()) {
                z = true;
            }
            c84k.setDisableScrollOnEdge(z);
            return;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.C83G
    public final void LJIIIIZZ(MotionEvent motionEvent) {
        LongPressLayout longPressLayout = this.LLII;
        if (longPressLayout != null) {
            longPressLayout.onTouchEvent(motionEvent);
        }
    }

    @Override // X.InterfaceC2043980l
    public final void LJLL(int i) {
        D4(i, false);
        if (i > -1) {
            PhotoViewModelV2 B4 = B4();
            B4.getClass();
            B4.setState(new AqS93S0101000_3(i, B4, 19));
            B4().LJLLILLLL = i;
        }
    }

    @Override // X.C6U6
    public final boolean LLZ(InteractStickerStruct sticker) {
        o.LJIIIZ(sticker, "sticker");
        B4().kv0();
        return false;
    }

    @QD3
    public final void cancelVideoMaskEvent(C201667vm event) {
        o.LJIIIZ(event, "event");
        C1DH.LJJIJIIJIL(200L, new ARunnableS39S0100000_3(this, 97));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility
    public final void nA(long j) {
        B4().LJLLJ = j;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCommentBubbleItemClicked(C57072Lv c57072Lv) {
        String str;
        if (c57072Lv != null) {
            String str2 = c57072Lv.LJLJI;
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (!o.LJ(str2, str) || !c57072Lv.LJLJJL) {
                return;
            }
            C4(PostModeEntranceMechanism.RED_BUBBLE);
        }
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        View view;
        TuxIconView tuxIconView;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || !C78963Uyt.LJJIJ((VideoItemParams) C51029K0z.LJIILLIIL(this)) || this.LLILLIZIL) {
                    return;
                }
                C8YN.LJIJJ(B4(), new AqS169S0100000_3(this, 513));
                return;
            }
            B4().sv0();
            XKQ xkq = this.LLILZIL;
            if (xkq == null) {
                return;
            }
            xkq.LIZIZ(null);
            return;
        }
        C81C c81c = this.LLIIL;
        if (c81c != null) {
            c81c.LIZ.LIZ = 0;
            PhotoViewModelV2 B4 = B4();
            B4.getClass();
            B4.withState(new AqS169S0100000_3(B4, 1011));
            C84K c84k = this.LLIIJLIL;
            if (c84k != null) {
                if (c84k.getCurrentItem() != A4()) {
                    return;
                }
                q4();
                C82N r4 = r4();
                if (r4 == null || (view = r4.LIZ) == null || (tuxIconView = (TuxIconView) view.findViewById(R.id.ho7)) == null) {
                    return;
                }
                tuxIconView.setIconRes(R.raw.icon_arrow_left_circle_ltr);
                return;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("scroller");
        throw null;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        C82L c82l = this.LLIILZL;
        if (c82l != null) {
            boolean z = B4().LLD;
            if (i == 0 && z && c82l.LJLLLL == c82l.LJLLILLLL.size() - 1 && c82l.LJLLLL != 0) {
                c82l.LJJIIJZLJL(i);
            }
        }
        C82L c82l2 = this.LLIILZL;
        if (c82l2 != null && B4().LLD) {
            C82N c82n = c82l2.LJLLJ;
            if (c82n != null) {
                c82n.LJIILIIL = null;
            }
            c82l2.LJLLJ = c82l2.LJJIIZ(i);
        }
        if (i == A4()) {
            return;
        }
        if (i == A4() - 1 && this.LLILLIZIL) {
            this.LLILLIZIL = false;
            return;
        }
        C8YN.LJIJJ(B4(), new AqS169S0100000_3(this, 514));
        B4().onPageSelected(i);
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null) {
            C38995FSd.LIZLLL().execute(new ARunnableS6S0201000_3(i, this, aweme, 7));
        }
        C8YN.LJIJJ(B4(), new AqS93S0101000_3(this, i, 9));
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.BasePhotoSlidesAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View view2;
        ViewGroup viewGroup;
        ActivityC45651qj mo49getActivity;
        Window window;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.hp1);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.photos_view_slide_pager_v2)");
        this.LLIIJLIL = (C84K) findViewById;
        C82A c82a = (C82A) view.findViewById(R.id.hoy);
        if (c82a != null) {
            ViewGroup.LayoutParams layoutParams = c82a.getLayoutParams();
            if ((layoutParams instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int LIZIZ = C7MY.LIZIZ(56);
                if (C61447O9r.LJIILIIL <= 0) {
                    Context context = c82a.getContext();
                    o.LJIIIIZZ(context, "numIndicator.context");
                    LIZIZ += C63081OpJ.LJJJJLI(context);
                }
                marginLayoutParams.topMargin = LIZIZ;
                c82a.setLayoutParams(marginLayoutParams);
            }
        } else {
            c82a = null;
        }
        this.LLIL = c82a;
        Context context2 = getContainerView().getContext();
        o.LJIIIIZZ(context2, "containerView.context");
        C81C c81c = new C81C(context2);
        this.LLIIL = c81c;
        C84K c84k = this.LLIIJLIL;
        if (c84k != null) {
            c84k.setScroller(c81c);
            C84K c84k2 = this.LLIIJLIL;
            if (c84k2 != null) {
                c84k2.setSlideSupported(true);
                C84K c84k3 = this.LLIIJLIL;
                if (c84k3 != null) {
                    c84k3.LJFF(this);
                    PhotoViewModelV2 B4 = B4();
                    Fragment LIZLLL = C212428Vi.LIZLLL(this);
                    if (LIZLLL != null && (mo49getActivity = LIZLLL.mo49getActivity()) != null && (window = mo49getActivity.getWindow()) != null) {
                        view2 = window.getDecorView();
                    } else {
                        view2 = null;
                    }
                    if (view2 instanceof ViewGroup) {
                        viewGroup = (ViewGroup) view2;
                    } else {
                        viewGroup = null;
                    }
                    C82L c82l = new C82L(this, this, this, B4, viewGroup, new InterfaceC2048082a() { // from class: X.7yD
                        @Override // X.InterfaceC2048082a
                        public final void LIZ(SlidesImageLoadParams slidesImageLoadParams) {
                            FeedPhotoSlideAssem.this.B4().pv0(slidesImageLoadParams);
                        }

                        @Override // X.InterfaceC2048082a
                        public final void LIZJ(SlidesImageLoadParams slidesImageLoadParams) {
                            PhotoViewModelV2 B42 = FeedPhotoSlideAssem.this.B4();
                            B42.getClass();
                            B42.withState(new AqS134S0200000_3(B42, slidesImageLoadParams, 295));
                        }
                    }, new C81I() { // from class: X.7yK
                        @Override // X.C81I
                        public final void LIZ() {
                            FeedPhotoSlideAssem.this.B4().LJLL.LIZIZ++;
                        }

                        @Override // X.C81I
                        public final void LIZIZ(int i) {
                            C2045581b c2045581b = FeedPhotoSlideAssem.this.B4().LJLL;
                            c2045581b.LJ = Math.max(c2045581b.LJ, i);
                        }
                    }, (PhotoSharedViewModel) this.LLIIIL.getValue());
                    this.LLIILZL = c82l;
                    C84K c84k4 = this.LLIIJLIL;
                    if (c84k4 != null) {
                        c84k4.setAdapter(c82l);
                        if (!((Boolean) C88S.LIZ.getValue()).booleanValue()) {
                            LifecycleCoroutineScope scope = LifecycleOwnerKt.getLifecycleScope(this);
                            InterfaceC203057y1 interfaceC203057y1 = new InterfaceC203057y1() { // from class: X.7yC
                                @Override // X.InterfaceC203057y1
                                public final void LIZ() {
                                    PhotoViewModelV2 B42 = FeedPhotoSlideAssem.this.B4();
                                    B42.getClass();
                                    B42.setState(new AqS169S0100000_3(B42, 1004));
                                }
                            };
                            o.LJIIIZ(scope, "scope");
                            this.LLILLJJLI = new C203027xy(scope, interfaceC203057y1);
                        }
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.7yM
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C203127y8) obj).LJLJJL);
                            }
                        }, null, C2045380z.LJLIL, 6);
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.7yE
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Integer.valueOf(((C203127y8) obj).LJLIL);
                            }
                        }, C213688a4.LIZLLL(), C2044880u.LJLIL, 4);
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.7y9
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C203127y8) obj).LJLLLL);
                            }
                        }, null, C2044080m.LJLIL, 6);
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.7yA
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C203127y8) obj).LJLJJI);
                            }
                        }, null, C2045280y.LJLIL, 6);
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.7yH
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C203127y8) obj).LJLJI);
                            }
                        }, C213688a4.LIZLLL(), C2044780t.LJLIL, 4);
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.7yI
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C203127y8) obj).LJLLILLLL;
                            }
                        }, null, AnonymousClass811.LJLIL, 6);
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.7yJ
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C203127y8) obj).LJLLJ;
                            }
                        }, null, AnonymousClass810.LJLIL, 6);
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.7yF
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C203127y8) obj).LJLJLJ;
                            }
                        }, C213688a4.LIZLLL(), C2045080w.LJLIL, 4);
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.7yG
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C203127y8) obj).LJLJLLL;
                            }
                        }, C213688a4.LIZLLL(), C2044980v.LJLIL, 4);
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.7yB
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((C203127y8) obj).LJLLLLLL);
                            }
                        }, null, C81A.LJLIL, 6);
                        C8YN.LJII(this, (AssemViewModel) this.LLIIJI.getValue(), new TBT() { // from class: X.819
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((C82B) obj).LLFZ;
                            }
                        }, null, C2045180x.LJLIL, 6);
                        return;
                    }
                    o.LJIJI("viewPager");
                    throw null;
                }
                o.LJIJI("viewPager");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    public final void D4(int i, boolean z) {
        C84K c84k = this.LLIIJLIL;
        if (c84k != null) {
            c84k.setCurrentItem(i, z);
            C82A c82a = this.LLIL;
            if (c82a != null) {
                c82a.setCurrentNum(i + 1);
            }
            C62364Odk.LIZIZ.a1(i);
            return;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.C82Y
    public final void E0(Float f, Boolean bool) {
        PhotoViewModelV2 B4 = B4();
        B4.setState(C202957xr.LJLIL);
        B4.withState(new AqS107S0300000_3(B4, f, bool, 46));
        if (((Boolean) C2048982j.LIZ.getValue()).booleanValue()) {
            C4(PostModeEntranceMechanism.PINCH);
        } else {
            if (f == null) {
                return;
            }
            C78963Uyt.LJJJJJ(f.floatValue(), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), ((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.PanelSingleTapInterceptAbility
    public final boolean ge(long j, int i, Object obj) {
        if (((Boolean) C81S.LIZ.getValue()).booleanValue() && C8SG.LIZIZ.LJIILLIIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            C4(PostModeEntranceMechanism.TAP_PHOTO);
            return true;
        }
        B4().lv0();
        return false;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        C84K c84k;
        Object obj;
        C82N c82n;
        View view;
        View view2;
        C82L c82l = this.LLIILZL;
        if (c82l != null && c82l.LJLLLL != i) {
            c82l.LJJIIJZLJL(i);
            C81I c81i = c82l.LJLJLLL;
            if (c81i != null) {
                c81i.LIZIZ(i);
            }
        }
        if (!C78963Uyt.LJJIJ((VideoItemParams) C51029K0z.LJIILLIIL(this)) || A4() == 0) {
            return;
        }
        int i3 = 0;
        if (i != A4() - 1 && i != A4()) {
            this.LLILL = false;
            return;
        }
        TuxIconView tuxIconView = null;
        try {
            c84k = this.LLIIJLIL;
        } catch (Exception unused) {
        }
        if (c84k != null) {
            int childCount = c84k.getChildCount();
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                C84K c84k2 = this.LLIIJLIL;
                if (c84k2 != null) {
                    View childAt = c84k2.getChildAt(i3);
                    if (childAt != null) {
                        obj = childAt.getTag(R.id.bpq);
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof C82N) || (c82n = (C82N) obj) == null || (view = c82n.LIZ) == null || ((TuxIconView) view.findViewById(R.id.ho7)) == null) {
                        i3++;
                    } else if (c82n != null && (view2 = c82n.LIZ) != null) {
                        tuxIconView = (TuxIconView) view2.findViewById(R.id.ho7);
                    }
                } else {
                    o.LJIJI("viewPager");
                    throw null;
                }
            }
            C8YN.LJIJJ(B4(), new AqS14S0202000_3(i2, this, tuxIconView, i, 1));
            return;
        }
        o.LJIJI("viewPager");
        throw null;
    }
}
