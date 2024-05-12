package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.AUP;
import X.AUU;
import X.AUV;
import X.AUW;
import X.AUX;
import X.AUY;
import X.AnonymousClass359;
import X.C0EH;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C2068389v;
import X.C214298b3;
import X.C215428cs;
import X.C221018lt;
import X.C221108m2;
import X.C223088pE;
import X.C26304AUa;
import X.C26308AUe;
import X.C2NH;
import X.C32151Nz;
import X.C3C5;
import X.C51029K0z;
import X.C53473Kyj;
import X.C53592L1o;
import X.C61447O9r;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C76800UCe;
import X.C77275UUl;
import X.C78857UxB;
import X.C78926UyI;
import X.C7MY;
import X.C9BD;
import X.EnumC53663L4h;
import X.EnumC53719L6l;
import X.F5P;
import X.InterfaceC53590L1m;
import X.InterfaceC81252Vui;
import X.L4O;
import X.L59;
import X.L69;
import X.L6F;
import X.M89;
import X.O6R;
import X.SY4;
import X.SY9;
import X.X1D;
import Y.ACallableS32S1100000_4;
import Y.AObserverS69S0100000_1;
import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.guidecard.filter.GuideCardFilterVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.AqS55S1100000_1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class StoryGuideCardComponent extends BaseCellSlotComponent<StoryGuideCardComponent> {
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C214298b3 LLIIJI;
    public boolean LLIIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.co5;
    }

    public StoryGuideCardComponent() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 827));
        this.LLFZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 951));
        this.LLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 830));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 831));
        this.LLII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 832));
        this.LLIIII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 826));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 825));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 829));
        this.LLIIIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 828));
        this.LLIIIZ = C221108m2.LIZIZ(AUX.LJLIL);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GuideCardFilterVM.class);
        this.LLIIJI = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 952), C215428cs.INSTANCE, null);
    }

    public final SY4 A4() {
        return (SY4) this.LLII.getValue();
    }

    public final L69 r4() {
        return (L69) this.LLFZ.getValue();
    }

    public final TuxTextView u4() {
        return (TuxTextView) this.LLIIIJ.getValue();
    }

    public final TuxTextView z4() {
        return (TuxTextView) this.LLI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LLIILZL() {
        L69 r4 = r4();
        if (r4 != null) {
            r4.LIZLLL(EnumC53663L4h.STORY, L59.END_ANIMATION);
        }
        if (this.LLIIJLIL) {
            this.LLIIJLIL = false;
            q4();
        }
        boolean LIZIZ = C223088pE.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
        AssemViewModel assemViewModel = (AssemViewModel) this.LLIIJI.getValue();
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        assemViewModel.setState(new AqS46S0110000_3(LIZIZ, aweme, 23));
    }

    public final void q4() {
        C71799SFv avatar;
        InterfaceC81252Vui controller;
        Animatable LIZ;
        L69 r4 = r4();
        if (r4 == null || (avatar = r4.getAvatar()) == null || (controller = avatar.getController()) == null || (LIZ = controller.LIZ()) == null) {
            return;
        }
        if (this.LLIIJLIL && !LIZ.isRunning()) {
            C2NH.LIZ(new ARunnableS40S0100000_4(LIZ, 77));
        } else {
            if (this.LLIIJLIL || !LIZ.isRunning()) {
                return;
            }
            C2NH.LIZ(new ARunnableS40S0100000_4(LIZ, 78));
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        L69 r4 = r4();
        if (r4 != null) {
            String authorUid = item.getAweme().getAuthorUid();
            o.LJIIIIZZ(authorUid, "item.aweme.authorUid");
            r4.LJ(authorUid, item.getAweme().getAuthor(), this);
        }
        TuxTextView z4 = z4();
        if (z4 != null) {
            User author = item.getAweme().getAuthor();
            if (author != null) {
                str = author.getNickname();
            } else {
                str = null;
            }
            z4.setText(str);
        }
        if (C223088pE.LIZIZ(item.getAweme())) {
            TuxTextView u4 = u4();
            if (u4 != null) {
                C17N.LJJLIIIJJI(u4);
            }
        } else {
            TuxTextView u42 = u4();
            if (u42 != null) {
                C17N.LJJIIJZLJL(u42);
            }
        }
        Aweme aweme = item.getAweme();
        if (aweme != null && aweme.getAuthor() != null) {
            User author2 = aweme.getAuthor();
            o.LJIIIIZZ(author2, "aweme.author");
            if (C78857UxB.LJJJIL(author2.getCustomVerify()) || C78857UxB.LJJJIL(author2.getEnterpriseVerifyReason())) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_color_verified_badge;
                c2068389v.LIZIZ = C7MY.LIZIZ(18);
                c2068389v.LIZJ = C7MY.LIZIZ(18);
                Context context = Y3().getContext();
                o.LJIIIIZZ(context, "contentView.context");
                SY9 LIZ = c2068389v.LIZ(context);
                LIZ.setBounds(0, 0, LIZ.LIZIZ(), LIZ.LIZ());
                TuxTextView z42 = z4();
                if (z42 != null) {
                    z42.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
                }
                TuxTextView z43 = z4();
                if (z43 != null) {
                    z43.setCompoundDrawablesRelative(null, null, LIZ, null);
                    return;
                }
                return;
            }
        }
        TuxTextView z44 = z4();
        if (z44 == null) {
            return;
        }
        z44.setCompoundDrawablesRelative(null, null, null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LJJIII(int i) {
        if (this.LLIIJLIL) {
            this.LLIIJLIL = false;
            q4();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        if (!this.LLIIJLIL) {
            this.LLIIJLIL = true;
            q4();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        float f;
        Set LJII;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        EnumC53719L6l enumC53719L6l = EnumC53719L6l.STORY_GUIDE_CARD;
        C26308AUe LIZ = L6F.LIZIZ.LIZ();
        if (LIZ != null) {
            LIZ.LIZJ = 0.5f;
        } else {
            LIZ = null;
        }
        if (((Boolean) this.LLIIIZ.getValue()).booleanValue()) {
            f = 0.041666668f;
        } else {
            f = 0.03125f;
        }
        C53592L1o c53592L1o = new C53592L1o(enumC53719L6l, new AqS167S0100000_1(this, 199), new AqS185S0100000_3(this, 78), null, AUY.LJLIL, Integer.valueOf(R.attr.dg), Float.valueOf(f), LIZ, null, false, null, null, 15528);
        L69 r4 = r4();
        if (r4 != null) {
            AUU auu = new AUU();
            AUP aup = new AUP(c53592L1o);
            Set<? extends InterfaceC53590L1m<?>> set = auu.LIZIZ.LIZ;
            if (set != null) {
                LJII = F5P.LJIIL(set, aup);
            } else {
                LJII = C77275UUl.LJII(aup);
            }
            AUW businessPriority = auu.LIZIZ.LIZIZ;
            o.LJIIIZ(businessPriority, "businessPriority");
            auu.LIZIZ = new AUV(LJII, businessPriority);
            new AqS170S0100000_4(this, 786).invoke(auu.LIZJ);
            new AqS170S0100000_4(this, 787).invoke(auu.LIZ);
            r4.LIZJ(auu);
        }
        SY4 A4 = A4();
        if (A4 != null) {
            AnonymousClass359 anonymousClass359 = AnonymousClass359.LJLIL;
            if (anonymousClass359 != null) {
                anonymousClass359.invoke(A4);
            }
            A4.LLFF = anonymousClass359;
        }
        C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 13), Y3());
        View view2 = (View) this.LLFII.getValue();
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                int i = (int) (LiveChatShowDelayForHotLiveSetting.DEFAULT * Y3().getContext().getResources().getDisplayMetrics().density);
                layoutParams.width = i;
                layoutParams.height = i;
                view2.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        if (((Boolean) this.LLIIIZ.getValue()).booleanValue()) {
            View view3 = (View) this.LLIIII.getValue();
            if (view3 != null) {
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), C7MY.LIZIZ(50));
            }
            L69 r42 = r4();
            if (r42 != null) {
                r42.LJIIIIZZ(72, 84);
            }
            View view4 = (View) this.LLIFFJFJJ.getValue();
            if (view4 != null) {
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin = C7MY.LIZIZ(6);
                    marginLayoutParams.leftMargin = C7MY.LIZIZ(20);
                    marginLayoutParams.rightMargin = C7MY.LIZIZ(20);
                    view4.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            TuxTextView z4 = z4();
            if (z4 != null) {
                z4.setTuxFont(23);
            }
            View view5 = (View) this.LLIIIILZ.getValue();
            if (view5 != null) {
                view5.setPadding(C7MY.LIZIZ(20), view5.getPaddingTop(), C7MY.LIZIZ(20), view5.getPaddingBottom());
            }
            SY4 A42 = A4();
            if (A42 != null) {
                A42.setTuxFont(52);
            }
            SY4 A43 = A4();
            if (A43 != null) {
                A43.setPadding(C7MY.LIZIZ(12), C7MY.LIZIZ(8), C7MY.LIZIZ(12), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            }
            SY4 A44 = A4();
            if (A44 != null) {
                ViewGroup.LayoutParams layoutParams3 = A44.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = C7MY.LIZIZ(36);
                    A44.setLayoutParams(layoutParams3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        } else {
            View view6 = (View) this.LLIIII.getValue();
            if (view6 != null) {
                view6.setPadding(view6.getPaddingLeft(), view6.getPaddingTop(), view6.getPaddingRight(), C7MY.LIZIZ(40));
            }
            L69 r43 = r4();
            if (r43 != null) {
                r43.LJIIIIZZ(96, 108);
            }
            View view7 = (View) this.LLIFFJFJJ.getValue();
            if (view7 != null) {
                ViewGroup.LayoutParams layoutParams4 = view7.getLayoutParams();
                if (layoutParams4 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    marginLayoutParams2.topMargin = C7MY.LIZIZ(10);
                    marginLayoutParams2.leftMargin = C7MY.LIZIZ(48);
                    marginLayoutParams2.rightMargin = C7MY.LIZIZ(48);
                    view7.setLayoutParams(marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            TuxTextView z42 = z4();
            if (z42 != null) {
                z42.setTuxFont(13);
            }
            View view8 = (View) this.LLIIIILZ.getValue();
            if (view8 != null) {
                view8.setPadding(C7MY.LIZIZ(96), view8.getPaddingTop(), C7MY.LIZIZ(96), view8.getPaddingBottom());
            }
            SY4 A45 = A4();
            if (A45 != null) {
                A45.setTuxFont(43);
            }
            SY4 A46 = A4();
            if (A46 != null) {
                A46.setPadding(C7MY.LIZIZ(12), C7MY.LIZIZ(10), C7MY.LIZIZ(12), O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
            }
            SY4 A47 = A4();
            if (A47 != null) {
                ViewGroup.LayoutParams layoutParams5 = A47.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = C7MY.LIZIZ(40);
                    A47.setLayoutParams(layoutParams5);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        C61447O9r.LJIILLIIL.observe(this, new AObserverS69S0100000_1(this, 64));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        L4O l4o;
        String str;
        Object LIZ;
        M89 m89;
        L69 r4;
        Map<EnumC53663L4h, L4O> currentActiveBusiness;
        L69 r42 = r4();
        String str2 = null;
        if (r42 != null && (currentActiveBusiness = r42.getCurrentActiveBusiness()) != null) {
            l4o = currentActiveBusiness.get(EnumC53663L4h.STORY);
        } else {
            l4o = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onHolderSelected, storyState = ");
        if (l4o != null) {
            str2 = C16880lQ.LJLLJ(l4o.getClass());
        }
        C0EH.LIZLLL(LIZ2, str2, ",  position:", i, ", aweme:");
        LIZ2.append(aweme);
        X1D.LIZIZ(LIZ2);
        if ((l4o instanceof C53473Kyj) && (r4 = r4()) != null) {
            r4.LIZLLL(EnumC53663L4h.STORY, L59.START_ANIMATION);
        }
        if (!this.LLIIJLIL) {
            this.LLIIJLIL = true;
            q4();
        }
        if (aweme != null) {
            ((AssemViewModel) this.LLIIJI.getValue()).setState(new AqS169S0100000_3(aweme, 899));
        }
        C26304AUa c26304AUa = C26304AUa.LIZ;
        BaseFeedPageParams baseFeedPageParams = a1().LJ;
        if (baseFeedPageParams == null || (m89 = baseFeedPageParams.param) == null || (str = m89.getEventType()) == null) {
            str = "";
        }
        c26304AUa.getClass();
        AqS55S1100000_1 aqS55S1100000_1 = new AqS55S1100000_1(aweme, str, 12);
        JSONObject jSONObject = new JSONObject();
        try {
            aqS55S1100000_1.invoke(jSONObject);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C26304AUa.LIZ.getClass();
            if (((Boolean) C26304AUa.LIZIZ.getValue()).booleanValue()) {
                C221018lt.LIZJ("StoryGuideCardTracker", "error occurs when assembling mob params", m10exceptionOrNullimpl);
                throw m10exceptionOrNullimpl;
            }
        }
        if (C3C5.m13isSuccessimpl(LIZ)) {
            C10K.LIZJ(new ACallableS32S1100000_4(jSONObject, 1));
        }
    }
}
