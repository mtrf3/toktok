package com.ss.android.ugc.aweme.donation.detail;

import X.ActivityC45651qj;
import X.C0H1;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C225158sZ;
import X.C29S;
import X.C3C5;
import X.C42884GsK;
import X.C62822Ol8;
import X.C62869Olt;
import X.C62871Olv;
import X.C68322mC;
import X.C73305Spp;
import X.C73306Spq;
import X.C76732zl;
import X.C76800UCe;
import X.C8HS;
import X.C90903hW;
import X.FMX;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.MRI;
import X.SY4;
import X.T5S;
import X.ViewOnClickListenerC62868Ols;
import Y.ACListenerS30S0100000_10;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.donation.DonorStruct;
import com.ss.android.ugc.aweme.donation.detail.DonationFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class DonationFragment extends Fragment implements InterfaceC223218pR<DonorStruct>, InterfaceC191547fS {
    public static final /* synthetic */ int LJZ = 0;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public C225158sZ LJLLLL;
    public boolean LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final MRI LJLIL = new MRI();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 165));
    public String LJLJI = "";
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 166));

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<DonorStruct> list, boolean z) {
    }

    public DonationFragment() {
        C221108m2.LIZIZ(new C62871Olv(this));
        this.LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 161));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 163));
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 194));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 167));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 168));
        this.LJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 169));
        this.LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 164));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 193));
        this.LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 195));
        this.LJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 162));
    }

    public final String Al() {
        return (String) this.LJLL.getValue();
    }

    public final void Dl() {
        String Al;
        C188727au c188727au = new C188727au();
        String vl = vl();
        String str = "";
        if (vl == null) {
            vl = "";
        }
        c188727au.LJIIIZ("group_id", vl);
        Aweme aweme = getAweme();
        if ((aweme == null || (Al = aweme.getAuthorUid()) == null) && (Al = Al()) == null) {
            Al = "";
        }
        c188727au.LJIIIZ("author_id", Al);
        Object value = this.LJLJL.getValue();
        if (value == null) {
            value = "";
        }
        c188727au.LJFF(value, "ngo_id");
        String str2 = (String) this.LJLJLJ.getValue();
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("organization_id", str2);
        String str3 = (String) this.LJLJLLL.getValue();
        if (str3 != null) {
            str = str3;
        }
        c188727au.LJIIIZ("organization_type", str);
        c188727au.LJIIIZ("enter_from", getEnterFrom());
        c188727au.LJIIIZ("enter_method", this.LJLJI);
        c188727au.LJIIIZ("log_pb", (String) this.LJLJJI.getValue());
        c188727au.LJIIIZ("ngo_name", (String) this.LJLLJ.getValue());
        c188727au.LJIIIZ("anchor_type", (String) this.LJLLL.getValue());
        c188727au.LJIIIZ("powered_by", (String) this.LJLJLLL.getValue());
        FMX.LJIIL("donation_panel_show", c188727au.LIZ);
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        this.LJLIL.LJIILL(4);
    }

    public final Aweme getAweme() {
        return (Aweme) this.LJLJJLL.getValue();
    }

    public final String getEnterFrom() {
        return (String) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LJLIL.LJJII();
        this.LJLIL.LIZIZ();
        super.onDestroyView();
        ((LinkedHashMap) this.LJLZ).clear();
    }

    public final String vl() {
        return (String) this.LJLJJL.getValue();
    }

    public final String wl() {
        return (String) this.LJLLI.getValue();
    }

    public final C225158sZ xl() {
        C225158sZ c225158sZ = this.LJLLLL;
        if (c225158sZ != null) {
            return c225158sZ;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
        C16880lQ.LJIIJJI(null, (C73305Spp) _$_findCachedViewById(R.id.kf_));
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        _$_findCachedViewById(R.id.hi6).setVisibility(8);
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        if (xl().mShowFooter) {
            xl().setShowFooter(false);
            xl().notifyDataSetChanged();
            xl().showLoadMoreEmpty();
            xl().setShowFooter(false);
        }
        Gl(true);
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        xl().showLoadMoreLoading();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gl(boolean r12) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.donation.detail.DonationFragment.Gl(boolean):void");
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        if (xl().mShowFooter) {
            xl().setShowFooter(false);
            xl().notifyDataSetChanged();
        }
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
        C73306Spq c73306Spq = new C73306Spq();
        String string = getString(R.string.hve);
        o.LJIIIIZZ(string, "getString(R.string.load_status_click_retry)");
        c73306Spq.LJI = string;
        c73305Spp.setStatus(c73306Spq);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        C16880lQ.LJIIJJI(new ACListenerS30S0100000_10(this, 43), (C73305Spp) _$_findCachedViewById(R.id.kf_));
        _$_findCachedViewById(R.id.hi6).setVisibility(8);
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        xl().showPullUpLoadMore((RecyclerView) _$_findCachedViewById(R.id.cf3), false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("enter_method", "")) != null) {
            str = string;
        }
        this.LJLJI = str;
        Dl();
    }

    public final void Hl(String str, String enterFrom) {
        String str2;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (mo49getActivity() == null && getContext() == null) {
            return;
        }
        Bundle LIZ = C0H1.LIZ("url", str);
        Context context = getContext();
        if (context == null || (str2 = context.getString(R.string.eww)) == null) {
            str2 = "";
        }
        LIZ.putString("title", str2);
        LIZ.putString("enter_from", enterFrom);
        LIZ.putString("hide_more", "false");
        C42884GsK.LIZ(this, LIZ);
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<DonorStruct> list, boolean z) {
        xl().setShowFooter(true);
        if (!z) {
            xl().showLoadMoreEmpty();
            xl().setShowFooter(false);
        } else {
            xl().resetLoadMoreState();
        }
        Gl(false);
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<DonorStruct> list, boolean z) {
        if (list == null || list.isEmpty() || !z) {
            xl().setShowFooter(false);
        } else {
            xl().resetLoadMoreState();
        }
        xl().setDataAfterLoadMore(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v48, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.8sZ, X.MK7, X.09q] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Long l;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        ?? r4 = new C8HS<DonorStruct>(this) { // from class: X.8sZ
            public final DonationFragment LJLIL;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(false, 1, null);
                o.LJIIIZ(this, "fragment");
                this.LJLIL = this;
            }

            @Override // X.C4II
            public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                UrlModel urlModel;
                long currentTimeMillis;
                List<DonorStruct> data = getData();
                if (data != null && (viewHolder instanceof C225168sa) && ListProtector.get(data, i) != null) {
                    C225168sa c225168sa = (C225168sa) viewHolder;
                    DonorStruct donorStruct = (DonorStruct) ListProtector.get(data, i);
                    c225168sa.getClass();
                    o.LJIIIZ(donorStruct, "donorStruct");
                    c225168sa.LJLJL.setText(R.string.ex2);
                    c225168sa.LJLJLJ.setText("•");
                    if (donorStruct.isTopDonor) {
                        c225168sa.LJLJJLL.setVisibility(0);
                        c225168sa.LJLJL.setVisibility(0);
                        c225168sa.LJLJLJ.setVisibility(0);
                    } else {
                        c225168sa.LJLJJLL.setVisibility(8);
                        c225168sa.LJLJL.setVisibility(8);
                        c225168sa.LJLJLJ.setVisibility(8);
                    }
                    if (o.LJ(donorStruct.anonymous, Boolean.TRUE)) {
                        c225168sa.LJLJI.setText(C88913eJ.LIZ(c225168sa.itemView, R.string.ex1, "itemView.context.getStri…tion_result_panel_list_5)"));
                        W5F LJ = W5U.LJ(R.drawable.dds);
                        LJ.LIZIZ("Donation");
                        LJ.LJJIIJ = c225168sa.LJLILLLLZI;
                        LJ.LJIIJJI = R.color.al;
                        C16880lQ.LLJJJ(LJ);
                        C16880lQ.LJJJJL(c225168sa.LJLILLLLZI, new View.OnClickListener() { // from class: X.8sc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                            }
                        });
                        C16880lQ.LJIJI(c225168sa.LJLJI, new View.OnClickListener() { // from class: X.8sd
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                            }
                        });
                    } else {
                        ACListenerS38S0200000_3 aCListenerS38S0200000_3 = new ACListenerS38S0200000_3(c225168sa, donorStruct, 84);
                        C16880lQ.LJJJJL(c225168sa.LJLILLLLZI, aCListenerS38S0200000_3);
                        C16880lQ.LJIJI(c225168sa.LJLJI, aCListenerS38S0200000_3);
                        c225168sa.LJLJI.setText(AV1.LJI(donorStruct.user));
                        User user = donorStruct.user;
                        String str = null;
                        if (user != null) {
                            urlModel = user.getAvatarThumb();
                        } else {
                            urlModel = null;
                        }
                        User curUser = AccountService.LJIJ().LJFF().getCurUser();
                        if (curUser.getUid() != null) {
                            String uid = curUser.getUid();
                            User user2 = donorStruct.user;
                            if (user2 != null) {
                                str = user2.getUid();
                            }
                            if (o.LJ(uid, str)) {
                                urlModel = curUser.getAvatarThumb();
                            }
                        }
                        if (c225168sa.LJLILLLLZI != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
                            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                            int[] LIZ = J7H.LIZ(100);
                            o.LJI(LIZ);
                            LJII.LJIILIIL(LIZ);
                            int i2 = C225168sa.LJLJLLL;
                            LJII.LJII = i2;
                            LJII.LJIIIIZZ = i2;
                            LJII.LJJIJIIJIL = true;
                            LJII.LIZIZ("Donation");
                            LJII.LJIIJJI = R.color.al;
                            LJII.LJJIIJ = c225168sa.LJLILLLLZI;
                            C16880lQ.LLJJJ(LJII);
                        }
                    }
                    Context context2 = c225168sa.itemView.getContext();
                    o.LJIIIIZZ(context2, "itemView.context");
                    Long l2 = donorStruct.timestamp;
                    if (l2 != null) {
                        currentTimeMillis = l2.longValue();
                    } else {
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    String LIZJ = C57105Mb7.LIZJ(currentTimeMillis * 1000, context2);
                    o.LJIIIIZZ(LIZJ, "formatCreateTimeDesc(context, time * 1000L)");
                    String LIZIZ = QZP.LIZIZ("(.)", LIZJ, "$1\u2060");
                    String str2 = donorStruct.amount;
                    if (str2 == null) {
                        str2 = "";
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c225168sa.itemView.getContext().getString(R.string.ex0) + ' ' + donorStruct.amount + ' ' + LIZIZ);
                    int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, str2, 0, false, 6);
                    int LJJLIIIJL2 = s.LJJLIIIJL(spannableStringBuilder, LIZIZ, 0, false, 6);
                    final int color = c225168sa.itemView.getContext().getResources().getColor(R.color.ck);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(color) { // from class: com.ss.android.ugc.aweme.donation.detail.DonationVH$bind$3$1
                        @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            o.LJIIIZ(textPaint, "textPaint");
                            super.updateDrawState(textPaint);
                            T5S t5s = new T5S();
                            t5s.LIZ(82);
                            textPaint.setTypeface(t5s.getTypeface());
                        }
                    }, LJJLIIIJL, str2.length() + LJJLIIIJL, 34);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(c225168sa.itemView.getContext().getResources().getColor(R.color.cu)), LJJLIIIJL2, LIZIZ.length() + LJJLIIIJL2, 34);
                    c225168sa.LJLJJI.setText(spannableStringBuilder);
                    String str3 = donorStruct.tiktokAmount;
                    if (str3 == null || str3.length() == 0) {
                        c225168sa.LJLJJL.setText("");
                        return;
                    }
                    TextView textView = c225168sa.LJLJJL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("+ ");
                    LIZ2.append(donorStruct.tiktokAmount);
                    textView.setText(X1D.LIZIZ(LIZ2));
                }
            }

            @Override // X.C4II
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
                Context context2;
                if (viewGroup != null) {
                    context2 = viewGroup.getContext();
                } else {
                    context2 = null;
                }
                View view2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context2), R.layout.and, viewGroup, false);
                o.LJIIIIZZ(view2, "view");
                return new C225168sa(view2, this.LJLIL);
            }
        };
        r4.setLoadMoreListener(this);
        ((RecyclerView) _$_findCachedViewById(R.id.cf3)).setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.cf3)).setAdapter(r4);
        this.LJLLLL = r4;
        C68322mC c68322mC = new C68322mC();
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = -1;
        Integer num = (Integer) this.LJLLILLLL.getValue();
        if (num == null || num.intValue() != 4) {
            Integer num2 = (Integer) this.LJLLILLLL.getValue();
            if (num2 == null || num2.intValue() != 3) {
                Integer num3 = (Integer) this.LJLLILLLL.getValue();
                if (num3 == null || num3.intValue() != 1) {
                    String vl = vl();
                    if (vl == null || vl.length() == 0) {
                        String Al = Al();
                        if (Al == null || Al.length() == 0) {
                            String wl = wl();
                            if (wl != null && wl.length() != 0) {
                                c68322mC.element = wl();
                                c76732zl.element = 4;
                            }
                        } else {
                            c68322mC.element = Al();
                            c76732zl.element = 3;
                        }
                    } else {
                        c68322mC.element = vl();
                        c76732zl.element = 1;
                    }
                } else {
                    c68322mC.element = vl();
                    c76732zl.element = 1;
                }
            } else {
                c68322mC.element = Al();
                c76732zl.element = 3;
            }
        } else {
            c68322mC.element = wl();
            c76732zl.element = 4;
        }
        JSONObject jSONObject = new JSONObject();
        String wl2 = wl();
        if (wl2 == null || wl2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Long l2 = null;
        if (!z) {
            try {
                String wl3 = wl();
                if (wl3 != null) {
                    l = Long.valueOf(CastLongProtector.parseLong(wl3));
                } else {
                    l = null;
                }
                jSONObject.put("effect_id", l);
            } catch (NumberFormatException unused) {
            }
        }
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.ceh), new ViewOnClickListenerC62868Ols(view, this, context, c68322mC, c76732zl, jSONObject));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.aej), new ACListenerS30S0100000_10(this, 42));
        MRI mri = this.LJLIL;
        try {
            String str = (String) c68322mC.element;
            if (str != null) {
                l2 = Long.valueOf(CastLongProtector.parseLong(str));
            }
        } catch (NumberFormatException unused2) {
            l2 = 0L;
        }
        mri.LJJ(new C62869Olt(vl(), (String) this.LJLJLJ.getValue(), (String) this.LJLJLLL.getValue(), Al(), (Integer) this.LJLJL.getValue(), Integer.valueOf(c76732zl.element), jSONObject.toString(), l2));
        mri.LJLILLLLZI = this;
        mri.LJIILL(1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            this.LJLJI = "tiltify";
            Dl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.anc, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
