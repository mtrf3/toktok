package com.ss.android.ugc.aweme.feed.assem.music;

import X.C113554cx;
import X.C16880lQ;
import X.C17N;
import X.C18950ol;
import X.C1DH;
import X.C202677xP;
import X.C204257zx;
import X.C2053083y;
import X.C208078Ep;
import X.C210648Om;
import X.C213688a4;
import X.C214148ao;
import X.C214348b8;
import X.C221108m2;
import X.C225488t6;
import X.C241249dQ;
import X.C245249js;
import X.C27570Aru;
import X.C2K0;
import X.C32151Nz;
import X.C35570Dxe;
import X.C38995FSd;
import X.C3C8;
import X.C47135Ieh;
import X.C47959Irz;
import X.C51029K0z;
import X.C53110Kss;
import X.C54927Lh5;
import X.C57141Mbh;
import X.C57186McQ;
import X.C57187McR;
import X.C57188McS;
import X.C57189McT;
import X.C57193McX;
import X.C57194McY;
import X.C57195McZ;
import X.C57196Mca;
import X.C57197Mcb;
import X.C57198Mcc;
import X.C57199Mcd;
import X.C57200Mce;
import X.C57201Mcf;
import X.C57202Mcg;
import X.C57204Mci;
import X.C57205Mcj;
import X.C57206Mck;
import X.C57207Mcl;
import X.C57208Mcm;
import X.C57209Mcn;
import X.C57210Mco;
import X.C57211Mcp;
import X.C57215Mct;
import X.C57216Mcu;
import X.C57229Md7;
import X.C57233MdB;
import X.C57234MdC;
import X.C57235MdD;
import X.C57236MdE;
import X.C57252MdU;
import X.C57262Mde;
import X.C5H3;
import X.C60432Yt;
import X.C60452Yv;
import X.C61845OOz;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72434Sbm;
import X.C76800UCe;
import X.C78596Usy;
import X.C7MY;
import X.C86V;
import X.C8D3;
import X.C8MM;
import X.C8MP;
import X.C8ON;
import X.C8T7;
import X.C8YN;
import X.C91E;
import X.C9BE;
import X.DPB;
import X.DTU;
import X.IFM;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.J1O;
import X.JYH;
import X.KUK;
import X.LDD;
import X.O6R;
import X.OSZ;
import X.OUP;
import X.QD3;
import X.TBT;
import X.ViewOnTouchListenerC2059986p;
import X.ViewTreeObserverOnWindowFocusChangeListenerC57217Mcv;
import Y.ACListenerS28S0100000_8;
import Y.ALAdapterS0S0101000_9;
import Y.ALAdapterS2S0110000_9;
import Y.ALAdapterS7S0100000_9;
import Y.ALAdapterS7S0200000_9;
import Y.ARunnableS45S0100000_9;
import Y.AUListenerS96S0100000_8;
import Y.AUListenerS97S0100000_9;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS108S0101000_9;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import o3.IDaS91S0000000_9;
import o3.h0;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class VideoMusicCoverAssem extends BaseCellSlotComponent implements InteractRightMenuMusicCoverAbility, ComponentPriorityProtocol, KUK, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJJL;
    public final C62822Ol8 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final InterfaceC115514g7 LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public C72434Sbm LLIIIJ;
    public C72434Sbm LLIIIL;
    public C57233MdB LLIIIZ;
    public FrameLayout LLIIJI;
    public FrameLayout LLIIJLIL;
    public FrameLayout LLIIL;
    public C57197Mcb LLIILII;
    public ValueAnimator LLIILZL;
    public C57262Mde LLIIZ;
    public long LLIL;
    public final double LLILII;
    public final double LLILIL;
    public final int LLILL;
    public int LLILLIZIL;
    public TuxTextView LLILLJJLI;
    public FrameLayout LLILLL;
    public boolean LLILZ;
    public AnimatorSet LLILZIL;
    public AnimatorSet LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public ImageView LLJIJIL;
    public TuxTextView LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public ARunnableS45S0100000_9 LLJJI;
    public ARunnableS45S0100000_9 LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;

    static {
        TBT tbt = new TBT(VideoMusicCoverAssem.class, "musicCoverVM", "getMusicCoverVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicCoverVM;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLJJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(VideoMusicCoverAssem.class, "musicBaseVM", "getMusicBaseVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicBaseVM;", 0, c65351Pkp), C61845OOz.LIZJ(VideoMusicCoverAssem.class, "recordMuteVM", "getRecordMuteVM()Lcom/ss/android/ugc/aweme/feed/assem/music/RecordMuteVM;", 0, c65351Pkp), C61845OOz.LIZJ(VideoMusicCoverAssem.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0, c65351Pkp)};
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final void AU(float f, int i, boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility
    public final Rect K1() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ad6;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "right_container_music_cover";
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1856293165) {
            return null;
        }
        return this;
    }

    public VideoMusicCoverAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS159S0100000_9(this, 148));
        C65776Prg LIZ = C65352Pkq.LIZ(VideoMusicCoverVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 342), null, C57215Mct.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoMusicBaseVM.class);
        this.LLI = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 339), null, C57216Mcu.INSTANCE, null, null);
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(RecordMuteVM.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ3, c9be, new AqS153S0100000_3(LIZ3, 340), null, C57209Mcn.INSTANCE, null, null);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ4 = C65352Pkq.LIZ(ConstraintSizeVM.class);
        this.LLII = C214348b8.LIZ(this, LIZ4, c241249dQ, new AqS153S0100000_3(LIZ4, 341), null, C210648Om.INSTANCE, null, null);
        this.LLIIII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C57210Mco.INSTANCE);
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C57211Mcp.INSTANCE);
        this.LLILII = 49.0d;
        this.LLILIL = 27.0d;
        this.LLILL = 64;
        this.LLILLIZIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJILJILJ = JYH.LIZIZ.LJIIJ();
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = true;
    }

    public final void A4() {
        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = this.LLJJIII;
        if (aRunnableS45S0100000_9 != null) {
            C1DH.LIZJ(aRunnableS45S0100000_9);
        }
        this.LLJILLL = false;
        int LIZIZ = C7MY.LIZIZ(C204257zx.LIZIZ().LJLIL);
        int LIZIZ2 = C7MY.LIZIZ(C204257zx.LIZIZ().LJLJJL);
        float f = LIZIZ2 / 2;
        int LIZIZ3 = C7MY.LIZIZ(20);
        int i = (LIZIZ2 - LIZIZ3) / 2;
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout != null) {
            frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), LIZIZ, frameLayout.getPaddingBottom());
        }
        FrameLayout frameLayout2 = this.LLJI;
        if (frameLayout2 != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = LIZIZ2;
                layoutParams.height = LIZIZ2;
            }
            FrameLayout frameLayout3 = this.LLJI;
            if (frameLayout3 != null) {
                frameLayout3.setLayoutParams(layoutParams);
                FrameLayout frameLayout4 = this.LLJI;
                if (frameLayout4 != null) {
                    frameLayout4.setPadding(i, i, i, i);
                    FrameLayout frameLayout5 = this.LLJI;
                    if (frameLayout5 != null) {
                        Drawable background = frameLayout5.getBackground();
                        o.LJII(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                        ((GradientDrawable) background).setCornerRadius(f);
                        ImageView imageView = this.LLJIJIL;
                        if (imageView != null) {
                            C27570Aru.LJIIIZ(imageView, LIZIZ3);
                            ImageView imageView2 = this.LLJIJIL;
                            if (imageView2 != null) {
                                C27570Aru.LJII(LIZIZ3, imageView2);
                                TuxTextView tuxTextView = this.LLJILJIL;
                                if (tuxTextView != null) {
                                    tuxTextView.setAlpha(0.0f);
                                    TuxTextView tuxTextView2 = this.LLJILJIL;
                                    if (tuxTextView2 != null) {
                                        tuxTextView2.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
                                        return;
                                    } else {
                                        o.LJIJI("muteButtonText");
                                        throw null;
                                    }
                                }
                                o.LJIJI("muteButtonText");
                                throw null;
                            }
                            o.LJIJI("muteButtonIcon");
                            throw null;
                        }
                        o.LJIJI("muteButtonIcon");
                        throw null;
                    }
                    o.LJIJI("muteButtonBackground");
                    throw null;
                }
                o.LJIJI("muteButtonBackground");
                throw null;
            }
            o.LJIJI("muteButtonBackground");
            throw null;
        }
        o.LJIJI("muteButtonBackground");
        throw null;
    }

    public final VideoViewModel B4() {
        return (VideoViewModel) this.LLIIII.getValue();
    }

    public final VideoMusicBaseVM C4() {
        return (VideoMusicBaseVM) this.LLI.LIZ(this, LLJJL[1]);
    }

    public final VideoMusicCoverVM D4() {
        return (VideoMusicCoverVM) this.LLFZ.LIZ(this, LLJJL[0]);
    }

    public final C57197Mcb E4() {
        if (this.LLIILII == null) {
            this.LLIILII = new C57197Mcb();
        }
        C57197Mcb c57197Mcb = this.LLIILII;
        if (c57197Mcb != null) {
            return c57197Mcb;
        }
        o.LJIJI("musicCoverViewScaleHelper");
        throw null;
    }

    public final VideoPlayViewModel F4() {
        return (VideoPlayViewModel) this.LLIIIILZ.getValue();
    }

    public final RecordMuteVM G4() {
        return (RecordMuteVM) this.LLIFFJFJJ.LIZ(this, LLJJL[2]);
    }

    public final J1O I4() {
        if (!o.LJ(JYH.LIZIZ.LIZIZ(null), this.LLJJ) || !this.LLJILJILJ) {
            return J1O.STYLE_NO_BUTTON;
        }
        if (this.LLJILLL) {
            return J1O.STYLE_UNFOLD_CAPSULE;
        }
        return J1O.STYLE_FOLD_BUTTON;
    }

    public final void R4() {
        if (!this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = false;
        C35570Dxe.LIZJ(this.LLIIJLIL);
        if (this.LLIIJLIL != null) {
            ValueAnimator valueAnimator = this.LLIILZL;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            if (C91E.LIZ()) {
                C57252MdU.LIZ(this.LLIIZ);
            }
        }
    }

    public final void S4() {
        if (!this.LLJJJJLIIL) {
            return;
        }
        this.LLJJJJLIIL = false;
        C35570Dxe.LIZJ(this.LLIIIZ);
        C57233MdB c57233MdB = this.LLIIIZ;
        if (c57233MdB != null) {
            c57233MdB.LJLLI.removeCallbacksAndMessages(null);
            c57233MdB.LJLLI.removeCallbacks(c57233MdB.LJLLILLLL);
            int childCount = c57233MdB.getChildCount();
            for (int i = 0; i < childCount; i++) {
                c57233MdB.LIZIZ(c57233MdB.getChildAt(i));
            }
        }
    }

    public final void Y4() {
        int i;
        boolean LJIIJ = JYH.LIZIZ.LJIIJ();
        FrameLayout frameLayout = this.LLIIJLIL;
        int i2 = 0;
        if (frameLayout != null) {
            if (LJIIJ) {
                i = 4;
            } else {
                i = 0;
            }
            frameLayout.setVisibility(i);
        }
        FrameLayout frameLayout2 = this.LLJ;
        if (frameLayout2 == null) {
            return;
        }
        if (!LJIIJ) {
            i2 = 8;
        }
        frameLayout2.setVisibility(i2);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void a4() {
        if (((Boolean) C53110Kss.LIZ.getValue()).booleanValue()) {
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                S4();
                R4();
            } else {
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS45S0100000_9(this, 31));
            }
        }
    }

    public final void z4() {
        AnimatorSet animatorSet = this.LLILZIL;
        if ((animatorSet != null && animatorSet.isRunning()) || this.LLILZ) {
            this.LLIZ = true;
            this.LLIZLLLIL = true;
            AnimatorSet animatorSet2 = this.LLILZIL;
            if (animatorSet2 != null) {
                C16880lQ.LJLJJL(animatorSet2);
            }
            AnimatorSet animatorSet3 = this.LLILZIL;
            if (animatorSet3 != null) {
                animatorSet3.end();
            }
            T4(false);
        }
    }

    public final void O4() {
        Y4();
        if (this.LLJJJ) {
            this.LLJJJ = false;
            JYH.LIZIZ.LJII(false);
        }
        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = this.LLJJI;
        if (aRunnableS45S0100000_9 != null) {
            C1DH.LIZJ(aRunnableS45S0100000_9);
        }
    }

    public final void P4() {
        boolean z;
        Y4();
        if (this.LLJJIJI && this.LLJJIJIIJIL && this.LLJJIJIL) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LLJJJ && z) {
            this.LLJJJ = true;
            JYH.LIZIZ.LJII(true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    public final void u4() {
        if (!C202677xP.LIZ()) {
            q4(R.drawable.b0o, this.LLIIIL);
        } else {
            q4(R.drawable.bo7, this.LLIIIL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Bs(int i) {
        getContainerView().setVisibility(i);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        FrameLayout frameLayout;
        String LIZ;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLJJJIL = false;
        this.LLJJJJ = false;
        if (C225488t6.LIZ) {
            Y3().setEnabled(true);
        }
        if (JYH.LIZIZ.LJIIJ()) {
            FrameLayout frameLayout2 = this.LLJI;
            if (frameLayout2 != null) {
                C16880lQ.LJIILJJIL(frameLayout2, new ACListenerS28S0100000_8(this, 69));
                Y4();
                this.LLJILJILJ = true;
                RecordMuteVM G4 = G4();
                G4.getClass();
                G4.LJLL = false;
            } else {
                o.LJIJI("muteButtonBackground");
                throw null;
            }
        }
        if (C63081OpJ.LLJJIII(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
            getContainerView().setVisibility(8);
        }
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
        Music music = item.getAweme().getMusic();
        if (music == null || (frameLayout = this.LLIIL) == null) {
            return;
        }
        if (music.isOriginalSound()) {
            String LJFF = C86V.LJFF(R.string.ach);
            o.LJIIIIZZ(LJFF, "getString(R.string.acces…orYou_btn_sound_original)");
            String authorName = music.getAuthorName();
            if (authorName == null) {
                authorName = C86V.LJFF(R.string.ac2);
            }
            LIZ = C208078Ep.LIZ(LJFF, C51029K0z.LJJIIZI(new OSZ("username", authorName)));
        } else {
            String LJFF2 = C86V.LJFF(R.string.acg);
            o.LJIIIIZZ(LJFF2, "getString(R.string.acces…_forYou_btn_sound_artist)");
            OSZ[] oszArr = new OSZ[2];
            String musicName = music.getMusicName();
            if (musicName == null) {
                musicName = C86V.LJFF(R.string.aci);
            }
            oszArr[0] = new OSZ("soundTitle", musicName);
            String authorName2 = music.getAuthorName();
            if (authorName2 == null) {
                authorName2 = C86V.LJFF(R.string.ac2);
            }
            oszArr[1] = new OSZ("artistName", authorName2);
            LIZ = C208078Ep.LIZ(LJFF2, C113554cx.LJJL(oszArr));
        }
        frameLayout.setContentDescription(LIZ);
    }

    public final void T4(boolean z) {
        TuxTextView tuxTextView;
        int i;
        int LIZIZ;
        int i2;
        int i3;
        long j;
        long j2;
        int LIZIZ2;
        AnimatorSet.Builder play;
        AnimatorSet.Builder with;
        AnimatorSet.Builder with2;
        AnimatorSet.Builder after;
        AnimatorSet.Builder play2;
        AnimatorSet.Builder with3;
        AnimatorSet.Builder after2;
        C72434Sbm c72434Sbm = this.LLIIIL;
        if (c72434Sbm != null && (tuxTextView = this.LLILLJJLI) != null) {
            tuxTextView.setVisibility(8);
            C57208Mcm LIZIZ3 = C204257zx.LIZIZ();
            int LIZIZ4 = C7MY.LIZIZ(LIZIZ3.LJLJJL);
            if (C202677xP.LIZ() || !FavoriteServiceImpl.LJIJJLI().LJIJJ()) {
                i = LIZIZ3.LJLJJL;
            } else {
                i = LIZIZ3.LJLJJL + LIZIZ3.LJLIL + LIZIZ3.LJLILLLLZI;
            }
            int LIZIZ5 = C7MY.LIZIZ(i);
            C72434Sbm c72434Sbm2 = this.LLIIIL;
            if (c72434Sbm2 != null) {
                LIZIZ = c72434Sbm2.getWidth();
            } else {
                LIZIZ = C7MY.LIZIZ((int) (LIZIZ4 * 0.74d));
            }
            if (C8D3.LIZJ()) {
                i2 = 22;
            } else {
                i2 = 24;
            }
            int LIZIZ6 = C7MY.LIZIZ(i2);
            if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                i3 = C47959Irz.LIZJ(20, c72434Sbm.getWidth());
            } else {
                i3 = LIZIZ5;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(C7MY.LIZIZ(78), LIZIZ5);
            if (ofInt != null) {
                ofInt.setInterpolator(new DecelerateInterpolator(1.5f));
                if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                    j = 300;
                } else {
                    j = 250;
                }
                ofInt.setDuration(j);
            }
            ofInt.addUpdateListener(new AUListenerS97S0100000_9(this, 5));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c72434Sbm, "alpha", 0.0f, 1.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(100L);
            ofFloat.addListener(new ALAdapterS0S0101000_9(this, LIZIZ4, 0));
            ValueAnimator ofInt2 = ValueAnimator.ofInt(C7MY.LIZIZ(78), i3);
            if (ofInt2 != null) {
                ofInt2.setInterpolator(new DecelerateInterpolator(1.5f));
                if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                    j2 = 300;
                } else {
                    j2 = 250;
                }
                ofInt2.setDuration(j2);
            }
            ofInt2.addUpdateListener(new AUListenerS97S0100000_9(this, 6));
            ofInt2.addListener(new ALAdapterS7S0200000_9(this, ofFloat, 1));
            ofInt.addListener(new ALAdapterS7S0200000_9(this, LIZIZ3, 2));
            if (!C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                LIZIZ = LIZIZ6;
            }
            ValueAnimator ofInt3 = ValueAnimator.ofInt(LIZIZ, LIZIZ4);
            ofInt3.setInterpolator(new LinearInterpolator());
            ofInt3.setDuration(100L);
            ofInt3.addUpdateListener(new AUListenerS97S0100000_9(this, 7));
            ofInt3.addListener(new ALAdapterS0S0101000_9(this, LIZIZ4, 1));
            int[] iArr = new int[2];
            C72434Sbm c72434Sbm3 = this.LLIIIJ;
            if (c72434Sbm3 != null) {
                LIZIZ2 = C47959Irz.LIZJ(8, c72434Sbm3.getWidth());
            } else {
                LIZIZ2 = C7MY.LIZIZ((int) (LIZIZ4 * 0.74d));
            }
            iArr[0] = LIZIZ2;
            iArr[1] = LIZIZ4;
            ValueAnimator ofInt4 = ValueAnimator.ofInt(iArr);
            ofInt4.setInterpolator(new LinearInterpolator());
            ofInt4.setDuration(100L);
            ofInt4.addUpdateListener(new AUListenerS97S0100000_9(this, 8));
            if (this.LLILZLL == null) {
                this.LLILZLL = new AnimatorSet();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tuxTextView, "alpha", 1.0f, 0.0f);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setDuration(100L);
            if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                AnimatorSet animatorSet = this.LLILZLL;
                if (animatorSet != null && (play2 = animatorSet.play(ofInt3)) != null && (with3 = play2.with(ofFloat2)) != null && (after2 = with3.after(ofInt)) != null) {
                    after2.after(ofInt2);
                }
            } else {
                AnimatorSet animatorSet2 = this.LLILZLL;
                if (animatorSet2 != null && (play = animatorSet2.play(ofInt3)) != null && (with = play.with(ofInt4)) != null && (with2 = with.with(ofFloat2)) != null && (after = with2.after(ofInt)) != null) {
                    after.after(ofInt2);
                }
            }
            AnimatorSet animatorSet3 = this.LLILZLL;
            if (animatorSet3 != null) {
                C16880lQ.LJLJJL(animatorSet3);
            }
            AnimatorSet animatorSet4 = this.LLILZLL;
            if (animatorSet4 != null) {
                animatorSet4.addListener(new ALAdapterS2S0110000_9(this, z, 0));
            }
            AnimatorSet animatorSet5 = this.LLILZLL;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
        }
    }

    public final void X4(boolean z) {
        TuxTextView tuxTextView;
        int LIZIZ;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        AnimatorSet.Builder play;
        AnimatorSet.Builder with;
        AnimatorSet.Builder after;
        AnimatorSet.Builder play2;
        AnimatorSet.Builder after2;
        C72434Sbm c72434Sbm = this.LLIIIL;
        if (c72434Sbm != null && (tuxTextView = this.LLILLJJLI) != null) {
            String str = null;
            if (z) {
                Context context = getContext();
                if (context != null) {
                    str = context.getString(R.string.gq2);
                }
                tuxTextView.setText(str);
            } else {
                Context context2 = getContext();
                if (context2 != null) {
                    str = context2.getString(R.string.el9);
                }
                tuxTextView.setText(str);
            }
            tuxTextView.setVisibility(0);
            this.LLIZ = false;
            this.LLIZLLLIL = false;
            C57208Mcm LIZIZ2 = C204257zx.LIZIZ();
            int LIZIZ3 = C7MY.LIZIZ(LIZIZ2.LJLJJL);
            if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(LIZIZ3 * 0.74d)));
            } else {
                C72434Sbm c72434Sbm2 = this.LLIIIJ;
                if (c72434Sbm2 != null) {
                    LIZIZ = C47959Irz.LIZJ(8, c72434Sbm2.getWidth());
                } else {
                    LIZIZ = C7MY.LIZIZ((int) (LIZIZ3 * 0.74d));
                }
            }
            if (C8D3.LIZJ()) {
                i = 22;
            } else {
                i = 24;
            }
            int LIZIZ4 = C7MY.LIZIZ(i);
            if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                i2 = C47959Irz.LIZJ(8, LIZIZ4);
            } else {
                i2 = LIZIZ;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxTextView, "alpha", 0.0f, 1.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(100L);
            int[] iArr = new int[2];
            iArr[0] = LIZIZ3;
            if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                i3 = LIZIZ4;
            } else {
                i3 = LIZIZ;
            }
            iArr[1] = i3;
            ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
            ofInt.setInterpolator(new LinearInterpolator());
            long j2 = 200;
            if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                j = 200;
            } else {
                j = 100;
            }
            ofInt.setDuration(j);
            ofInt.addUpdateListener(new AUListenerS97S0100000_9(this, 9));
            int[] iArr2 = new int[2];
            iArr2[0] = LIZIZ3;
            if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                i4 = C47959Irz.LIZJ(8, LIZIZ4);
            } else {
                i4 = LIZIZ;
            }
            iArr2[1] = i4;
            ValueAnimator ofInt2 = ValueAnimator.ofInt(iArr2);
            ofInt2.setInterpolator(new LinearInterpolator());
            if (!C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                j2 = 100;
            }
            ofInt2.setDuration(j2);
            ofInt2.addUpdateListener(new AUListenerS97S0100000_9(this, 10));
            ofInt.addListener(new C57196Mca(this, LIZIZ4, LIZIZ, LIZIZ2));
            if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                LIZIZ = C47959Irz.LIZJ(8, LIZIZ4);
            }
            ValueAnimator ofInt3 = ValueAnimator.ofInt(LIZIZ, C7MY.LIZIZ(78));
            if (ofInt3 != null) {
                ofInt3.setInterpolator(new DecelerateInterpolator(1.5f));
                ofInt3.setDuration(300L);
            }
            ofInt3.addUpdateListener(new AUListenerS97S0100000_9(this, 11));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c72434Sbm, "alpha", 1.0f, 0.0f);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setDuration(100L);
            if (this.LLILZIL == null) {
                this.LLILZIL = new AnimatorSet();
            }
            if (C57186McQ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                AnimatorSet animatorSet = this.LLILZIL;
                if (animatorSet != null && (play2 = animatorSet.play(ofInt3)) != null && (after2 = play2.after(ofInt)) != null) {
                    after2.after(ofInt2);
                }
            } else {
                AnimatorSet animatorSet2 = this.LLILZIL;
                if (animatorSet2 != null && (play = animatorSet2.play(ofInt3)) != null && (with = play.with(ofFloat2)) != null && (after = with.after(ofInt)) != null) {
                    after.after(ofInt2);
                }
            }
            AnimatorSet animatorSet3 = this.LLILZIL;
            if (animatorSet3 != null) {
                C16880lQ.LJLJJL(animatorSet3);
            }
            AnimatorSet animatorSet4 = this.LLILZIL;
            if (animatorSet4 != null) {
                animatorSet4.addListener(new C57189McT(tuxTextView, ofFloat, i2, this, z));
            }
            AnimatorSet animatorSet5 = this.LLILZIL;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        C8MP.LIZ(this, "event_on_page_resume", new AqS175S0100000_9(this, 78));
        C8MP.LIZ(this, "event_on_page_pause", new AqS175S0100000_9(this, 79));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onClearModeEvent(C245249js event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL && C57188McS.LIZIZ()) {
            AnimatorSet animatorSet = this.LLILZIL;
            if ((animatorSet != null && animatorSet.isRunning()) || this.LLILZ) {
                this.LLIZ = true;
                this.LLIZLLLIL = true;
                AnimatorSet animatorSet2 = this.LLILZIL;
                if (animatorSet2 != null) {
                    C16880lQ.LJLJJL(animatorSet2);
                }
                AnimatorSet animatorSet3 = this.LLILZIL;
                if (animatorSet3 != null) {
                    animatorSet3.end();
                }
                T4(false);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C72434Sbm c72434Sbm;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLIIJI = (FrameLayout) Y3().findViewById(R.id.grk);
        this.LLIIIL = (C72434Sbm) Y3().findViewById(R.id.grh);
        this.LLIIIJ = (C72434Sbm) Y3().findViewById(R.id.hdk);
        this.LLIIIZ = (C57233MdB) Y3().findViewById(R.id.h3s);
        this.LLIIJLIL = (FrameLayout) Y3().findViewById(R.id.grl);
        FrameLayout frameLayout = (FrameLayout) Y3().findViewById(R.id.gtc);
        this.LLIIL = frameLayout;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(new ViewOnTouchListenerC2059986p());
        }
        FrameLayout frameLayout2 = this.LLIIL;
        if (frameLayout2 != null) {
            h0.LJIJI(frameLayout2, new IDaS91S0000000_9(0));
        }
        this.LLILLJJLI = (TuxTextView) Y3().findViewById(R.id.l4u);
        this.LLILLL = (FrameLayout) Y3().findViewById(R.id.gri);
        if (!C202677xP.LIZ() && (c72434Sbm = this.LLIIIL) != null) {
            c72434Sbm.setPlaceholderImage(R.drawable.b0o);
        }
        DTU.LJLIL.LJLIL(this.LLIIIL);
        this.LLJ = (FrameLayout) Y3().findViewById(R.id.guk);
        View findViewById = Y3().findViewById(R.id.guj);
        o.LJIIIIZZ(findViewById, "contentView.findViewById…d.mute_button_background)");
        this.LLJI = (FrameLayout) findViewById;
        View findViewById2 = Y3().findViewById(R.id.gul);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById(R.id.mute_button_icon)");
        this.LLJIJIL = (ImageView) findViewById2;
        View findViewById3 = Y3().findViewById(R.id.gum);
        o.LJIIIIZZ(findViewById3, "contentView.findViewById(R.id.mute_button_text)");
        this.LLJILJIL = (TuxTextView) findViewById3;
        C57197Mcb E4 = E4();
        E4.LIZIZ = Y3().findViewById(R.id.gth);
        E4.LIZLLL = this.LLIIJI;
        E4.LJIIJ = this.LLIIL;
        E4.LJ = this.LLJ;
        E4.LJII = this.LLIIJLIL;
        E4.LJFF = this.LLIIIL;
        FrameLayout frameLayout3 = this.LLJI;
        if (frameLayout3 != null) {
            E4.LJI = frameLayout3;
            E4.LIZJ = this.LLIIIZ;
            E4.LJIIIIZZ = this.LLIIIJ;
            E4.LJIIIZ = getContainerView();
            boolean z = IFM.LIZ;
            if (z) {
                C8YN.LJII(this, B4(), new TBT() { // from class: X.82G
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C82B) obj).LLFII;
                    }
                }, C213688a4.LIZLLL(), C57199Mcd.LJLIL, 4);
            }
            C8YN.LJIILJJIL(this, B4(), new TBT() { // from class: X.NYJ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLIL;
                }
            }, C213688a4.LIZLLL(), C57202Mcg.LJLIL, 4);
            C8YN.LJII(this, B4(), new TBT() { // from class: X.8gG
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJLJ;
                }
            }, C213688a4.LIZLLL(), C57204Mci.LJLIL, 4);
            C8YN.LJII(this, B4(), new TBT() { // from class: X.8gH
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJL;
                }
            }, C213688a4.LIZLLL(), C57205Mcj.LJLIL, 4);
            C8YN.LJII(this, B4(), new TBT() { // from class: X.Mcr
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJI;
                }
            }, C213688a4.LIZLLL(), C57195McZ.LJLIL, 4);
            C8YN.LJII(this, B4(), new TBT() { // from class: X.Mcs
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C82B) obj).LJLJJI;
                }
            }, C213688a4.LIZLLL(), C57193McX.LJLIL, 4);
            C8YN.LJIILJJIL(this, F4(), new TBT() { // from class: X.8Tp
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLIL;
                }
            }, C213688a4.LIZLLL(), C57235MdD.LJLIL, 4);
            C8YN.LJIILJJIL(this, F4(), new TBT() { // from class: X.Md4
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLILLLLZI;
                }
            }, C213688a4.LIZLLL(), C57234MdC.LJLIL, 4);
            C8YN.LJIILJJIL(this, F4(), new TBT() { // from class: X.8Uu
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLJI;
                }
            }, C213688a4.LIZLLL(), C57236MdE.LJLIL, 4);
            C8YN.LJII(this, F4(), new TBT() { // from class: X.8Uq
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LL;
                }
            }, C213688a4.LIZLLL(), C57194McY.LJLIL, 4);
            C8YN.LJII(this, F4(), new TBT() { // from class: X.8fl
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJZL;
                }
            }, C213688a4.LIZLLL(), C57187McR.LJLIL, 4);
            C8YN.LJII(this, F4(), new TBT() { // from class: X.8Ii
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C212208Um) obj).LJLLLL;
                }
            }, null, C57200Mce.LJLIL, 6);
            C8YN.LJIIJ(this, D4(), new TBT() { // from class: X.Mcy
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C57223Md1) obj).LJLJJI);
                }
            }, new TBT() { // from class: X.Mcw
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C57223Md1) obj).LJLJJL);
                }
            }, null, C57201Mcf.LJLIL, 12);
            C8YN.LJII(this, D4(), new TBT() { // from class: X.Mcz
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C57223Md1) obj).LJLJJLL);
                }
            }, null, C57206Mck.LJLIL, 6);
            C8YN.LJII(this, D4(), new TBT() { // from class: X.Md0
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C57223Md1) obj).LJLJL);
                }
            }, null, C57207Mcl.LJLIL, 6);
            C8YN.LJIIJ(this, D4(), new TBT() { // from class: X.Md3
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C57223Md1) obj).LJLIL;
                }
            }, new TBT() { // from class: X.Md2
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C57223Md1) obj).LJLILLLLZI);
                }
            }, null, C57141Mbh.LJLIL, 12);
            C8YN.LJII(this, D4(), new TBT() { // from class: X.Mcx
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C57223Md1) obj).LJLJI);
                }
            }, null, C57198Mcc.LJLIL, 6);
            if (C225488t6.LIZ) {
                u4();
                Y3().post(new ARunnableS45S0100000_9(this, 32));
                Y3().setEnabled(false);
            }
            if (z || !C202677xP.LIZ()) {
                E4().LIZIZ();
            } else if (FavoriteServiceImpl.LJIJJLI().LJIJJ()) {
                Y3().post(new ARunnableS45S0100000_9(this, 33));
            }
            if (C214148ao.LIZ()) {
                Object LIZ = this.LLII.LIZ(this, LLJJL[3]);
                View containerView = getContainerView();
                LIZ.getClass();
                ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    int LIZIZ = C8ON.LIZIZ();
                    int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(((-19) - C204257zx.LIZLLL()) - C204257zx.LJ()))) - C8ON.LIZIZ();
                    int marginStart = marginLayoutParams.getMarginStart();
                    int marginEnd = marginLayoutParams.getMarginEnd();
                    marginLayoutParams.setMarginStart(marginStart);
                    marginLayoutParams.topMargin = LJJIIZ;
                    marginLayoutParams.setMarginEnd(marginEnd);
                    marginLayoutParams.bottomMargin = LIZIZ;
                }
            }
            if (!C57188McS.LIZIZ()) {
                MusicDetailService.LJIJJ().LJIIIZ();
            } else {
                view.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserverOnWindowFocusChangeListenerC57217Mcv(this));
            }
            LDD.LIZ("musicCoverDegrade", new C57229Md7());
            return;
        }
        o.LJIJI("muteButtonBackground");
        throw null;
    }

    public static void J4(VideoMusicCoverAssem videoMusicCoverAssem, boolean z) {
        int LIZ;
        float LJJIJIIJI;
        float LJJIJIIJI2;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        float f2;
        float f3;
        int LJJIIZ;
        videoMusicCoverAssem.getClass();
        int LIZIZ = C7MY.LIZIZ(C204257zx.LIZIZ().LJLIL);
        if (LIZIZ == O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))) {
            LIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
        } else {
            LIZ = C47135Ieh.LIZ(3, LIZIZ);
        }
        int LIZIZ2 = C7MY.LIZIZ(C204257zx.LIZIZ().LJLJJL);
        TuxTextView tuxTextView = videoMusicCoverAssem.LLJILJIL;
        if (tuxTextView != null) {
            LJJIJIIJI = OUP.LJJIJIIJI(tuxTextView, tuxTextView.getText().toString());
            int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C17N.LJJJJI(LJJIJIIJI))));
            if (LJJIIZ2 > C7MY.LIZIZ(54)) {
                TuxTextView tuxTextView2 = videoMusicCoverAssem.LLJILJIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(92);
                    TuxTextView tuxTextView3 = videoMusicCoverAssem.LLJILJIL;
                    if (tuxTextView3 != null) {
                        LJJIJIIJI2 = OUP.LJJIJIIJI(tuxTextView3, tuxTextView3.getText().toString());
                        LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C17N.LJJJJI(LJJIJIIJI2))));
                        if (LJJIIZ2 > C7MY.LIZIZ(54)) {
                            LJJIIZ2 = C7MY.LIZIZ(54);
                        }
                    } else {
                        o.LJIJI("muteButtonText");
                        throw null;
                    }
                } else {
                    o.LJIJI("muteButtonText");
                    throw null;
                }
            }
            int LIZIZ3 = C7MY.LIZIZ(28);
            float f4 = 2;
            float f5 = LIZIZ2 / f4;
            float f6 = LIZIZ3 / f4;
            int LIZIZ4 = C7MY.LIZIZ(20);
            int LIZIZ5 = C7MY.LIZIZ(18);
            int i6 = (LIZIZ2 - LIZIZ4) / 2;
            int LIZIZ6 = C7MY.LIZIZ(6);
            int i7 = LIZIZ3 + LJJIIZ2 + LIZIZ6;
            if (z) {
                i = LIZ;
            } else {
                i = LIZIZ;
                LIZIZ = LIZ;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i, LIZIZ);
            ofInt.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new AUListenerS96S0100000_8(videoMusicCoverAssem, 3));
            if (z) {
                i2 = i7;
                i7 = LIZIZ2;
                i3 = LIZIZ3;
            } else {
                i2 = LIZIZ2;
                i3 = LIZIZ2;
                LIZIZ2 = LIZIZ3;
            }
            ValueAnimator ofInt2 = ValueAnimator.ofInt(i2, i7);
            ofInt2.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ofInt2.setDuration(300L);
            ofInt2.addUpdateListener(new AUListenerS97S0100000_9(videoMusicCoverAssem, 28));
            ValueAnimator ofInt3 = ValueAnimator.ofInt(i3, LIZIZ2);
            ofInt3.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ofInt3.setDuration(300L);
            ofInt3.addUpdateListener(new AUListenerS97S0100000_9(videoMusicCoverAssem, 23));
            if (z) {
                i4 = LIZIZ6;
            } else {
                i4 = i6;
                i6 = LIZIZ6;
            }
            ValueAnimator ofInt4 = ValueAnimator.ofInt(i4, i6);
            ofInt4.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ofInt4.setDuration(300L);
            ofInt4.addUpdateListener(new AUListenerS97S0100000_9(videoMusicCoverAssem, 25));
            if (z) {
                f = f6;
            } else {
                f = f5;
                f5 = f6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f5);
            ofFloat.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new AUListenerS97S0100000_9(videoMusicCoverAssem, 30));
            if (z) {
                i5 = LIZIZ5;
            } else {
                i5 = LIZIZ4;
                LIZIZ4 = LIZIZ5;
            }
            ValueAnimator ofInt5 = ValueAnimator.ofInt(i5, LIZIZ4);
            ofInt5.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ofInt5.setDuration(300L);
            ofInt5.addUpdateListener(new AUListenerS97S0100000_9(videoMusicCoverAssem, 24));
            if (z) {
                f2 = 1.0f;
                f3 = 0.0f;
            } else {
                f2 = 0.0f;
                f3 = 1.0f;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, f3);
            ofFloat2.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ofFloat2.setDuration(300L);
            ofFloat2.addUpdateListener(new AUListenerS97S0100000_9(videoMusicCoverAssem, 26));
            if (z) {
                LJJIIZ = LJJIIZ2;
                LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
            } else {
                LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
            }
            ValueAnimator ofInt6 = ValueAnimator.ofInt(LJJIIZ, LJJIIZ2);
            ofInt6.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ofInt6.setDuration(300L);
            ofInt6.addUpdateListener(new AUListenerS97S0100000_9(videoMusicCoverAssem, 27));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new ALAdapterS7S0100000_9(videoMusicCoverAssem, 5));
            animatorSet.play(ofInt).with(ofInt3).with(ofInt2).with(ofInt4).with(ofFloat).with(ofInt5).with(ofInt6).with(ofFloat2);
            animatorSet.start();
            return;
        }
        o.LJIJI("muteButtonText");
        throw null;
    }

    public static void q4(int i, C72434Sbm c72434Sbm) {
        AqS108S0101000_9 aqS108S0101000_9 = new AqS108S0101000_9(i, c72434Sbm, 2);
        if (C78596Usy.LJJIJL(C60452Yv.LJLIL, DPB.LIZJ())) {
            C38995FSd.LIZJ().execute(new ARunnableS45S0100000_9((InterfaceC65784Pro) aqS108S0101000_9, 34));
        } else {
            aqS108S0101000_9.invoke();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Sn(ReusedUIAssem<? extends C3C8> ins, InterfaceC65784Pro<C76800UCe> win) {
        o.LJIIIZ(ins, "ins");
        o.LJIIIZ(win, "win");
        C2053083y.LIZ(ins, win);
    }

    public final void r4(C72434Sbm c72434Sbm, UrlModel urlModel, int i, int i2) {
        C54927Lh5 c54927Lh5 = new C54927Lh5(urlModel, this, i, i2, c72434Sbm);
        if (((Boolean) C60432Yt.LIZJ.getValue()).booleanValue()) {
            C38995FSd.LIZJ().execute(new ARunnableS45S0100000_9((InterfaceC65784Pro) c54927Lh5, 34));
        } else {
            c54927Lh5.invoke();
        }
    }
}
