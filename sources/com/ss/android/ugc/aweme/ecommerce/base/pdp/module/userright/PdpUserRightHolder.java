package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright;

import X.AnonymousClass391;
import X.AnonymousClass636;
import X.C03090Af;
import X.C0F1;
import X.C16880lQ;
import X.C221108m2;
import X.C26338AVi;
import X.C26678AdW;
import X.C26679AdX;
import X.C26830Afy;
import X.C32151Nz;
import X.C47135Ieh;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70759Rpr;
import X.C76800UCe;
import X.C79045V0n;
import X.C7MY;
import X.L9G;
import X.O6R;
import X.ORS;
import X.OUP;
import X.T5U;
import X.W5F;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public class PdpUserRightHolder extends PdpHolder {
    public static final /* synthetic */ int LJLJL = 0;
    public final Fragment LJLIL;
    public int LJLILLLLZI;
    public final StringBuilder LJLJI;
    public String LJLJJI;
    public final LinkedList<C26679AdX> LJLJJL;
    public final Map<Integer, View> LJLJJLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v11, types: [com.bytedance.tux.input.TuxTextView, android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.ViewGroup] */
    public void L(C26678AdW item) {
        Image image;
        int i;
        Image image2;
        Image image3;
        int i2;
        int i3;
        o.LJIIIZ(item, "item");
        ExposeUserRightPanel exposeUserRightPanel = item.LJLIL.exposeUserRightPanel;
        if (exposeUserRightPanel == null) {
            return;
        }
        Integer num = exposeUserRightPanel.backgroundColor;
        if (num != null) {
            int intValue = num.intValue();
            View findViewById = this.itemView.findViewById(R.id.k8e);
            o.LJIIIIZZ(findViewById, "itemView.space_line");
            OUP.LJIJJLI(findViewById);
            if (intValue == 1) {
                View view = this.itemView;
                Context context = view.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                if (C0F1.LIZIZ(this.itemView, "itemView.context")) {
                    i2 = R.attr.ck;
                } else {
                    i2 = R.attr.cc;
                }
                Integer LJI = C79045V0n.LJI(i2, context);
                if (LJI != null) {
                    i3 = LJI.intValue();
                } else {
                    i3 = 0;
                }
                view.setBackgroundColor(i3);
                if (!C0F1.LIZIZ(this.itemView, "itemView.context")) {
                    this.itemView.getBackground().setAlpha(128);
                }
            }
        }
        Integer num2 = exposeUserRightPanel.style;
        if (num2 == null) {
            return;
        }
        if (num2.intValue() == 1) {
            View view2 = this.itemView;
            View user_right_background = view2.findViewById(R.id.n0_);
            o.LJIIIIZZ(user_right_background, "user_right_background");
            OUP.LJIJJLI(user_right_background);
            View user_right_old_layout = view2.findViewById(R.id.n0f);
            o.LJIIIIZZ(user_right_old_layout, "user_right_old_layout");
            OUP.LJIJJLI(user_right_old_layout);
            View user_right_new_layout = view2.findViewById(R.id.n0e);
            o.LJIIIIZZ(user_right_new_layout, "user_right_new_layout");
            OUP.LJIJJLI(user_right_new_layout);
            View user_right_simple_style_layout = _$_findCachedViewById(R.id.n0l);
            o.LJIIIIZZ(user_right_simple_style_layout, "user_right_simple_style_layout");
            OUP.LJIJJLI(user_right_simple_style_layout);
            View user_right_new_default_layout_mark = view2.findViewById(R.id.n0d);
            o.LJIIIIZZ(user_right_new_default_layout_mark, "user_right_new_default_layout_mark");
            OUP.LJJLIIIJ(user_right_new_default_layout_mark);
            View user_right_new_default_layout = view2.findViewById(R.id.n0c);
            o.LJIIIIZZ(user_right_new_default_layout, "user_right_new_default_layout");
            OUP.LJJLIIIJ(user_right_new_default_layout);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
            if (C26830Afy.LIZ()) {
                ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.n0c);
                o.LJIIIIZZ(viewGroup, "itemView.user_right_new_default_layout");
                LinkedList<C26679AdX> linkedList = this.LJLJJL;
                while (viewGroup.getChildCount() > 0) {
                    C16880lQ.LLIFFJFJJ(0, viewGroup);
                    C76800UCe c76800UCe = C76800UCe.LIZ;
                    if (c76800UCe instanceof C26679AdX) {
                        linkedList.add(c76800UCe);
                    }
                }
            } else {
                ((ViewGroup) this.itemView.findViewById(R.id.n0c)).removeAllViews();
            }
            List<ExposeUserRight> list = item.LJLIL.exposeUserRightPanel.exposeUserRights;
            if (list == null) {
                return;
            }
            this.LJLILLLLZI = list.size();
            Context context2 = view2.getContext();
            o.LJIIIIZZ(context2, "context");
            int LIZ = C47135Ieh.LIZ(28, C47135Ieh.LIZ(16, C32151Nz.LJJII(context2)));
            int i4 = 0;
            for (ExposeUserRight exposeUserRight : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    ExposeUserRight exposeUserRight2 = exposeUserRight;
                    StringBuilder sb = this.LJLJI;
                    sb.append(exposeUserRight2.nameEn);
                    sb.append(",");
                    C26679AdX c26679AdX = (C26679AdX) ORS.LJJLJLI(this.LJLJJL);
                    if (c26679AdX == null) {
                        Context context3 = view2.getContext();
                        o.LJIIIIZZ(context3, "context");
                        c26679AdX = new C26679AdX(context3, null, 0);
                        Icon icon = exposeUserRight2.icon;
                        if (icon != null) {
                            image3 = icon.icon;
                        } else {
                            image3 = null;
                        }
                        c26679AdX.setIcon(image3);
                        c26679AdX.LJJLJLI(null, exposeUserRight2.name);
                        if (i4 != list.size() - 1) {
                            c26679AdX.setViewMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(136)));
                        }
                    }
                    int viewWidth = c26679AdX.getViewWidth();
                    if (LIZ <= viewWidth) {
                        c26679AdX.setEllipsize(null);
                        ((ViewGroup) view2.findViewById(R.id.n0c)).addView(c26679AdX, layoutParams);
                        this.LJLJJI = "1";
                        return;
                    } else {
                        LIZ -= viewWidth;
                        ((ViewGroup) view2.findViewById(R.id.n0c)).addView(c26679AdX, layoutParams);
                        i4 = i5;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (this.LJLJI.length() <= 0) {
                return;
            }
            StringBuilder sb2 = this.LJLJI;
            sb2.deleteCharAt(s.LJJLIIIJ(sb2));
            return;
        }
        if (num2.intValue() == 2) {
            View view3 = this.itemView;
            View user_right_new_default_layout2 = view3.findViewById(R.id.n0c);
            o.LJIIIIZZ(user_right_new_default_layout2, "user_right_new_default_layout");
            OUP.LJIJJLI(user_right_new_default_layout2);
            View user_right_old_layout2 = view3.findViewById(R.id.n0f);
            o.LJIIIIZZ(user_right_old_layout2, "user_right_old_layout");
            OUP.LJIJJLI(user_right_old_layout2);
            View user_right_new_default_layout_mark2 = view3.findViewById(R.id.n0d);
            o.LJIIIIZZ(user_right_new_default_layout_mark2, "user_right_new_default_layout_mark");
            OUP.LJIJJLI(user_right_new_default_layout_mark2);
            View user_right_simple_style_layout2 = _$_findCachedViewById(R.id.n0l);
            o.LJIIIIZZ(user_right_simple_style_layout2, "user_right_simple_style_layout");
            OUP.LJIJJLI(user_right_simple_style_layout2);
            View user_right_new_layout2 = view3.findViewById(R.id.n0e);
            o.LJIIIIZZ(user_right_new_layout2, "user_right_new_layout");
            OUP.LJJLIIIJ(user_right_new_layout2);
            if (C26830Afy.LIZ()) {
                ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.ba8);
                o.LJIIIIZZ(viewGroup2, "itemView.child_user_right_layout");
                LinkedList<C26679AdX> linkedList2 = this.LJLJJL;
                while (viewGroup2.getChildCount() > 0) {
                    C16880lQ.LLIFFJFJJ(0, viewGroup2);
                    C76800UCe c76800UCe2 = C76800UCe.LIZ;
                    if (c76800UCe2 instanceof C26679AdX) {
                        linkedList2.add(c76800UCe2);
                    }
                }
            } else {
                ((ViewGroup) this.itemView.findViewById(R.id.ba8)).removeAllViews();
            }
            ExposeUserRightPanel exposeUserRightPanel2 = item.LJLIL.exposeUserRightPanel;
            if (exposeUserRightPanel2 == null) {
                return;
            }
            List<ExposeUserRight> list2 = exposeUserRightPanel2.exposeUserRights;
            if (list2 != null) {
                i = list2.size();
            } else {
                i = 0;
            }
            this.LJLILLLLZI = i;
            ((TextView) view3.findViewById(R.id.n0o)).setText(exposeUserRightPanel2.title);
            Icon icon2 = exposeUserRightPanel2.icon;
            if (icon2 != null) {
                image2 = icon2.icon;
            } else {
                image2 = null;
            }
            if (image2 != null) {
                W5F LIZLLL = C70759Rpr.LIZLLL(image2.toImageUrlModel());
                LIZLLL.LJIILIIL = C7MY.LIZJ(view3, "context", R.attr.cv);
                LIZLLL.LJJIIJZLJL = (ImageView) view3.findViewById(R.id.n0a);
                L9G.LIZ(LIZLLL);
            }
            Icon icon3 = exposeUserRightPanel2.background;
            if (icon3 != null && icon3.icon != null) {
                View user_right_background2 = view3.findViewById(R.id.n0_);
                o.LJIIIIZZ(user_right_background2, "user_right_background");
                OUP.LJJLIIIJ(user_right_background2);
                W5F LIZLLL2 = C70759Rpr.LIZLLL(exposeUserRightPanel2.background.icon.toImageUrlModel());
                LIZLLL2.LJIILIIL = C7MY.LIZJ(view3, "context", R.attr.cv);
                LIZLLL2.LJJIIJZLJL = (ImageView) view3.findViewById(R.id.n0_);
                L9G.LIZ(LIZLLL2);
            }
            List<ExposeUserRight> list3 = exposeUserRightPanel2.exposeUserRights;
            if (list3 != null) {
                boolean z = true;
                for (ExposeUserRight exposeUserRight3 : list3) {
                    StringBuilder sb3 = this.LJLJI;
                    sb3.append(exposeUserRight3.nameEn);
                    sb3.append(",");
                    if (z) {
                        z = false;
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view3.findViewById(R.id.ba8);
                        View view4 = (View) ORS.LJJLJLI(this.LJLJJL);
                        if (view4 == null) {
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C7MY.LIZIZ(1), C7MY.LIZIZ(10));
                            view4 = new View(this.itemView.getContext());
                            layoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
                            layoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
                            layoutParams2.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(2));
                            layoutParams2.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(2));
                            view4.setLayoutParams(layoutParams2);
                            Context context4 = this.itemView.getContext();
                            o.LJIIIIZZ(context4, "itemView.context");
                            view4.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.dz, context4));
                        }
                        viewGroup3.addView(view4);
                    }
                    ?? r9 = (ViewGroup) view3.findViewById(R.id.ba8);
                    ?? r8 = (View) ORS.LJJLJLI(this.LJLJJL);
                    if (r8 == 0) {
                        Context context5 = view3.getContext();
                        o.LJIIIIZZ(context5, "context");
                        r8 = new TuxTextView(context5, null, 6, 0);
                        r8.setText(exposeUserRight3.name);
                        r8.setTuxFont(81);
                        Context context6 = r8.getContext();
                        o.LJIIIIZZ(context6, "context");
                        r8.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, context6));
                    }
                    r9.addView(r8);
                }
            }
            if (this.LJLJI.length() <= 0) {
                return;
            }
            StringBuilder sb4 = this.LJLJI;
            sb4.deleteCharAt(s.LJJLIIIJ(sb4));
            return;
        }
        if (num2.intValue() != 3) {
            return;
        }
        View view5 = this.itemView;
        View space_line = view5.findViewById(R.id.k8e);
        o.LJIIIIZZ(space_line, "space_line");
        OUP.LJIJJLI(space_line);
        View user_right_background3 = view5.findViewById(R.id.n0_);
        o.LJIIIIZZ(user_right_background3, "user_right_background");
        OUP.LJIJJLI(user_right_background3);
        View user_right_old_layout3 = view5.findViewById(R.id.n0f);
        o.LJIIIIZZ(user_right_old_layout3, "user_right_old_layout");
        OUP.LJIJJLI(user_right_old_layout3);
        View user_right_new_layout3 = view5.findViewById(R.id.n0e);
        o.LJIIIIZZ(user_right_new_layout3, "user_right_new_layout");
        OUP.LJIJJLI(user_right_new_layout3);
        View user_right_new_default_layout3 = view5.findViewById(R.id.n0c);
        o.LJIIIIZZ(user_right_new_default_layout3, "user_right_new_default_layout");
        OUP.LJIJJLI(user_right_new_default_layout3);
        View user_right_new_default_layout_mark3 = view5.findViewById(R.id.n0d);
        o.LJIIIIZZ(user_right_new_default_layout_mark3, "user_right_new_default_layout_mark");
        OUP.LJIJJLI(user_right_new_default_layout_mark3);
        View user_right_simple_style_layout3 = _$_findCachedViewById(R.id.n0l);
        o.LJIIIIZZ(user_right_simple_style_layout3, "user_right_simple_style_layout");
        OUP.LJJLIIIJ(user_right_simple_style_layout3);
        List<ExposeUserRight> list4 = item.LJLIL.exposeUserRightPanel.exposeUserRights;
        if (list4 == null) {
            return;
        }
        this.LJLILLLLZI = list4.size();
        Icon icon4 = item.LJLIL.exposeUserRightPanel.icon;
        if (icon4 != null && (image = icon4.icon) != null) {
            W5F LIZLLL3 = C70759Rpr.LIZLLL(image.toImageUrlModel());
            LIZLLL3.LJJIIJZLJL = (ImageView) _$_findCachedViewById(R.id.n0k);
            C16880lQ.LLJJJ(LIZLLL3);
        }
        View arrow = view5.findViewById(R.id.a7n);
        o.LJIIIIZZ(arrow, "arrow");
        C26338AVi.LJI(arrow, 0, 0, 0, AnonymousClass391.LIZJ(16), false, 16);
        Context context7 = view5.getContext();
        o.LJIIIIZZ(context7, "context");
        int LIZ2 = C47135Ieh.LIZ(28, C47135Ieh.LIZ(16, C32151Nz.LJJII(context7)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z2 = true;
        int i6 = 0;
        for (ExposeUserRight exposeUserRight4 : list4) {
            int i7 = i6 + 1;
            if (i6 >= 0) {
                ExposeUserRight exposeUserRight5 = exposeUserRight4;
                SpannableString spannableString = new SpannableString(String.valueOf(exposeUserRight5.name));
                spannableString.setSpan(new T5U(71, false), 0, spannableString.length(), 33);
                if (z2) {
                    z2 = false;
                } else {
                    SpannableString spannableString2 = new SpannableString(" · ");
                    spannableString2.setSpan(new T5U(71, false), 0, spannableString2.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString2);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                StringBuilder sb5 = this.LJLJI;
                sb5.append(exposeUserRight5.nameEn);
                sb5.append(",");
                int width = _$_findCachedViewById(R.id.n0l).getWidth();
                if (LIZ2 <= width) {
                    this.LJLJJI = "1";
                    ((TextView) _$_findCachedViewById(R.id.n0n)).setText(spannableStringBuilder);
                    return;
                } else {
                    LIZ2 -= width;
                    i6 = i7;
                }
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (this.LJLJI.length() > 0) {
            StringBuilder sb6 = this.LJLJI;
            sb6.deleteCharAt(s.LJJLIIIJ(sb6));
        }
        ((TextView) _$_findCachedViewById(R.id.n0n)).setText(spannableStringBuilder);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        Image image;
        C26678AdW item = (C26678AdW) obj;
        o.LJIIIZ(item, "item");
        if (item.LJLIL.exposeUserRightPanel == null) {
            View findViewById = this.itemView.findViewById(R.id.n0e);
            o.LJIIIIZZ(findViewById, "itemView.user_right_new_layout");
            OUP.LJIJJLI(findViewById);
            View findViewById2 = this.itemView.findViewById(R.id.n0c);
            o.LJIIIIZZ(findViewById2, "itemView.user_right_new_default_layout");
            OUP.LJIJJLI(findViewById2);
            View findViewById3 = this.itemView.findViewById(R.id.n0f);
            o.LJIIIIZZ(findViewById3, "itemView.user_right_old_layout");
            OUP.LJJLIIIJ(findViewById3);
            if (C26830Afy.LIZ()) {
                ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.n0f);
                o.LJIIIIZZ(viewGroup, "itemView.user_right_old_layout");
                LinkedList<C26679AdX> linkedList = this.LJLJJL;
                while (viewGroup.getChildCount() > 0) {
                    C16880lQ.LLIFFJFJJ(0, viewGroup);
                    C76800UCe c76800UCe = C76800UCe.LIZ;
                    if (c76800UCe instanceof C26679AdX) {
                        linkedList.add(c76800UCe);
                    }
                }
            } else {
                ((ViewGroup) this.itemView.findViewById(R.id.n0f)).removeAllViews();
            }
            List<UserRightDetail> list = item.LJLIL.userRightDetails;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (UserRightDetail userRightDetail : list) {
                    if (o.LJ(userRightDetail.expose, Boolean.TRUE)) {
                        arrayList.add(userRightDetail);
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.LJLILLLLZI = arrayList.size();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.topMargin = C7MY.LIZIZ(4);
                    layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    layoutParams.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
                    Iterator it = arrayList.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            UserRightDetail userRightDetail2 = (UserRightDetail) next;
                            C26679AdX c26679AdX = (C26679AdX) ORS.LJJLJLI(this.LJLJJL);
                            if (c26679AdX == null) {
                                Context context = this.itemView.getContext();
                                o.LJIIIIZZ(context, "itemView.context");
                                c26679AdX = new C26679AdX(context, null, 0);
                            }
                            Icon icon = userRightDetail2.icon;
                            if (icon != null) {
                                image = icon.icon;
                            } else {
                                image = null;
                            }
                            c26679AdX.setIcon(image);
                            c26679AdX.LJJLJLI(null, userRightDetail2.name);
                            if (this.LJLILLLLZI == 1) {
                                c26679AdX.setDesc(userRightDetail2.description);
                            }
                            if (i == 0) {
                                c26679AdX.LJJLJLI(62, userRightDetail2.name);
                            }
                            ((ViewGroup) this.itemView.findViewById(R.id.n0f)).addView(c26679AdX, layoutParams);
                            this.LJLJI.append(userRightDetail2.nameEn);
                            this.LJLJI.append(",");
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    if (this.LJLJI.length() > 0) {
                        StringBuilder sb = this.LJLJI;
                        sb.deleteCharAt(s.LJJLIIIJ(sb));
                    }
                }
            }
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            OUP.LJIJJLI(itemView);
        } else {
            L(item);
        }
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 188));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("rights_cnt", Integer.valueOf(this.LJLILLLLZI));
        String sb2 = this.LJLJI.toString();
        o.LJIIIIZZ(sb2, "userRightContent.toString()");
        linkedHashMap.put("rights_content", sb2);
        linkedHashMap.put("module_show_type", this.LJLJJI);
        C70414RkI c70414RkI = ((PdpViewModel) LIZIZ.getValue()).LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJJJLL(linkedHashMap);
        }
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 99, 42), itemView2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpUserRightHolder(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a51);
        this.LJLJJLL = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLIL = eCBaseFragment;
        this.LJLJI = new StringBuilder();
        this.LJLJJI = CardStruct.IStatusCode.DEFAULT;
        this.LJLJJL = new LinkedList<>();
    }
}
