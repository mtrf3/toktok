package X;

import Y.ACListenerS34S0300000_8;
import Y.AObjectS42S0101000_5;
import Y.ARunnableS27S0200000_8;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.common.viewmodel.KeyboardModel;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.KCh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51323KCh extends AbstractC029409q<RecyclerView.ViewHolder> implements InterfaceC51343KDb {
    public List<SearchSugEntity> LJLIL = new ArrayList();
    public String LJLILLLLZI;
    public String LJLJI;
    public AbstractSearchIntermediateFragmentNew LJLJJI;
    public final KeyboardModel LJLJJL;
    public final SearchIntermediateViewModelNew LJLJJLL;
    public K75 LJLJL;
    public final K5C LJLJLJ;
    public final ActivityC45651qj LJLJLLL;
    public String LJLL;
    public SearchSugEntity LJLLI;
    public final C51341KCz LJLLILLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        SearchSugEntity searchSugEntity;
        if (!C79004UzY.LJJIFFI(this.LJLIL)) {
            searchSugEntity = (SearchSugEntity) ListProtector.get(this.LJLIL, i);
        } else {
            searchSugEntity = null;
        }
        if (searchSugEntity == null) {
            return 0;
        }
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo != null && sugExtraInfo.isGenerativeSug()) {
            return 6;
        }
        if (searchSugEntity.LIZ()) {
            return 1;
        }
        if (searchSugEntity.LIZ == 5) {
            return 5;
        }
        if (C78841Uwv.LJIL(searchSugEntity)) {
            return 2;
        }
        if (searchSugEntity.LIZ != 3) {
            return 0;
        }
        return 3;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        if (C34485Dg9.LJLILLLLZI.LJJII()) {
            recyclerView.getRecycledViewPool().setMaxRecycledViews(2, 10);
            recyclerView.getRecycledViewPool().setMaxRecycledViews(0, 10);
            recyclerView.getRecycledViewPool().setMaxRecycledViews(1, 2);
            recyclerView.getRecycledViewPool().setMaxRecycledViews(6, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof InterfaceC51130K4w) {
            ((InterfaceC51130K4w) viewHolder).onViewAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof InterfaceC51130K4w) {
            ((InterfaceC51130K4w) viewHolder).onViewDetachedFromWindow();
        }
    }

    public C51323KCh(ActivityC45651qj activityC45651qj, RecyclerView recyclerView) {
        this.LJLJLLL = activityC45651qj;
        this.LJLLILLLL = new C51341KCz(recyclerView, this);
        if (activityC45651qj != null) {
            this.LJLJJLL = (SearchIntermediateViewModelNew) ViewModelProviders.of(activityC45651qj).get(SearchIntermediateViewModelNew.class);
            this.LJLJJL = (KeyboardModel) ViewModelProviders.of(activityC45651qj).get(KeyboardModel.class);
        }
        this.LJLJLJ = new K5C(this);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int value;
        int i3;
        C57127MbT avatarImageView;
        String userAvatarUri;
        String str;
        String userAvatarUri2;
        String userAvatarUri3;
        Integer generativeDisplayBegin;
        int intValue;
        int i4 = i;
        int itemViewType = getItemViewType(i4);
        String str2 = "";
        if (itemViewType == 6) {
            C51326KCk c51326KCk = (C51326KCk) viewHolder;
            SearchSugEntity searchSugEntity = (SearchSugEntity) ListProtector.get(this.LJLIL, i4);
            String str3 = this.LJLILLLLZI;
            if (searchSugEntity == null) {
                c51326KCk.getClass();
                return;
            }
            c51326KCk.LJLJLJ = searchSugEntity;
            c51326KCk.LJLJLLL = i4;
            if (str3 != null) {
                str2 = str3;
            }
            c51326KCk.LJLL = str2;
            TextView textView = c51326KCk.LJLJL;
            if (textView != null) {
                Context context = c51326KCk.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                CharSequence LJIILJJIL = C78841Uwv.LJIILJJIL(searchSugEntity, context, (InterfaceC212198Ul) c51326KCk.LJLLL.getValue());
                SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
                if (sugExtraInfo != null && (generativeDisplayBegin = sugExtraInfo.getGenerativeDisplayBegin()) != null && (intValue = generativeDisplayBegin.intValue()) > 0 && intValue < LJIILJJIL.length() - 1) {
                    try {
                        SpannableStringBuilder replace = ((SpannableStringBuilder) LJIILJJIL).replace(0, generativeDisplayBegin.intValue(), (CharSequence) "... ");
                        o.LJIIIIZZ(replace, "content.replace(0, position, \"... \")");
                        LJIILJJIL = replace;
                    } catch (Exception unused) {
                    }
                }
                textView.setText(LJIILJJIL);
            }
            C72242sW c72242sW = new C72242sW();
            View itemView = c51326KCk.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            itemView.setOnTouchListener(new C51329KCn(c72242sW, c51326KCk, i4, !C32151Nz.LJJIL(itemView)));
            return;
        }
        if (itemViewType == 1) {
            C51324KCi c51324KCi = (C51324KCi) viewHolder;
            SearchSugEntity searchSugEntity2 = (SearchSugEntity) ListProtector.get(this.LJLIL, i4);
            String requestId = this.LJLILLLLZI;
            C50896JyG c50896JyG = new C50896JyG(this);
            c51324KCi.getClass();
            o.LJIIIZ(searchSugEntity2, "searchSugEntity");
            o.LJIIIZ(requestId, "requestId");
            c51324KCi.L();
            ((AppCompatTextView) c51324KCi.itemView.findViewById(R.id.m2v)).setTextSize(1, c51324KCi.LJLLJ);
            ((C4SP) c51324KCi.itemView.findViewById(R.id.mc3)).setBiggerTextSize(c51324KCi.LJLLJ);
            ViewGroup.LayoutParams layoutParams = c51324KCi.itemView.findViewById(R.id.f4l).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(C17N.LJIILL(12.0d));
            c51324KCi.itemView.findViewById(R.id.f4l).setLayoutParams(marginLayoutParams);
            Integer LIZIZ = C19N.LIZIZ(c51324KCi.itemView, "itemView.context", R.attr.gu);
            if (LIZIZ != null) {
                int intValue2 = LIZIZ.intValue();
                ((TuxIconView) c51324KCi.itemView.findViewById(R.id.f4l)).setTintColor(intValue2);
                ((TuxIconView) c51324KCi.itemView.findViewById(R.id.f1l)).setTintColor(intValue2);
            }
            c51324KCi.itemView.findViewById(R.id.nbs).setBackground(c51324KCi.itemView.getContext().getDrawable(R.drawable.c1y));
            c51324KCi.itemView.findViewById(R.id.nbs).setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = c51324KCi.itemView.findViewById(R.id.f4l).getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginStart(C17N.LJIILL(24.0d));
            marginLayoutParams2.setMarginEnd(C17N.LJIILL(20.0d));
            c51324KCi.itemView.findViewById(R.id.f4l).setLayoutParams(marginLayoutParams2);
            if (C52197Ke9.LIZ()) {
                TextView textView2 = (TextView) ((C4SP) c51324KCi.itemView.findViewById(R.id.mc3))._$_findCachedViewById(R.id.mq0);
                Context context2 = c51324KCi.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                Integer LJI = C79045V0n.LJI(R.attr.gu, context2);
                o.LJI(LJI);
                textView2.setTextColor(LJI.intValue());
                TextView textView3 = (TextView) c51324KCi.itemView.findViewById(R.id.m2v);
                Context context3 = c51324KCi.itemView.getContext();
                o.LJIIIIZZ(context3, "itemView.context");
                Integer LJI2 = C79045V0n.LJI(R.attr.gu, context3);
                o.LJI(LJI2);
                textView3.setTextColor(LJI2.intValue());
            }
            c51324KCi.LJLJJL = searchSugEntity2;
            if (C78841Uwv.LJIL(searchSugEntity2)) {
                TextView textView4 = (TextView) ((C4SP) c51324KCi.itemView.findViewById(R.id.mc3))._$_findCachedViewById(R.id.mq0);
                if (textView4 != null) {
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                }
                c51324KCi.itemView.findViewById(R.id.btg).setVisibility(8);
                c51324KCi.itemView.findViewById(R.id.mc3).setVisibility(0);
                C4SP c4sp = (C4SP) c51324KCi.itemView.findViewById(R.id.mc3);
                Context context4 = c51324KCi.itemView.getContext();
                Context context5 = c51324KCi.itemView.getContext();
                o.LJIIIIZZ(context5, "itemView.context");
                CharSequence LJIILJJIL2 = C78841Uwv.LJIILJJIL(searchSugEntity2, context5, (InterfaceC212198Ul) c51324KCi.LJLLILLLL.getValue());
                View itemView2 = c51324KCi.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                c4sp.LJJLJLI(context4, LJIILJJIL2, C78841Uwv.LJIJ(searchSugEntity2, itemView2, (InterfaceC212198Ul) c51324KCi.LJLLILLLL.getValue()));
                str = "enrich_sug";
            } else {
                c51324KCi.itemView.findViewById(R.id.mc3).setVisibility(8);
                c51324KCi.itemView.findViewById(R.id.btg).setVisibility(0);
                TextView textView5 = (TextView) c51324KCi.itemView.findViewById(R.id.m2v);
                o.LJIIIIZZ(textView5, "itemView.tv_content");
                View itemView3 = c51324KCi.itemView;
                o.LJIIIIZZ(itemView3, "itemView");
                c51324KCi.itemView.findViewById(R.id.btg);
                c51324KCi.LJLLI = C51495KIx.LIZIZ(searchSugEntity2, textView5, itemView3, C51324KCi.LJLLL);
                str = "normal_sug";
            }
            c51324KCi.LJLJJLL = str;
            C72242sW c72242sW2 = new C72242sW();
            Integer valueOf = Integer.valueOf(searchSugEntity2.LIZIZ);
            if (valueOf.intValue() >= 0) {
                i4 = valueOf.intValue();
            }
            c51324KCi.LJLJJI = i4;
            View itemView4 = c51324KCi.itemView;
            o.LJIIIIZZ(itemView4, "itemView");
            itemView4.setOnTouchListener(new C51330KCo(c72242sW2, c51324KCi, searchSugEntity2, requestId, !C32151Nz.LJJIL(itemView4)));
            C16880lQ.LJJJ((TuxIconView) c51324KCi.itemView.findViewById(R.id.f1l), new ACListenerS34S0300000_8(c51324KCi, searchSugEntity2, c50896JyG, 0));
            SugExtraInfo sugExtraInfo2 = searchSugEntity2.sugExtraInfo;
            if (sugExtraInfo2 == null || !sugExtraInfo2.isRichSug() || (userAvatarUri3 = sugExtraInfo2.getUserAvatarUri()) == null || userAvatarUri3.length() == 0) {
                c51324KCi.itemView.findViewById(R.id.dc_).setVisibility(8);
            } else {
                C57128MbU c57128MbU = (C57128MbU) c51324KCi.itemView.findViewById(R.id.eye);
                if (c57128MbU != null && c57128MbU.getAvatarImageView() != null) {
                    c51324KCi.itemView.findViewById(R.id.dc_).setVisibility(0);
                    if (C34055DYd.LJLILLLLZI.LJJII()) {
                        C38995FSd.LIZJ().execute(new ARunnableS27S0200000_8(c51324KCi, sugExtraInfo2, 10));
                    } else {
                        String userAvatarUri4 = sugExtraInfo2.getUserAvatarUri();
                        if (userAvatarUri4 != null) {
                            str2 = userAvatarUri4;
                        }
                        W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
                        LJIIIIZZ.LJJIIJ = ((C57128MbU) c51324KCi.itemView.findViewById(R.id.eye)).getAvatarImageView();
                        LJIIIIZZ.LIZIZ("SearchUserSugViewHolder");
                        C16880lQ.LLJJJ(LJIIIIZZ);
                    }
                    C57128MbU c57128MbU2 = (C57128MbU) c51324KCi.itemView.findViewById(R.id.eye);
                    o.LJIIIIZZ(c57128MbU2, "itemView.iv_avatar");
                    C78841Uwv.LJJIZ(c57128MbU2);
                }
            }
            SugExtraInfo sugExtraInfo3 = searchSugEntity2.sugExtraInfo;
            LD1 ld1 = c51324KCi.LJLL;
            if (ld1 != null) {
                ld1.LIZJ();
            }
            if (sugExtraInfo3 == null || !sugExtraInfo3.isRichSug() || (userAvatarUri2 = sugExtraInfo3.getUserAvatarUri()) == null || userAvatarUri2.length() == 0 || !sugExtraInfo3.isLiveQuery()) {
                C57128MbU c57128MbU3 = (C57128MbU) c51324KCi.itemView.findViewById(R.id.eye);
                if (c57128MbU3 != null) {
                    c57128MbU3.LIZIZ(false);
                }
                View findViewById = c51324KCi.itemView.findViewById(R.id.eud);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                c51324KCi.LJLL = null;
                return;
            }
            if (!sugExtraInfo3.isLiveQuery() || !DYB.LIZ()) {
                return;
            }
            View findViewById2 = c51324KCi.itemView.findViewById(R.id.eud);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
            LD1 ld12 = new LD1((C57128MbU) c51324KCi.itemView.findViewById(R.id.eye), (C57128MbU) c51324KCi.itemView.findViewById(R.id.eye), (C53873LCj) c51324KCi.itemView.findViewById(R.id.eud));
            ld12.LJIIJ(false);
            c51324KCi.LJLL = ld12;
            C57128MbU c57128MbU4 = (C57128MbU) c51324KCi.itemView.findViewById(R.id.eye);
            if (c57128MbU4 != null) {
                c57128MbU4.LIZIZ(true);
            }
            C57128MbU c57128MbU5 = (C57128MbU) c51324KCi.itemView.findViewById(R.id.eye);
            if (c57128MbU5 == null) {
                return;
            }
            C78841Uwv.LJJIL(c57128MbU5, C7MY.LIZIZ(26), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            return;
        }
        if (itemViewType == 2) {
            C51327KCl c51327KCl = (C51327KCl) viewHolder;
            SearchSugEntity searchSugEntity3 = (SearchSugEntity) ListProtector.get(this.LJLIL, i4);
            String str4 = this.LJLILLLLZI;
            c51327KCl.getClass();
            if (searchSugEntity3 == null || searchSugEntity3.sugExtraInfo == null) {
                return;
            }
            ((C4SP) c51327KCl.itemView.findViewById(R.id.mc3)).setBiggerTextSize(c51327KCl.LJLLJ);
            c51327KCl.LJLJJI = searchSugEntity3;
            c51327KCl.LJLJJL = i4;
            if (str4 == null) {
                str4 = "";
            }
            c51327KCl.LJLJJLL = str4;
            TextView textView6 = (TextView) ((C4SP) c51327KCl.itemView.findViewById(R.id.mc3))._$_findCachedViewById(R.id.mq0);
            if (textView6 != null) {
                textView6.setEllipsize(TextUtils.TruncateAt.END);
            }
            ViewGroup.LayoutParams layoutParams3 = c51327KCl.itemView.findViewById(R.id.f_o).getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.setMarginEnd(C17N.LJIILL(12.0d));
            c51327KCl.itemView.findViewById(R.id.f_o).setLayoutParams(marginLayoutParams3);
            Integer LIZIZ2 = C19N.LIZIZ(c51327KCl.itemView, "itemView.context", R.attr.gu);
            if (LIZIZ2 != null) {
                ((TuxIconView) c51327KCl.itemView.findViewById(R.id.f_o)).setTintColor(LIZIZ2.intValue());
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) c51327KCl.itemView.findViewById(R.id.fat);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_arrow_up_left_ltr;
            c2068389v.LIZLLL = C19N.LIZIZ(c51327KCl.itemView, "itemView.context", R.attr.gu);
            Context context6 = c51327KCl.itemView.getContext();
            o.LJIIIIZZ(context6, "itemView.context");
            appCompatImageView.setImageDrawable(c2068389v.LIZ(context6));
            c51327KCl.itemView.findViewById(R.id.nbs).setBackground(c51327KCl.itemView.getContext().getDrawable(R.drawable.c1y));
            c51327KCl.itemView.findViewById(R.id.nbs).setVisibility(0);
            ViewGroup.LayoutParams layoutParams4 = c51327KCl.itemView.findViewById(R.id.f_o).getLayoutParams();
            o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams4.setMarginStart(C17N.LJIILL(24.0d));
            marginLayoutParams4.setMarginEnd(C17N.LJIILL(20.0d));
            c51327KCl.itemView.findViewById(R.id.f_o).setLayoutParams(marginLayoutParams4);
            if (C52197Ke9.LIZ()) {
                TextView textView7 = (TextView) ((C4SP) c51327KCl.itemView.findViewById(R.id.mc3))._$_findCachedViewById(R.id.mq0);
                Context context7 = c51327KCl.itemView.getContext();
                o.LJIIIIZZ(context7, "itemView.getContext()");
                Integer LJI3 = C79045V0n.LJI(R.attr.gu, context7);
                o.LJI(LJI3);
                textView7.setTextColor(LJI3.intValue());
            }
            C4SP c4sp2 = (C4SP) c51327KCl.itemView.findViewById(R.id.mc3);
            Context context8 = c51327KCl.itemView.getContext();
            Context context9 = c51327KCl.itemView.getContext();
            o.LJIIIIZZ(context9, "itemView.context");
            CharSequence LJIILJJIL3 = C78841Uwv.LJIILJJIL(searchSugEntity3, context9, (InterfaceC212198Ul) c51327KCl.LJLLILLLL.getValue());
            View itemView5 = c51327KCl.itemView;
            o.LJIIIIZZ(itemView5, "itemView");
            c4sp2.LJJLJLI(context8, LJIILJJIL3, C78841Uwv.LJIJ(searchSugEntity3, itemView5, (InterfaceC212198Ul) c51327KCl.LJLLILLLL.getValue()));
            SugExtraInfo sugExtraInfo4 = searchSugEntity3.sugExtraInfo;
            if (sugExtraInfo4 == null || (userAvatarUri = sugExtraInfo4.getUserAvatarUri()) == null || userAvatarUri.length() == 0) {
                C57128MbU c57128MbU6 = (C57128MbU) c51327KCl.itemView.findViewById(R.id.eye);
                if (c57128MbU6 != null && (avatarImageView = c57128MbU6.getAvatarImageView()) != null) {
                    avatarImageView.setController(null);
                }
            } else {
                C57128MbU c57128MbU7 = (C57128MbU) c51327KCl.itemView.findViewById(R.id.eye);
                if (c57128MbU7 != null && c57128MbU7.getAvatarImageView() != null) {
                    View findViewById3 = c51327KCl.itemView.findViewById(R.id.dc_);
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(0);
                    }
                    if (C34055DYd.LJLILLLLZI.LJJII()) {
                        C38995FSd.LIZJ().execute(new ARunnableS27S0200000_8(c51327KCl, sugExtraInfo4, 9));
                    } else {
                        String userAvatarUri5 = sugExtraInfo4.getUserAvatarUri();
                        if (userAvatarUri5 != null) {
                            str2 = userAvatarUri5;
                        }
                        W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str2);
                        LJIIIIZZ2.LJJIIJ = ((C57128MbU) c51327KCl.itemView.findViewById(R.id.eye)).getAvatarImageView();
                        LJIIIIZZ2.LIZIZ("SearchUserSugViewHolder");
                        C16880lQ.LLJJJ(LJIIIIZZ2);
                    }
                    C57128MbU c57128MbU8 = (C57128MbU) c51327KCl.itemView.findViewById(R.id.eye);
                    o.LJIIIIZZ(c57128MbU8, "itemView.iv_avatar");
                    C78841Uwv.LJJIZ(c57128MbU8);
                }
            }
            SugExtraInfo sugExtraInfo5 = searchSugEntity3.sugExtraInfo;
            LD1 ld13 = c51327KCl.LJLLI;
            if (ld13 != null) {
                ld13.LIZJ();
            }
            if (sugExtraInfo5 == null || !sugExtraInfo5.isLiveQuery()) {
                C57128MbU c57128MbU9 = (C57128MbU) c51327KCl.itemView.findViewById(R.id.eye);
                if (c57128MbU9 != null) {
                    c57128MbU9.LIZIZ(false);
                }
                View findViewById4 = c51327KCl.itemView.findViewById(R.id.eud);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(8);
                }
                c51327KCl.LJLLI = null;
            } else if (sugExtraInfo5.isLiveQuery() && DYB.LIZ()) {
                View findViewById5 = c51327KCl.itemView.findViewById(R.id.eud);
                if (findViewById5 != null) {
                    findViewById5.setVisibility(0);
                }
                LD1 ld14 = new LD1((C57128MbU) c51327KCl.itemView.findViewById(R.id.eye), (C57128MbU) c51327KCl.itemView.findViewById(R.id.eye), (C53873LCj) c51327KCl.itemView.findViewById(R.id.eud));
                ld14.LJIIJ(false);
                c51327KCl.LJLLI = ld14;
                ((C57128MbU) c51327KCl.itemView.findViewById(R.id.eye)).LIZIZ(true);
                C57128MbU c57128MbU10 = (C57128MbU) c51327KCl.itemView.findViewById(R.id.eye);
                o.LJIIIIZZ(c57128MbU10, "itemView.iv_avatar");
                C78841Uwv.LJJIL(c57128MbU10, O6R.LJJIIZ(C32151Nz.LJIIZILJ(26)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            }
            C72242sW c72242sW3 = new C72242sW();
            View itemView6 = c51327KCl.itemView;
            o.LJIIIIZZ(itemView6, "itemView");
            itemView6.setOnTouchListener(new C51328KCm(c72242sW3, c51327KCl, !C32151Nz.LJJIL(itemView6)));
            return;
        }
        if (itemViewType == 0) {
            C51325KCj c51325KCj = (C51325KCj) viewHolder;
            SearchSugEntity searchSugEntity4 = (SearchSugEntity) ListProtector.get(this.LJLIL, i4);
            String str5 = this.LJLILLLLZI;
            if (searchSugEntity4 == null) {
                c51325KCj.getClass();
                return;
            }
            int i5 = C51325KCj.LLFF;
            if (c51325KCj.LJZI != i5) {
                ViewGroup.LayoutParams layoutParams5 = c51325KCj.itemView.getLayoutParams();
                layoutParams5.height = i5;
                c51325KCj.LJZI = i5;
                c51325KCj.itemView.setLayoutParams(layoutParams5);
            }
            c51325KCj.LJLILLLLZI.setTextSize(1, 17.0f);
            c51325KCj.LJLJI.setTextSize(1, 17.0f);
            c51325KCj.LJLJJI.setTextSize(1, 13.0f);
            c51325KCj.LJLJJL.setTextSize(1, 13.0f);
            Integer LJI4 = C79045V0n.LJI(R.attr.gw, c51325KCj.itemView.getContext());
            if (LJI4 != null) {
                c51325KCj.LJLJJI.setTextColor(LJI4.intValue());
                c51325KCj.LJLJJL.setTextColor(LJI4.intValue());
            } else {
                c51325KCj.LJLJJI.setTextColor(0);
                c51325KCj.LJLJJL.setTextColor(0);
            }
            int i6 = searchSugEntity4.LIZIZ;
            if (i6 < 0) {
                i6 = i4;
            }
            c51325KCj.LL = i6;
            c51325KCj.LJLLLLLL = searchSugEntity4;
            c51325KCj.LJZ = i4;
            c51325KCj.LJZL = c51325KCj.LJLZ;
            Context context10 = c51325KCj.itemView.getContext();
            SugExtraInfo sugExtraInfo6 = searchSugEntity4.sugExtraInfo;
            if (sugExtraInfo6 != null && sugExtraInfo6.getSugHint().length() > 0) {
                TextView mSugView = c51325KCj.LJLILLLLZI;
                View itemView7 = c51325KCj.itemView;
                o.LJIIIZ(mSugView, "mSugView");
                o.LJIIIZ(itemView7, "itemView");
                Context context11 = itemView7.getContext();
                o.LJIIIIZZ(context11, "itemView.context");
                CharSequence LJIILJJIL4 = C78841Uwv.LJIILJJIL(searchSugEntity4, context11, SearchServiceImpl.LLLZI().LLILZ());
                Context context12 = mSugView.getContext();
                o.LJIIIIZZ(context12, "mSugView.context");
                CharSequence LJIILJJIL5 = C78841Uwv.LJIILJJIL(searchSugEntity4, context12, SearchServiceImpl.LLLZI().LLILZ());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LJIILJJIL5);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" · ");
                LIZ.append(searchSugEntity4.sugExtraInfo.getSugHint());
                spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ));
                Context context13 = mSugView.getContext();
                o.LJIIIIZZ(context13, "mSugView.context");
                spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.gw, context13)), LJIILJJIL5.length(), spannableStringBuilder.length(), 34);
                mSugView.setText(spannableStringBuilder);
                if (searchSugEntity4.LIZIZ() && searchSugEntity4.sugExtraInfo.getSugHint().length() > 0) {
                    mSugView.setText("");
                    value = KD4.TWO_LINE_ALL.getValue();
                } else {
                    Context context14 = mSugView.getContext();
                    o.LJIIIIZZ(context14, "mSugView.context");
                    float LIZ2 = C47135Ieh.LIZ(124, C32151Nz.LJJII(context14));
                    TextPaint paint = mSugView.getPaint();
                    o.LJIIIIZZ(paint, "mSugView.paint");
                    if (paint.measureText(mSugView.getText().toString()) < LIZ2) {
                        mSugView.setText("");
                        value = KD4.SINGLE_LINE_HINT.getValue();
                    } else {
                        mSugView.setText("");
                        value = KD4.TWO_LINE_HINT.getValue();
                    }
                }
                if (value == KD4.SINGLE_LINE_HINT.getValue()) {
                    itemView7.findViewById(R.id.bst).setVisibility(0);
                    itemView7.findViewById(R.id.bu7).setVisibility(8);
                    mSugView.setText(LJIILJJIL4);
                    itemView7.findViewById(R.id.mlx).setVisibility(0);
                    itemView7.findViewById(R.id.mlz).setVisibility(0);
                    ((TextView) itemView7.findViewById(R.id.mlx)).setText(searchSugEntity4.sugExtraInfo.getSugHint());
                    ((TextView) itemView7.findViewById(R.id.mlz)).setText(" · ");
                } else if (value == KD4.TWO_LINE_HINT.getValue()) {
                    itemView7.findViewById(R.id.bst).setVisibility(8);
                    itemView7.findViewById(R.id.bu7).setVisibility(0);
                    ((TextView) itemView7.findViewById(R.id.mm0)).setText(LJIILJJIL4);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(searchSugEntity4.sugExtraInfo.getSugHint());
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(C1EU.LIZ(itemView7, "itemView.context", R.attr.gw)), 0, spannableStringBuilder2.length(), 34);
                    spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder2.length(), 33);
                    ((TextView) itemView7.findViewById(R.id.mly)).setText(spannableStringBuilder2);
                } else if (value == KD4.TWO_LINE_ALL.getValue()) {
                    TextView textView8 = (TextView) itemView7.findViewById(R.id.mm0);
                    Context context15 = itemView7.getContext();
                    o.LJIIIIZZ(context15, "itemView.context");
                    textView8.setMaxWidth(C32151Nz.LJJII(context15) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(138)));
                    itemView7.findViewById(R.id.bst).setVisibility(8);
                    itemView7.findViewById(R.id.bu7).setVisibility(0);
                    ((ImageView) itemView7.findViewById(R.id.f4r)).setVisibility(0);
                    ((TextView) itemView7.findViewById(R.id.mm0)).setText(LJIILJJIL4);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(searchSugEntity4.sugExtraInfo.getSugHint());
                    Integer LIZIZ3 = C19N.LIZIZ(itemView7, "itemView.context", R.attr.gw);
                    if (LIZIZ3 != null) {
                        i3 = LIZIZ3.intValue();
                    } else {
                        i3 = 0;
                    }
                    spannableStringBuilder3.setSpan(new ForegroundColorSpan(i3), 0, spannableStringBuilder3.length(), 34);
                    spannableStringBuilder3.setSpan(new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder3.length(), 33);
                    ((TextView) itemView7.findViewById(R.id.mly)).setText(spannableStringBuilder3);
                }
            } else {
                c51325KCj.LLF = C51495KIx.LIZIZ(searchSugEntity4, c51325KCj.LJLILLLLZI, c51325KCj.itemView, i5);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) c51325KCj.LJLJL.getLayoutParams();
            marginLayoutParams5.setMarginEnd(C17N.LJIILL(12.0d));
            c51325KCj.LJLJL.setLayoutParams(marginLayoutParams5);
            if (C52197Ke9.LIZ()) {
                TextView textView9 = c51325KCj.LJLILLLLZI;
                Context context16 = textView9.getContext();
                i2 = R.attr.gu;
                textView9.setTextColor(C79045V0n.LJI(R.attr.gu, context16).intValue());
            } else {
                i2 = R.attr.gu;
            }
            c51325KCj.LJLJL.setTintColor(C79045V0n.LJI(i2, c51325KCj.LJLILLLLZI.getContext()).intValue());
            C51335KCt c51335KCt = c51325KCj.LJLJJLL;
            AObjectS42S0101000_5 aObjectS42S0101000_5 = new AObjectS42S0101000_5(7, c51325KCj, 61);
            C2068389v c2068389v2 = new C2068389v();
            aObjectS42S0101000_5.invoke(c2068389v2);
            c51335KCt.setImageDrawable(c2068389v2.LIZ(c51325KCj.itemView.getContext()));
            c51325KCj.LJLLI.setBackground(c51325KCj.LJLILLLLZI.getContext().getDrawable(R.drawable.c1y));
            c51325KCj.LJLLI.setVisibility(0);
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) c51325KCj.LJLJL.getLayoutParams();
            marginLayoutParams6.setMarginStart(C17N.LJIILL(24.0d));
            marginLayoutParams6.setMarginEnd(C17N.LJIILL(20.0d));
            c51325KCj.LJLJL.setLayoutParams(marginLayoutParams6);
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context10);
            if (LJJIFFI == null) {
                LJJIFFI = null;
            }
            C50321Joz fetchTopFragmentData = C50652JuK.fetchTopFragmentData(LJJIFFI);
            if (fetchTopFragmentData != null && !fetchTopFragmentData.getSearchPosition().isEmpty()) {
                c51325KCj.LJZL = fetchTopFragmentData.getSearchPosition();
            }
            String str6 = c51325KCj.LJZL;
            c51325KCj.itemView.setOnTouchListener(new C51331KCp(c51325KCj, Boolean.valueOf(!C32151Nz.LJJIL(r1)), str6, searchSugEntity4, str5));
            return;
        }
        if (itemViewType != 5 || !(viewHolder instanceof KD8)) {
            return;
        }
        KD8 kd8 = (KD8) viewHolder;
        ActivityC45651qj activityC45651qj = this.LJLJLLL;
        if (activityC45651qj != null) {
            str2 = activityC45651qj.getString(R.string.ub);
        }
        kd8.LJLILLLLZI.setText(str2);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        new C50699Jv5((Context) this.LJLJLLL).LIZIZ(new C50678Juk("sug"));
        boolean z = true;
        if (i == 6) {
            C51341KCz c51341KCz = this.LJLLILLLL;
            c51341KCz.getClass();
            System.currentTimeMillis();
            viewHolder = c51341KCz.LJII.LIZJ();
            if (viewHolder == null) {
                viewHolder = c51341KCz.LJII.LIZIZ();
            }
        } else if (i == 1) {
            C51341KCz c51341KCz2 = this.LJLLILLLL;
            c51341KCz2.getClass();
            System.currentTimeMillis();
            viewHolder = c51341KCz2.LJ.LIZJ();
            if (viewHolder == null) {
                viewHolder = c51341KCz2.LJ.LIZIZ();
            }
        } else if (i == 2) {
            C51341KCz c51341KCz3 = this.LJLLILLLL;
            c51341KCz3.getClass();
            System.currentTimeMillis();
            viewHolder = c51341KCz3.LIZJ.LIZJ();
            if (viewHolder == null) {
                viewHolder = c51341KCz3.LIZJ.LIZIZ();
            }
        } else if (i == 3) {
            C51341KCz c51341KCz4 = this.LJLLILLLL;
            c51341KCz4.getClass();
            System.currentTimeMillis();
            viewHolder = c51341KCz4.LJI.LIZJ();
            if (viewHolder == null) {
                viewHolder = c51341KCz4.LJI.LIZIZ();
            }
        } else if (i == 0) {
            C51341KCz c51341KCz5 = this.LJLLILLLL;
            c51341KCz5.getClass();
            System.currentTimeMillis();
            viewHolder = c51341KCz5.LIZLLL.LIZJ();
            if (viewHolder == null) {
                viewHolder = c51341KCz5.LIZLLL.LIZIZ();
            }
        } else if (i == 5) {
            C51341KCz c51341KCz6 = this.LJLLILLLL;
            c51341KCz6.getClass();
            System.currentTimeMillis();
            viewHolder = c51341KCz6.LJFF.LIZJ();
            if (viewHolder == null) {
                viewHolder = c51341KCz6.LJFF.LIZIZ();
            }
        } else {
            viewHolder = null;
        }
        C0AX.LIZ(viewGroup, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }

    public final void LJLLLLLL(SearchSugEntity searchSugEntity, int i, String str, String str2, String str3) {
        Word word = searchSugEntity.mWord;
        if (word == null) {
            return;
        }
        C49699Jex c49699Jex = new C49699Jex();
        c49699Jex.LJIIZILJ("raw_query", this.LJLL);
        c49699Jex.LJIIZILJ("words_content", word.getWord());
        c49699Jex.LJJIIJZLJL(Integer.valueOf(i));
        c49699Jex.LJIIZILJ("impr_id", this.LJLILLLLZI);
        c49699Jex.LJIIZILJ("group_id", word.getId());
        c49699Jex.LJIIZILJ("button_type", str);
        c49699Jex.LJIIZILJ("words_source", "sug");
        c49699Jex.LJIIZILJ("sug_type", str2);
        c49699Jex.LJ("feedback_id", str3, InterfaceC1798974f.LIZ);
        c49699Jex.LJIILIIL();
    }
}
