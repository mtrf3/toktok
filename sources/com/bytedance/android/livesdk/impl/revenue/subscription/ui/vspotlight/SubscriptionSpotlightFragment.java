package com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.AnonymousClass175;
import X.AnonymousClass176;
import X.B83;
import X.BZI;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C23010vJ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29S;
import X.C2A7;
import X.C31847Ceh;
import X.C38393F4z;
import X.C39471gl;
import X.C39481gm;
import X.C39491gn;
import X.C39501go;
import X.C3C5;
import X.C47071t1;
import X.C47121t6;
import X.C47261Igj;
import X.C51029K0z;
import X.C58314Muc;
import X.C76800UCe;
import X.C76874UFa;
import X.C76876UFc;
import X.C76878UFe;
import X.C76882UFi;
import X.C78555UsJ;
import X.C78924UyG;
import X.C84654XKg;
import X.C90903hW;
import X.C93833mF;
import X.C9KF;
import X.CN1;
import X.DialogC25756A8y;
import X.E2C;
import X.EnumC76880UFg;
import X.InterfaceC65784Pro;
import X.InterfaceC73984T1w;
import X.OSZ;
import X.Q7L;
import X.UFO;
import X.UFP;
import X.UFQ;
import X.UFS;
import X.UFU;
import X.UG0;
import X.X1D;
import X.XKQ;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS33S0100000_13;
import Y.AfS53S0100000_1;
import Y.AfS57S0100000_5;
import Y.IDcS172S0100000_13;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.g;
import com.google.gson.m;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS80S1100000_13;
import kotlin.jvm.internal.IDqS39S0300000_13;
import kotlin.jvm.internal.o;
import ujb.s;
import webcast.api.sub.SpotlightUpdateItem;

/* loaded from: classes14.dex */
public final class SubscriptionSpotlightFragment extends BaseFragment implements InterfaceC73984T1w {
    public boolean LJLJJLL;
    public DialogC25756A8y LJLJL;
    public final IHostSubscription.Params LJLJLLL;
    public String LJLL;
    public XKQ LJLLI;
    public UFQ LJLLILLLL;
    public XKQ LJLLJ;
    public final List<Integer> LJLLL;
    public final List<Integer> LJLLLL;
    public boolean LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public String LJLIL = "";
    public final int LJLILLLLZI = 123;
    public final int LJLJI = 124;
    public InterfaceC65784Pro<C76800UCe> LJLJJI = C76874UFa.LJLIL;
    public final List<C76876UFc> LJLJJL = new ArrayList();
    public boolean LJLJLJ = true;

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

    public SubscriptionSpotlightFragment() {
        IHostSubscription.Params params = new IHostSubscription.Params();
        params.min_width = 255;
        params.min_height = 255;
        params.max_width = 4096;
        params.max_height = 4096;
        params.max_size = 20480000;
        params.max_count = 10;
        params.emotesShowStyle = 0;
        params.logInfo = E2C.LIZJ("show_entrance", this.LJLIL);
        this.LJLJLLL = params;
        this.LJLL = "";
        this.LJLLL = C47261Igj.LJJIJIIJI(Integer.valueOf(R.id.era), Integer.valueOf(R.id.kri));
        this.LJLLLL = C47261Igj.LJJIJIIJI(Integer.valueOf(R.id.krb), Integer.valueOf(R.id.kre), Integer.valueOf(R.id.kr6), Integer.valueOf(R.id.kr9), Integer.valueOf(R.id.krg));
    }

    public final void Il() {
        boolean z;
        String str;
        if (this.LJLJLJ) {
            return;
        }
        List<C76876UFc> list = xl().LJLILLLLZI;
        if (list.isEmpty()) {
            View view = getView();
            if (view != null && !this.LJLLLLLL) {
                Iterator<Integer> it = this.LJLLLL.iterator();
                while (it.hasNext()) {
                    view.findViewById(it.next().intValue()).setVisibility(8);
                }
                Iterator<Integer> it2 = this.LJLLL.iterator();
                while (it2.hasNext()) {
                    view.findViewById(it2.next().intValue()).setVisibility(0);
                }
            }
        } else {
            View view2 = getView();
            if (view2 != null) {
                Iterator<Integer> it3 = this.LJLLL.iterator();
                while (it3.hasNext()) {
                    view2.findViewById(it3.next().intValue()).setVisibility(8);
                }
                Iterator<Integer> it4 = this.LJLLLL.iterator();
                while (it4.hasNext()) {
                    view2.findViewById(it4.next().intValue()).setVisibility(0);
                }
            }
        }
        this.LJLLLLLL = true;
        View findViewById = _$_findCachedViewById(R.id.kra).findViewById(R.id.gwr);
        o.LJIIIIZZ(findViewById, "subscription_spotlight_n…nearLayout>(R.id.nav_end)");
        TuxIconView tuxIconView = (TuxIconView) C78924UyG.LIZJ((ViewGroup) findViewById);
        if (!list.isEmpty()) {
            Iterator<C76876UFc> it5 = list.iterator();
            while (it5.hasNext()) {
                Integer num = it5.next().LIZIZ;
                if (num == null || num.intValue() != 3) {
                    tuxIconView.setEnabled(true);
                    tuxIconView.setTintColorRes(R.attr.bns);
                    break;
                }
            }
        }
        tuxIconView.setEnabled(false);
        tuxIconView.setTintColorRes(R.attr.bnt);
        if (!list.isEmpty()) {
            Iterator<C76876UFc> it6 = list.iterator();
            while (it6.hasNext()) {
                Integer num2 = it6.next().LIZIZ;
                if (num2 != null && num2.intValue() == 3) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            ((TextView) _$_findCachedViewById(R.id.kr9)).setText(R.string.oao);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) getString(R.string.oa_));
            spannableStringBuilder.append((CharSequence) " ");
            String string = getString(R.string.oac);
            o.LJIIIIZZ(string, "getString(R.string.pm_su…tSettings_emptyStateLink)");
            spannableStringBuilder.append((CharSequence) string);
            C23010vJ.LJFF(spannableStringBuilder, spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33, 700);
            ((C47121t6) _$_findCachedViewById(R.id.kr9)).setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        }
        Iterator<C76876UFc> it7 = list.iterator();
        int i = 0;
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            Integer num3 = it7.next().LIZIZ;
            if (num3 == null || num3.intValue() != 3) {
                i++;
            } else if (i != -1) {
                str = "not_approved";
            }
        }
        str = "others";
        this.LJLL = str;
    }

    @Override // X.InterfaceC73984T1w
    public final boolean onBackPressed() {
        if (this.LJLJJLL) {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            String string = getString(R.string.oak);
            o.LJIIIIZZ(string, "getString(R.string.pm_su…tings_goBackModal_title2)");
            String string2 = getString(R.string.oae);
            String string3 = getString(R.string.oai);
            o.LJIIIIZZ(string3, "getString(R.string.pm_su…ings_goBackModal_saveBtn)");
            AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(this, 230);
            String string4 = getString(R.string.oag);
            o.LJIIIIZZ(string4, "getString(R.string.pm_su…s_goBackModal_discardBtn)");
            AqS163S0100000_13 aqS163S0100000_132 = new AqS163S0100000_13(this, 231);
            C47071t1 c47071t1 = new C47071t1(requireContext);
            c47071t1.LIZJ = string;
            if (string2 != null) {
                c47071t1.LJII(string2);
            }
            AnonymousClass175 anonymousClass175 = new AnonymousClass175();
            C39471gl c39471gl = new C39471gl();
            c39471gl.LIZ = string3;
            c39471gl.LIZJ = new IDcS172S0100000_13(aqS163S0100000_13, 34);
            anonymousClass175.LIZ(new C39481gm(c39471gl));
            C39491gn c39491gn = new C39491gn();
            c39491gn.LIZ = string4;
            c39491gn.LIZJ = new IDcS172S0100000_13(aqS163S0100000_132, 35);
            anonymousClass175.LIZ(new C39501go(c39491gn));
            anonymousClass175.LIZIZ = 2;
            c47071t1.LIZJ(new AnonymousClass176(anonymousClass175));
            c47071t1.LJIILL = false;
            c47071t1.LJIILJJIL = false;
            C31847Ceh.LIZ(c47071t1.LIZ());
            return true;
        }
        this.LJLJJI.invoke();
        return false;
    }

    public final DialogC25756A8y wl() {
        DialogC25756A8y dialogC25756A8y = this.LJLJL;
        if (dialogC25756A8y != null) {
            return dialogC25756A8y;
        }
        o.LJIJI("loadingDialogHUD");
        throw null;
    }

    public final UFQ xl() {
        UFQ ufq = this.LJLLILLLL;
        if (ufq != null) {
            return ufq;
        }
        o.LJIJI("spotlightImageAdapter");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Il();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:10:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Al(X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.UFW
            if (r0 == 0) goto L5a
            r7 = r11
            X.UFW r7 = (X.UFW) r7
            int r2 = r7.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r7.LJLJJLL = r2
        L12:
            java.lang.Object r1 = r7.LJLJJI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJLL
            r6 = 1
            if (r0 == 0) goto L4e
            if (r0 != r6) goto L63
            int r9 = r7.LJLJI
            int r0 = r7.LJLILLLLZI
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment r5 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L26:
            int r9 = r9 + 1
        L28:
            if (r9 >= r0) goto L60
        L2b:
            kotlin.jvm.internal.AqS179S0100000_13 r2 = new kotlin.jvm.internal.AqS179S0100000_13
            r1 = 329(0x149, float:4.61E-43)
            r2.<init>(r5, r1)
            X.C31847Ceh.LIZJ(r2)
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightLoopInterval r1 = com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightLoopInterval.INSTANCE
            int r1 = r1.getLoopInterval()
            long r3 = (long) r1
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            r7.LJLIL = r5
            r7.LJLILLLLZI = r0
            r7.LJLJI = r9
            r7.LJLJJLL = r6
            java.lang.Object r1 = X.C1JD.LIZJ(r3, r7)
            if (r1 != r8) goto L26
            return r8
        L4e:
            X.C141335gf.LIZJ(r1)
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightLoopTimes r0 = com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight.SpotlightLoopTimes.INSTANCE
            int r0 = r0.getLoopTimes()
            r9 = 0
            r5 = r10
            goto L28
        L5a:
            X.UFW r7 = new X.UFW
            r7.<init>(r10, r11)
            goto L12
        L60:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment.Al(X.2kd):java.lang.Object");
    }

    public final void Dl(int i) {
        if (i == 0) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_upload_click");
        Gl(LIZ);
        LIZ.LJIJJ(this.LJLIL, "show_entrance");
        LIZ.LJIJJ(Integer.valueOf(xl().LJLILLLLZI.size()), "picture_quantity");
        LIZ.LJJIIJZLJL();
        IHostSubscription iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
        int i2 = this.LJLILLLLZI;
        int i3 = this.LJLJI;
        C76878UFe.Companion.getClass();
        iHostSubscription.gx(this, i2, i3, i, 0, C76878UFe.DEFAULT, E2C.LIZJ("show_entrance", this.LJLIL));
    }

    public final void Gl(BZI bzi) {
        bzi.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
    }

    public final void Hl(boolean z) {
        _$_findCachedViewById(R.id.kre).setEnabled(z);
        this.LJLJJLL = z;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public static Object Jl(List list, UFU ufu) {
        g gVar = new g();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SpotlightUpdateItem spotlightUpdateItem = (SpotlightUpdateItem) it.next();
            m mVar = new m();
            mVar.LJJIIZ("uri", spotlightUpdateItem.uri);
            long j = spotlightUpdateItem.id;
            if (j > 0) {
                mVar.LJJIIJ("id", new Long(j));
            }
            boolean z = spotlightUpdateItem.isPinned;
            if (z) {
                mVar.LJJIII(Boolean.valueOf(z), "is_pinned");
            }
            gVar.LJJII(mVar);
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(ufu));
        ((SubscribeApi) Q7L.LIZIZ(SubscribeApi.class)).updateSpotlight(C51029K0z.LJJIIZI(new OSZ("spotlight_info", gVar))).LJJJLIIL(new AfS57S0100000_5(c84654XKg, 322), new AfS53S0100000_1(c84654XKg, 88));
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        FragmentManager supportFragmentManager;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("enter_from")) != null) {
            this.LJLIL = string;
        }
        Hl(false);
        Context context = getContext();
        if (context != null && (mo49getActivity = mo49getActivity()) != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            this.LJLLILLLL = new UFQ(context, this.LJLJJL, new IDqS39S0300000_13(this, context, supportFragmentManager, 1));
            ((RecyclerView) _$_findCachedViewById(R.id.krb)).setLayoutManager(new GridLayoutManager(2));
            ((RecyclerView) _$_findCachedViewById(R.id.krb)).setAdapter(xl());
        }
        Context context2 = getContext();
        if (context2 != null) {
            C29374Bfu c29374Bfu = (C29374Bfu) B83.LIZ().LIZIZ();
            String LIZJ = c29374Bfu.LIZJ(c29374Bfu.getCurrentUserId());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) getString(R.string.oa_));
            spannableStringBuilder.append((CharSequence) " ");
            String string2 = getString(R.string.oac);
            o.LJIIIIZZ(string2, "getString(R.string.pm_su…tSettings_emptyStateLink)");
            spannableStringBuilder.append((CharSequence) string2);
            C23010vJ.LJFF(spannableStringBuilder, spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length(), 33, 700);
            ((C47121t6) _$_findCachedViewById(R.id.kr8)).setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            Iterator it = C47261Igj.LJJIJIIJI(_$_findCachedViewById(R.id.kr8), _$_findCachedViewById(R.id.kr9)).iterator();
            while (it.hasNext()) {
                C16880lQ.LJJIIZ((C47121t6) it.next(), new UFO(this, context2, LIZJ));
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String string3 = getString(R.string.oa8);
            o.LJIIIIZZ(string3, "getString(R.string.pm_su…lightSettings_disclaimer)");
            String string4 = getString(R.string.oa9);
            o.LJIIIIZZ(string4, "getString(R.string.pm_su…gs_disclaimer_termAnchor)");
            int LJJLIIIJL = s.LJJLIIIJL(string3, "%s", 0, false, 6);
            String LLLZ = C16880lQ.LLLZ(string3, Arrays.copyOf(new Object[]{string4}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            spannableStringBuilder2.append((CharSequence) LLLZ);
            C23010vJ.LJFF(spannableStringBuilder2, LJJLIIIJL, string4.length() + LJJLIIIJL, 33, 700);
            ((C47121t6) _$_findCachedViewById(R.id.kr6)).setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) getString(R.string.oaq));
            spannableStringBuilder3.append((CharSequence) " ");
            String string5 = getString(R.string.oac);
            o.LJIIIIZZ(string5, "getString(R.string.pm_su…tSettings_emptyStateLink)");
            spannableStringBuilder3.append((CharSequence) string5);
            C23010vJ.LJFF(spannableStringBuilder3, spannableStringBuilder3.length() - string5.length(), spannableStringBuilder3.length(), 33, 700);
            ((C47121t6) _$_findCachedViewById(R.id.kr9)).setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
            ((ImageView) _$_findCachedViewById(R.id.erb)).setImageDrawable(C15380j0.LJI(R.drawable.bb2));
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.kri), new ACListenerS33S0100000_13(this, 175));
            C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.kr6), new ACListenerS25S0100000_5(context2, 396));
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.kre), new ACListenerS33S0100000_13(this, 176));
        }
        if (getContext() != null) {
            C29374Bfu c29374Bfu2 = (C29374Bfu) B83.LIZ().LIZIZ();
            String LIZJ2 = c29374Bfu2.LIZJ(c29374Bfu2.getCurrentUserId());
            C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.kra);
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ3 = s1.LIZJ();
            LIZJ3.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            LIZJ3.LIZLLL = true;
            LIZJ3.LIZIZ(new AqS163S0100000_13(this, 475));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ3});
            String string6 = getString(R.string.oa3);
            o.LJIIIIZZ(string6, "getString(R.string.pm_su…_spotlightSettings_Title)");
            LIZLLL.LIZJ = string6;
            c235119Kp.LIZJ = LIZLLL;
            C234529Ii LIZJ4 = s1.LIZJ();
            LIZJ4.LIZJ = R.raw.icon_eye;
            LIZJ4.LIZLLL = true;
            LIZJ4.LIZIZ(new AqS80S1100000_13(LIZJ2, this, 9));
            c235119Kp.LIZIZ(LIZJ4);
            c252709vu.setNavActions(c235119Kp);
        }
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        this.LJLJL = new DialogC25756A8y(requireContext);
        wl().LIZ(true);
        C29306Beo.LJJIIJZLJL(this, null, new UFS(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        if (r0 == r8) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d1 -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vl(X.InterfaceC70422pa r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.UFV
            if (r0 == 0) goto Ld7
            r7 = r13
            X.UFV r7 = (X.UFV) r7
            int r2 = r7.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld7
            int r2 = r2 - r1
            r7.LJLJL = r2
        L12:
            java.lang.Object r0 = r7.LJLJJL
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r7.LJLJL
            r6 = 0
            r5 = 1
            if (r1 == 0) goto L9b
            if (r1 != r5) goto Lde
            X.UFc r9 = r7.LJLJJI
            java.lang.Object r10 = r7.LJLJI
            java.util.Iterator r10 = (java.util.Iterator) r10
            X.2pa r12 = r7.LJLILLLLZI
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment r4 = r7.LJLIL
            X.C141335gf.LIZJ(r0)
        L2b:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r9.LIZIZ(r0)
            X.UFQ r0 = r4.xl()
            r0.LJLZ()
        L37:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r9 = r10.next()
            X.UFc r9 = (X.C76876UFc) r9
            java.lang.String r0 = r9.LIZLLL
            r7.LJLIL = r4
            r7.LJLILLLLZI = r12
            r7.LJLJI = r10
            r7.LJLJJI = r9
            r7.LJLJL = r5
            if (r0 != 0) goto L55
        L51:
            r0 = r6
        L52:
            if (r0 != r8) goto L2b
            return r8
        L55:
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r0 = "parse(url)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "imageUri.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L6f
            goto L51
        L6f:
            X.W5P r0 = X.W5P.LIZLLL(r2)
            X.W5O r1 = r0.LIZ()
            X.W6J r0 = X.W5I.LIZ()
            X.W4W r3 = r0.LJ(r1, r6)
            X.XKg r2 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r7)
            r2.<init>(r0)
            X.CaQ r1 = new X.CaQ
            r1.<init>(r2)
            X.FT1 r0 = X.FT1.LIZ()
            X.Iyq r3 = (X.AbstractC48384Iyq) r3
            r3.LJ(r1, r0)
            java.lang.Object r0 = r2.LIZ()
            goto L52
        L9b:
            X.C141335gf.LIZJ(r0)
            r4 = r11
        L9f:
            X.UFQ r0 = r4.xl()
            java.util.List<X.UFc> r0 = r0.LJLILLLLZI
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        Lae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.UFc r0 = (X.C76876UFc) r0
            android.graphics.Bitmap r0 = r0.LIZ()
            if (r0 != 0) goto Lae
            r3.add(r1)
            goto Lae
        Lc5:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Ld1
            X.C48841JEv.LIZJ(r12, r6)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Ld1:
            java.util.Iterator r10 = r3.iterator()
            goto L37
        Ld7:
            X.UFV r7 = new X.UFV
            r7.<init>(r11, r13)
            goto L12
        Lde:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment.vl(X.2pa, X.2kd):java.lang.Object");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ActivityC45651qj mo49getActivity;
        Bitmap decodeBitmap;
        if (intent != null && i2 == this.LJLJI && i == this.LJLILLLLZI) {
            IHostSubscription.Result QL = ((IHostSubscription) CN1.LIZ(IHostSubscription.class)).QL(this, intent, this.LJLJLLL);
            if (getView() == null || getContext() == null || (mo49getActivity = mo49getActivity()) == null) {
                return;
            }
            IHostSubscription.Result.PhotoFile[] photoFileArr = QL.originFiles;
            if (photoFileArr == null || photoFileArr.length == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(photoFileArr.length);
            for (IHostSubscription.Result.PhotoFile photoFile : photoFileArr) {
                String str = photoFile.path;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                Context context = getContext();
                if (context == null) {
                    decodeBitmap = null;
                } else {
                    String jVar = C38393F4z.LJ(str).LJJIJ("uri").toString();
                    o.LJIIIIZZ(jVar, "jsonObj[\"uri\"].toString()");
                    if (jVar.length() > 2) {
                        jVar = C58314Muc.LIZIZ(jVar, 1, 1, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    IHostSubscription iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("content://media");
                    LIZ.append(jVar);
                    String V00 = iHostSubscription.V00(context, UriProtector.parse(X1D.LIZIZ(LIZ)));
                    if (V00 != null) {
                        str2 = V00;
                    }
                    decodeBitmap = BitmapUtils.decodeBitmap(new File(str2));
                }
                arrayList.add(decodeBitmap);
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_next_click");
            Gl(LIZ2);
            LIZ2.LJIJJ(this.LJLIL, "show_entrance");
            LIZ2.LJIJJ(Integer.valueOf(arrayList.size()), "picture_quantity");
            LIZ2.LJJIIJZLJL();
            BZI LIZ3 = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_edit_page_show");
            Gl(LIZ3);
            LIZ3.LJIJJ(this.LJLIL, "show_entrance");
            LIZ3.LJIJJ("highlight_manage", "click_position");
            LIZ3.LJIJJ(Integer.valueOf(arrayList.size()), "picture_quantity");
            LIZ3.LJJIIJZLJL();
            IHostSubscription iHostSubscription2 = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
            FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            String str3 = this.LJLIL;
            EnumC76880UFg enumC76880UFg = EnumC76880UFg.NO_CHANGE;
            UG0 ug0 = UG0.BITMAP;
            C93833mF LJJJLIIL = C113554cx.LJJJLIIL();
            C76878UFe.Companion.getClass();
            iHostSubscription2.Ed(new C76882UFi(supportFragmentManager, str3, enumC76880UFg, ug0, LJJJLIIL, C76878UFe.DEFAULT, arrayList, new UFP(this)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d5i, viewGroup, false);
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
