package Y;

import X.AbstractC91187ZqZ;
import X.AbstractC91339Zt1;
import X.AbstractC91380Ztg;
import X.AbstractC91590Zx4;
import X.C018905p;
import X.C212428Vi;
import X.C213358Yx;
import X.C2U8;
import X.C38350F3i;
import X.C47261Igj;
import X.C61447O9r;
import X.C61878OQg;
import X.C63081OpJ;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73969T1h;
import X.C91065Zob;
import X.C91071Zoh;
import X.C91073Zoj;
import X.C91075Zol;
import X.C91077Zon;
import X.C91084Zou;
import X.C91086Zow;
import X.C91139Zpn;
import X.C91210Zqw;
import X.C91234ZrK;
import X.C91284Zs8;
import X.C91362ZtO;
import X.C91395Ztv;
import X.C91421ZuL;
import X.C91432ZuW;
import X.C91450Zuo;
import X.C91453Zur;
import X.C91489ZvR;
import X.C91506Zvi;
import X.C91542ZwI;
import X.EnumC91282Zs6;
import X.EnumC91310ZsY;
import X.InterfaceC91296ZsK;
import X.KL2;
import X.O6R;
import X.ORZ;
import X.T16;
import X.X1D;
import X.YBM;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem;
import com.ss.android.ugc.aweme.dsp.playpage.favpage.FavPlayerFragment;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.AudioCardAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioconver.AudioCoverInfoAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioinfo.AudioInfoAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.lyric.LyricSlotAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.morequeue.MoreQueueAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.PlayFullSongAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.SongClipPreviewCTAAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.SongClipTipsAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS20S0101000_29;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDObserverS226S0100000_29 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            case 17:
                onChanged$17(this, obj);
                return;
            case 18:
                onChanged$18(this, obj);
                return;
            case 19:
                onChanged$19(this, obj);
                return;
            case 20:
                onChanged$20(this, obj);
                return;
            case 21:
                onChanged$21(this, obj);
                return;
            case 22:
                onChanged$22(this, obj);
                return;
            case 23:
                onChanged$23(this, obj);
                return;
            case 24:
                onChanged$24(this, obj);
                return;
            case 25:
                onChanged$25(this, obj);
                return;
            default:
                return;
        }
    }

    public IDObserverS226S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        String str;
        String str2;
        String str3;
        InterfaceC91296ZsK LIZ;
        C91075Zol info = (C91075Zol) obj;
        o.LJIIIZ(info, "info");
        String str4 = info.LIZIZ;
        C91395Ztv c91395Ztv = ((AbstractC91339Zt1) iDObserverS226S0100000_29.l0).LJLJI;
        String str5 = null;
        if (c91395Ztv != null) {
            str = c91395Ztv.LJLJJL;
        } else {
            str = null;
        }
        if (!o.LJ(str4, str) || info.LIZJ != ((AbstractC91339Zt1) iDObserverS226S0100000_29.l0).hashCode()) {
            return;
        }
        ArrayList<C91077Zon> arrayList = info.LIZ;
        if (arrayList == null || arrayList.size() <= 0) {
            C91542ZwI mLyricsRlv = ((AbstractC91339Zt1) iDObserverS226S0100000_29.l0).getMLyricsRlv();
            if (mLyricsRlv != null) {
                mLyricsRlv.setVisibility(8);
            }
            ((AbstractC91339Zt1) iDObserverS226S0100000_29.l0).LIZLLL();
        } else {
            C91542ZwI mLyricsRlv2 = ((AbstractC91339Zt1) iDObserverS226S0100000_29.l0).getMLyricsRlv();
            if (mLyricsRlv2 != null) {
                mLyricsRlv2.setVisibility(0);
            }
            AbstractC91339Zt1 abstractC91339Zt1 = (AbstractC91339Zt1) iDObserverS226S0100000_29.l0;
            if (abstractC91339Zt1.LJLJJL) {
                C91395Ztv c91395Ztv2 = abstractC91339Zt1.LJLJI;
                if (c91395Ztv2 != null) {
                    str2 = c91395Ztv2.LJLJJL;
                } else {
                    str2 = null;
                }
                AbstractC91590Zx4 playerController = abstractC91339Zt1.getPlayerController();
                if (playerController != null && (LIZ = playerController.LIZ()) != null) {
                    str3 = LIZ.getId();
                } else {
                    str3 = null;
                }
                if (o.LJ(str2, str3)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(abstractC91339Zt1.hashCode());
                    LIZ2.append("   musicId: ");
                    C91395Ztv c91395Ztv3 = abstractC91339Zt1.LJLJI;
                    if (c91395Ztv3 != null) {
                        str5 = c91395Ztv3.LJLJJL;
                    }
                    LIZ2.append(str5);
                    LIZ2.append("     -> notify has lyrics");
                    X1D.LIZIZ(LIZ2);
                }
            }
        }
        ((AbstractC91339Zt1) iDObserverS226S0100000_29.l0).setLyricsInfo(arrayList);
    }

    public static final void onChanged$1(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        C91284Zs8 c91284Zs8;
        C91453Zur c91453Zur = (C91453Zur) obj;
        if (c91453Zur.LJLILLLLZI == EnumC91282Zs6.AUTO_NEXT && (c91284Zs8 = ((BasePlayerFragment) iDObserverS226S0100000_29.l0).LJLJLLL) != null) {
            c91284Zs8.LIZ.setAutoScroll(Boolean.TRUE);
            C91362ZtO c91362ZtO = c91284Zs8.LIZ;
            c91362ZtO.LL = false;
            c91362ZtO.LJJIIJ(2, true, false, 0);
            c91284Zs8.LIZJ = true;
            return;
        }
        ((BasePlayerFragment) iDObserverS226S0100000_29.l0).Il(c91453Zur);
    }

    public static final void onChanged$10(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        EnumC91310ZsY enumC91310ZsY;
        AbstractC91590Zx4 HS;
        Integer it = (Integer) obj;
        AudioCoverInfoAssem audioCoverInfoAssem = (AudioCoverInfoAssem) iDObserverS226S0100000_29.l0;
        o.LJIIIIZZ(it, "it");
        int intValue = it.intValue();
        Context context = audioCoverInfoAssem.k4().getContext();
        IContainerUtilityAbility a4 = audioCoverInfoAssem.a4();
        if (a4 != null) {
            int v4 = a4.v4();
            o.LJIIIIZZ(context, "context");
            float f = intValue;
            float LJJJJLI = C63081OpJ.LJJJJLI(context) + v4 + (0.037f * f);
            float LJIIJJI = KL2.LJIIJJI(context) - (0.074f * f);
            float f2 = 0.51f * f;
            if (f2 <= LJIIJJI) {
                LJIIJJI = f2;
            }
            ViewGroup g4 = audioCoverInfoAssem.g4();
            ViewGroup.LayoutParams layoutParams = g4.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i = (int) LJIIJJI;
                marginLayoutParams.width = i;
                marginLayoutParams.height = i;
                marginLayoutParams.topMargin = (int) LJJJJLI;
                g4.setLayoutParams(marginLayoutParams);
                audioCoverInfoAssem.g4().setPivotX(LJIIJJI / 2);
                audioCoverInfoAssem.g4().setPivotY(0.0f);
                IAudioPlayerAbility Z3 = audioCoverInfoAssem.Z3();
                if (Z3 != null && (HS = Z3.HS()) != null) {
                    enumC91310ZsY = HS.LJIJI();
                } else {
                    enumC91310ZsY = null;
                }
                audioCoverInfoAssem.e4(enumC91310ZsY);
                if (f < KL2.LIZJ(context, 375.0f)) {
                    int LIZJ = (int) KL2.LIZJ(context, 56.0f);
                    int LIZJ2 = (int) KL2.LIZJ(context, 28.0f);
                    audioCoverInfoAssem.k4().getLayoutParams().height = LIZJ;
                    audioCoverInfoAssem.k4().getLayoutParams().width = LIZJ;
                    audioCoverInfoAssem.k4().setIconWidth(LIZJ2);
                    audioCoverInfoAssem.k4().setIconHeight(LIZJ2);
                    return;
                }
                int LIZJ3 = (int) KL2.LIZJ(context, 64.0f);
                int LIZJ4 = (int) KL2.LIZJ(context, 32.0f);
                audioCoverInfoAssem.k4().getLayoutParams().height = LIZJ3;
                audioCoverInfoAssem.k4().getLayoutParams().width = LIZJ3;
                audioCoverInfoAssem.k4().setIconWidth(LIZJ4);
                audioCoverInfoAssem.k4().setIconHeight(LIZJ4);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final void onChanged$11(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        Integer it = (Integer) obj;
        AudioInfoAssem audioInfoAssem = (AudioInfoAssem) iDObserverS226S0100000_29.l0;
        o.LJIIIIZZ(it, "it");
        float intValue = it.intValue();
        float f = 0.062f * intValue;
        float f2 = 0.037f * intValue;
        float f3 = 0.031f * intValue;
        Object value = audioInfoAssem.LLI.getValue();
        o.LJIIIIZZ(value, "<get-songNameLayout>(...)");
        View view = (View) value;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) f;
            int i = (int) f2;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd((int) f3);
            view.setLayoutParams(marginLayoutParams);
            View authorAvatarView = (View) audioInfoAssem.LLIFFJFJJ.getValue();
            o.LJIIIIZZ(authorAvatarView, "authorAvatarView");
            ViewGroup.LayoutParams layoutParams2 = authorAvatarView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginStart(i);
                authorAvatarView.setLayoutParams(marginLayoutParams2);
                View authorNameView = (View) audioInfoAssem.LLII.getValue();
                o.LJIIIIZZ(authorNameView, "authorNameView");
                ViewGroup.LayoutParams layoutParams3 = authorNameView.getLayoutParams();
                if (layoutParams3 != null) {
                    C018905p c018905p = (C018905p) layoutParams3;
                    c018905p.goneStartMargin = i;
                    authorNameView.setLayoutParams(c018905p);
                    C91234ZrK c91234ZrK = audioInfoAssem.LLFZ;
                    if (c91234ZrK != null) {
                        Context context = c91234ZrK.getContext();
                        o.LJIIIIZZ(context, "context");
                        if (intValue < KL2.LIZJ(context, 554.0f)) {
                            C91234ZrK c91234ZrK2 = audioInfoAssem.LLFZ;
                            if (c91234ZrK2 != null) {
                                c91234ZrK2.setTuxFont(23);
                                ((TuxTextView) audioInfoAssem.LLII.getValue()).setTuxFont(42);
                                return;
                            } else {
                                o.LJIJI("songNameView");
                                throw null;
                            }
                        }
                        C91234ZrK c91234ZrK3 = audioInfoAssem.LLFZ;
                        if (c91234ZrK3 != null) {
                            c91234ZrK3.setTuxFont(13);
                            ((TuxTextView) audioInfoAssem.LLII.getValue()).setTuxFont(32);
                            return;
                        } else {
                            o.LJIJI("songNameView");
                            throw null;
                        }
                    }
                    o.LJIJI("songNameView");
                    throw null;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void onChanged$12(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        FollowStatus it = (FollowStatus) obj;
        AudioInfoAssem audioInfoAssem = (AudioInfoAssem) iDObserverS226S0100000_29.l0;
        o.LJIIIIZZ(it, "it");
        audioInfoAssem.n4(it);
        ((AudioInfoAssem) iDObserverS226S0100000_29.l0).m4();
    }

    public static final void onChanged$13(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        Integer it = (Integer) obj;
        CollectAssem collectAssem = (CollectAssem) iDObserverS226S0100000_29.l0;
        o.LJIIIIZZ(it, "it");
        int intValue = it.intValue();
        Context context = collectAssem.getContext();
        if (context == null) {
            return;
        }
        if (intValue < KL2.LIZJ(context, 554.0f)) {
            int LIZJ = (int) KL2.LIZJ(context, 28.0f);
            FrameLayout frameLayout = collectAssem.LLFZ;
            if (frameLayout != null && (layoutParams4 = frameLayout.getLayoutParams()) != null) {
                layoutParams4.height = LIZJ;
            }
            FrameLayout frameLayout2 = collectAssem.LLFZ;
            if (frameLayout2 != null && (layoutParams3 = frameLayout2.getLayoutParams()) != null) {
                layoutParams3.width = LIZJ;
            }
            TuxIconView tuxIconView = collectAssem.LLI;
            if (tuxIconView != null) {
                tuxIconView.setIconWidth(LIZJ);
            }
            TuxIconView tuxIconView2 = collectAssem.LLI;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconHeight(LIZJ);
            }
            TuxIconView tuxIconView3 = collectAssem.LLIFFJFJJ;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconWidth(LIZJ);
            }
            TuxIconView tuxIconView4 = collectAssem.LLIFFJFJJ;
            if (tuxIconView4 == null) {
                return;
            }
            tuxIconView4.setIconHeight(LIZJ);
            return;
        }
        int LIZJ2 = (int) KL2.LIZJ(context, 35.0f);
        FrameLayout frameLayout3 = collectAssem.LLFZ;
        if (frameLayout3 != null && (layoutParams2 = frameLayout3.getLayoutParams()) != null) {
            layoutParams2.height = LIZJ2;
        }
        FrameLayout frameLayout4 = collectAssem.LLFZ;
        if (frameLayout4 != null && (layoutParams = frameLayout4.getLayoutParams()) != null) {
            layoutParams.width = LIZJ2;
        }
        TuxIconView tuxIconView5 = collectAssem.LLI;
        if (tuxIconView5 != null) {
            tuxIconView5.setIconWidth(LIZJ2);
        }
        TuxIconView tuxIconView6 = collectAssem.LLI;
        if (tuxIconView6 != null) {
            tuxIconView6.setIconHeight(LIZJ2);
        }
        TuxIconView tuxIconView7 = collectAssem.LLIFFJFJJ;
        if (tuxIconView7 != null) {
            tuxIconView7.setIconWidth(LIZJ2);
        }
        TuxIconView tuxIconView8 = collectAssem.LLIFFJFJJ;
        if (tuxIconView8 == null) {
            return;
        }
        tuxIconView8.setIconHeight(LIZJ2);
    }

    public static final void onChanged$14(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        CollectAssem collectAssem;
        IAudioPlayerAbility Z3;
        AbstractC91590Zx4 HS;
        AbstractC91187ZqZ LJ;
        long j;
        C213358Yx c213358Yx = (C213358Yx) obj;
        if (c213358Yx == null || (Z3 = (collectAssem = (CollectAssem) iDObserverS226S0100000_29.l0).Z3()) == null || (HS = Z3.HS()) == null) {
            return;
        }
        CollectViewModel e4 = collectAssem.e4();
        List LJJIJ = C47261Igj.LJJIJ(c213358Yx.LJLIL);
        e4.getClass();
        AbstractC91380Ztg LJIIZILJ = HS.LJIIZILJ();
        if (LJIIZILJ == null || (LJ = LJIIZILJ.LJ()) == null) {
            return;
        }
        Long LJJIZ = C38350F3i.LJJIZ(LJ.LIZ.LJLIL);
        if (LJJIZ != null) {
            j = LJJIZ.longValue();
        } else {
            j = 0;
        }
        C61878OQg fullClipIds = C61878OQg.INSTANCE;
        o.LJIIIZ(fullClipIds, "fullClipIds");
        C91432ZuW.LJLIL = true;
        e4.disposeOnClear(C91086Zow.LIZ().loadCollectList(j, 50L, ORZ.LLD(fullClipIds, ",", null, null, null, 62), ORZ.LLD(LJJIJ, ",", null, null, null, 62), ORZ.LLD(fullClipIds, ",", null, null, null, 62), "1", 1, new ArrayList()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS293S0100000_29(e4, 9), C91421ZuL.LJLIL));
    }

    public static final void onChanged$15(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        Object obj2;
        View view;
        Integer it = (Integer) obj;
        LyricSlotAssem lyricSlotAssem = (LyricSlotAssem) iDObserverS226S0100000_29.l0;
        o.LJIIIIZZ(it, "it");
        int intValue = it.intValue();
        float f = intValue;
        float f2 = 0.047f * f;
        double d = intValue * 0.037d;
        C91489ZvR c91489ZvR = lyricSlotAssem.LLI;
        if (c91489ZvR != null) {
            ViewParent parent = c91489ZvR.getParent();
            if (parent != null) {
                obj2 = parent.getParent();
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof ViewGroup) && (view = (View) obj2) != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = (int) f2;
                    int i = (int) d;
                    marginLayoutParams.setMarginStart(i);
                    marginLayoutParams.setMarginEnd(i);
                    view.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            C91489ZvR c91489ZvR2 = lyricSlotAssem.LLI;
            if (c91489ZvR2 != null) {
                Context context = c91489ZvR2.getContext();
                o.LJIIIIZZ(context, "shortLyricsView.context");
                C91489ZvR c91489ZvR3 = lyricSlotAssem.LLI;
                if (c91489ZvR3 != null) {
                    int LIZ = C91065Zob.LIZ(new C91084Zou(), context.getString(R.string.ii0));
                    C91084Zou c91084Zou = new C91084Zou();
                    c91084Zou.LJIIJ = 0;
                    c91084Zou.LJIIIZ = LIZ;
                    c91084Zou.LJIIJJI = LIZ;
                    c91084Zou.LJIIL = LIZ;
                    if (f < KL2.LIZJ(context, 554.0f)) {
                        c91084Zou.LIZJ = 42;
                    } else {
                        c91084Zou.LIZJ = 32;
                    }
                    ViewGroup.LayoutParams layoutParams2 = c91489ZvR3.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = LIZ * 2;
                    }
                    c91489ZvR3.setConfig(c91084Zou);
                    if (lyricSlotAssem.LLIFFJFJJ != null) {
                        return;
                    }
                    o.LJIJI("lyricsManager");
                    throw null;
                }
                o.LJIJI("shortLyricsView");
                throw null;
            }
            o.LJIJI("shortLyricsView");
            throw null;
        }
        o.LJIJI("shortLyricsView");
        throw null;
    }

    public static final void onChanged$16(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        Integer it = (Integer) obj;
        MoreQueueAssem moreQueueAssem = (MoreQueueAssem) iDObserverS226S0100000_29.l0;
        o.LJIIIIZZ(it, "it");
        float intValue = it.intValue();
        float f = 0.019f * intValue;
        float f2 = 0.037f * intValue;
        TuxIconView tuxIconView = moreQueueAssem.LLFII;
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = (int) f;
                marginLayoutParams.setMarginEnd((int) f2);
                tuxIconView.setLayoutParams(marginLayoutParams);
                TuxIconView tuxIconView2 = moreQueueAssem.LLFII;
                if (tuxIconView2 != null) {
                    Context context = tuxIconView2.getContext();
                    o.LJIIIIZZ(context, "context");
                    if (intValue < KL2.LIZJ(context, 554.0f)) {
                        int LIZJ = (int) KL2.LIZJ(context, 28.0f);
                        TuxIconView tuxIconView3 = moreQueueAssem.LLFII;
                        if (tuxIconView3 != null) {
                            tuxIconView3.setIconWidth(LIZJ);
                            TuxIconView tuxIconView4 = moreQueueAssem.LLFII;
                            if (tuxIconView4 != null) {
                                tuxIconView4.setIconHeight(LIZJ);
                                return;
                            } else {
                                o.LJIJI("moreRootView");
                                throw null;
                            }
                        }
                        o.LJIJI("moreRootView");
                        throw null;
                    }
                    int LIZJ2 = (int) KL2.LIZJ(context, 35.0f);
                    TuxIconView tuxIconView5 = moreQueueAssem.LLFII;
                    if (tuxIconView5 != null) {
                        tuxIconView5.setIconWidth(LIZJ2);
                        TuxIconView tuxIconView6 = moreQueueAssem.LLFII;
                        if (tuxIconView6 != null) {
                            tuxIconView6.setIconHeight(LIZJ2);
                            return;
                        } else {
                            o.LJIJI("moreRootView");
                            throw null;
                        }
                    }
                    o.LJIJI("moreRootView");
                    throw null;
                }
                o.LJIJI("moreRootView");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        o.LJIJI("moreRootView");
        throw null;
    }

    public static final void onChanged$17(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        Integer it = (Integer) obj;
        PlayFullSongAssem playFullSongAssem = (PlayFullSongAssem) iDObserverS226S0100000_29.l0;
        o.LJIIIIZZ(it, "it");
        int intValue = it.intValue();
        playFullSongAssem.getClass();
        float f = intValue * 0.037f;
        C91139Zpn c91139Zpn = playFullSongAssem.LLIFFJFJJ;
        if (c91139Zpn != null) {
            ViewGroup.LayoutParams layoutParams = c91139Zpn.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i = (int) f;
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(i);
                c91139Zpn.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    public static final void onChanged$18(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        Integer it = (Integer) obj;
        SongClipPreviewCTAAssem songClipPreviewCTAAssem = (SongClipPreviewCTAAssem) iDObserverS226S0100000_29.l0;
        o.LJIIIIZZ(it, "it");
        int intValue = it.intValue();
        songClipPreviewCTAAssem.getClass();
        float f = intValue * 0.037f;
        C91139Zpn c91139Zpn = songClipPreviewCTAAssem.LLIFFJFJJ;
        if (c91139Zpn != null) {
            ViewGroup.LayoutParams layoutParams = c91139Zpn.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i = (int) f;
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(i);
                c91139Zpn.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    public static final void onChanged$19(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        if (!((SongClipPreviewCTAAssem) iDObserverS226S0100000_29.l0).b4()) {
            return;
        }
        View view = ((SongClipPreviewCTAAssem) iDObserverS226S0100000_29.l0).LLFZ;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addListener(new IDAListenerS83S0100000_29((SongClipPreviewCTAAssem) iDObserverS226S0100000_29.l0, 1));
            ofFloat.start();
            return;
        }
        o.LJIJI("contentView");
        throw null;
    }

    public static final void onChanged$2(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        C91395Ztv LIZ;
        BasePlayerFragment basePlayerFragment = (BasePlayerFragment) iDObserverS226S0100000_29.l0;
        InterfaceC91296ZsK LIZJ = basePlayerFragment.getPlayerController().LIZJ();
        C91506Zvi c91506Zvi = basePlayerFragment.LJLJL;
        if (c91506Zvi != null) {
            C91210Zqw c91210Zqw = basePlayerFragment.LJLJLJ;
            C91453Zur c91453Zur = new C91453Zur(false, null, 7);
            c91210Zqw.getClass();
            if (c91210Zqw.LIZ.isResso()) {
                LIZ = C91210Zqw.LIZ(LIZJ, c91453Zur);
            } else {
                LIZ = C91210Zqw.LIZ(LIZJ, c91453Zur);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setDataItem position:");
            LIZ2.append(2);
            LIZ2.append(",songData:");
            LIZ2.append(LIZ);
            X1D.LIZIZ(LIZ2);
            if (c91506Zvi.LJLJJI.size() >= 3) {
                ListProtector.set(c91506Zvi.LJLJJI, 2, LIZ);
                IDqS20S0101000_29 iDqS20S0101000_29 = new IDqS20S0101000_29(c91506Zvi, 1);
                if (c91506Zvi.LJLJI.isEmpty()) {
                    c91506Zvi.LJLJJLL.add(iDqS20S0101000_29);
                } else {
                    iDqS20S0101000_29.invoke();
                }
            }
        }
        basePlayerFragment.Kl();
    }

    public static final void onChanged$20(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        if (!((SongClipTipsAssem) iDObserverS226S0100000_29.l0).b4()) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(((SongClipTipsAssem) iDObserverS226S0100000_29.l0).LLI, "alpha", 0.2f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setStartDelay(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new IDAListenerS83S0100000_29((SongClipTipsAssem) iDObserverS226S0100000_29.l0, 2));
        ofFloat.start();
    }

    public static final void onChanged$21(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        int i;
        TuxTextView tuxTextView;
        View view;
        Integer it = (Integer) obj;
        SongClipTipsAssem songClipTipsAssem = (SongClipTipsAssem) iDObserverS226S0100000_29.l0;
        o.LJIIIIZZ(it, "it");
        int intValue = it.intValue();
        songClipTipsAssem.getClass();
        Fragment LIZLLL = C212428Vi.LIZLLL(songClipTipsAssem);
        if (LIZLLL != null && (view = LIZLLL.getView()) != null) {
            i = view.getMeasuredWidth();
        } else {
            i = 0;
        }
        View view2 = songClipTipsAssem.LLI;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int LJJIIJZLJL = O6R.LJJIIJZLJL(C91073Zoj.LIZ(50) + (intValue * 0.037d));
                marginLayoutParams.setMarginStart(LJJIIJZLJL);
                if (i != 0 && (tuxTextView = songClipTipsAssem.LLIFFJFJJ) != null) {
                    tuxTextView.setMaxWidth(((i - LJJIIJZLJL) - ((int) C91073Zoj.LIZ(25))) - ((int) C91073Zoj.LIZ(10)));
                }
                view2.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final void onChanged$22(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        float f;
        float f2;
        Integer it = (Integer) obj;
        AudioSeekBarAssem audioSeekBarAssem = (AudioSeekBarAssem) iDObserverS226S0100000_29.l0;
        o.LJIIIIZZ(it, "it");
        int intValue = it.intValue();
        if (audioSeekBarAssem.c4()) {
            f = intValue;
            f2 = 0.05f;
        } else {
            f = intValue;
            f2 = 0.125f;
        }
        float f3 = f * f2;
        if (f3 >= C91073Zoj.LIZ(15)) {
            f3 -= C91073Zoj.LIZ(15);
        }
        float f4 = intValue * 0.037f;
        LinearLayout linearLayout = audioSeekBarAssem.LLIIIJ;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (int) f3;
                int i = (int) f4;
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(i - ((int) C91073Zoj.LIZ(5)));
                linearLayout.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        double LIZ = (intValue * 0.037d) - ((int) C91073Zoj.LIZ(5));
        TuxIconView tuxIconView = audioSeekBarAssem.LLIIJLIL;
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginEnd((int) LIZ);
                tuxIconView.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final void onChanged$23(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        if (!((AudioSeekBarAssem) iDObserverS226S0100000_29.l0).b4()) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(((AudioSeekBarAssem) iDObserverS226S0100000_29.l0).LLIIIJ, "alpha", 0.2f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.setStartDelay(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new IDAListenerS83S0100000_29((AudioSeekBarAssem) iDObserverS226S0100000_29.l0, 3));
        ofFloat.start();
    }

    public static final void onChanged$24(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        BasePlayerFragment basePlayerFragment = (BasePlayerFragment) iDObserverS226S0100000_29.l0;
        if (basePlayerFragment.Gl(basePlayerFragment.mo49getActivity()) && C61447O9r.LJIILJJIL > 0) {
            int ZK = ((BasePlayerFragment) iDObserverS226S0100000_29.l0).ZK();
            C91071Zoh c91071Zoh = ((BasePlayerFragment) iDObserverS226S0100000_29.l0).LJLJJLL;
            ViewGroup.LayoutParams layoutParams4 = null;
            if (c91071Zoh != null) {
                layoutParams = c91071Zoh.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams) != null) {
                i = layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
            if (ZK != i) {
                C91071Zoh c91071Zoh2 = ((BasePlayerFragment) iDObserverS226S0100000_29.l0).LJLJJLL;
                if (c91071Zoh2 != null) {
                    layoutParams4 = c91071Zoh2.getLayoutParams();
                }
                if (!(layoutParams4 instanceof FrameLayout.LayoutParams) || (layoutParams2 = (FrameLayout.LayoutParams) layoutParams4) == null) {
                    return;
                }
                layoutParams2.bottomMargin = ZK;
            }
        }
    }

    public static final void onChanged$25(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        if (obj == null) {
            return;
        }
        ((UpsellLandingPageSlotAssem) iDObserverS226S0100000_29.l0).p4();
    }

    public static final void onChanged$3(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            C73305Spp c73305Spp = ((BasePlayerFragment) iDObserverS226S0100000_29.l0).LJLL;
            if (c73305Spp != null) {
                c73305Spp.LJFF();
            }
            C73305Spp c73305Spp2 = ((BasePlayerFragment) iDObserverS226S0100000_29.l0).LJLL;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
            }
            ((BasePlayerFragment) iDObserverS226S0100000_29.l0).LJLJJI.clear();
        }
    }

    public static final void onChanged$4(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue()) {
            C73305Spp c73305Spp = ((BasePlayerFragment) iDObserverS226S0100000_29.l0).LJLL;
            if (c73305Spp != null) {
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new IDqS421S0100000_29((BasePlayerFragment) iDObserverS226S0100000_29.l0, 15));
                c73305Spp.setStatus(c73306Spq);
            }
            C73305Spp c73305Spp2 = ((BasePlayerFragment) iDObserverS226S0100000_29.l0).LJLL;
            if (c73305Spp2 == null) {
                return;
            }
            c73305Spp2.setVisibility(0);
            return;
        }
        ((BasePlayerFragment) iDObserverS226S0100000_29.l0).h3(0);
    }

    public static final void onChanged$5(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        C91071Zoh c91071Zoh = ((BasePlayerFragment) iDObserverS226S0100000_29.l0).LJLJJLL;
        if (c91071Zoh != null) {
            c91071Zoh.LIZJ();
        }
    }

    public static final void onChanged$6(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        ((BasePlayerFragment) iDObserverS226S0100000_29.l0).Hl();
    }

    public static final void onChanged$7(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        InterfaceC91296ZsK interfaceC91296ZsK = (InterfaceC91296ZsK) obj;
        YBM.LIZ.getClass();
        if (YBM.LIZJ()) {
            if (o.LJ(((BasePlayerFragment) iDObserverS226S0100000_29.l0).getPlayerController().LIZ(), interfaceC91296ZsK)) {
                BasePlayerFragment basePlayerFragment = (BasePlayerFragment) iDObserverS226S0100000_29.l0;
                if (basePlayerFragment.LL && basePlayerFragment.LLD) {
                    ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
                    InterfaceC91296ZsK previewClipSongUpsellPlayable = expiredPlayableManager.getPreviewClipSongUpsellPlayable();
                    expiredPlayableManager.setPreviewClipSongUpsellPlayable(interfaceC91296ZsK);
                    if (!o.LJ(previewClipSongUpsellPlayable, interfaceC91296ZsK)) {
                        C2U8.LIZ(new C91450Zuo());
                        return;
                    }
                    return;
                }
                ExpiredPlayableManager.INSTANCE.getPreviewClipSongUpsellUnshowSet().add(interfaceC91296ZsK);
                return;
            }
            ExpiredPlayableManager.INSTANCE.getPreviewClipSongUpsellUnshowSet().add(interfaceC91296ZsK);
        }
    }

    public static final void onChanged$8(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            ((FavPlayerFragment) iDObserverS226S0100000_29.l0).Il(new C91453Zur(false, null, 7));
        }
        C91071Zoh c91071Zoh = ((FavPlayerFragment) iDObserverS226S0100000_29.l0).LJLJJLL;
        if (c91071Zoh != null) {
            c91071Zoh.LIZJ();
        }
    }

    public static final void onChanged$9(IDObserverS226S0100000_29 iDObserverS226S0100000_29, Object obj) {
        if (obj == null) {
            return;
        }
        ((AudioCardAssem) iDObserverS226S0100000_29.l0).e4();
    }
}
