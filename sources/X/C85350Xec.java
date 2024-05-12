package X;

import Y.ACListenerS35S0100000_15;
import Y.ARunnableS17S0100100_15;
import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem$createAndShowPoiItems$1", f = "PoiPublishExtensionAssem.kt", l = {667}, m = "invokeSuspend")
/* renamed from: X.Xec, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85350Xec extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ PoiSearchApi.PoiSearchResultWrapper LJLJJI;
    public final /* synthetic */ PoiPublishExtensionAssem LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85350Xec(PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, PoiPublishExtensionAssem poiPublishExtensionAssem, InterfaceC67352kd<? super C85350Xec> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = poiSearchResultWrapper;
        this.LJLJJL = poiPublishExtensionAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85350Xec(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<PoiData> list;
        PoiSearchApi.PoiSearchResult poiSearchResult;
        Integer num;
        Integer num2;
        int LIZIZ;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        int i2 = 5;
        if (i != 0) {
            if (i == 1) {
                i2 = this.LJLILLLLZI;
                list = (List) this.LJLIL;
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = this.LJLJJI;
            if (poiSearchResultWrapper == null || (poiSearchResult = poiSearchResultWrapper.poiSearchResult) == null || (list = poiSearchResult.getPoiList()) == null) {
                list = C61878OQg.INSTANCE;
            }
            FRW.LIZIZ(1L, "poi_data_request_result");
            int size = list.size();
            if (C00F.LIZ(31744, 5, "publish_page_poi_show_count", false) > 0) {
                i2 = C00F.LIZ(31744, 5, "publish_page_poi_show_count", false);
            }
            if (size <= i2) {
                i2 = size;
            }
            PoiPublishExtensionAssem poiPublishExtensionAssem = this.LJLJJL;
            poiPublishExtensionAssem.W3(i2, 1, poiPublishExtensionAssem.LJLILLLLZI, null);
            this.LJLJJL.K3().removeAllViews();
            ((ArrayList) this.LJLJJL.LLFF).clear();
            ((ArrayList) this.LJLJJL.LJLL).clear();
            PoiPublishExtensionAssem poiPublishExtensionAssem2 = this.LJLJJL;
            this.LJLIL = list;
            this.LJLILLLLZI = i2;
            this.LJLJI = 1;
            obj2 = poiPublishExtensionAssem2.a4(this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        for (int i3 = 0; i3 < i2; i3++) {
            PoiPublishExtensionAssem poiPublishExtensionAssem3 = this.LJLJJL;
            PoiData poiData = (PoiData) ListProtector.get(list, i3);
            Context context = poiPublishExtensionAssem3.getContext();
            if (context != null) {
                LinearLayout K3 = poiPublishExtensionAssem3.K3();
                View view = poiPublishExtensionAssem3.LJLJJI;
                if (view != null) {
                    Context context2 = view.getContext();
                    o.LJIIIIZZ(context2, "content.context");
                    C71895SJn c71895SJn = new C71895SJn(context2, null, 6);
                    c71895SJn.setAnimationDuration(800L);
                    c71895SJn.setSkeletonWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(88)));
                    c71895SJn.setRadius(C32151Nz.LJIIZILJ(4));
                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                    tuxTextView.setTuxFont(poiPublishExtensionAssem3.O3());
                    if (poiPublishExtensionAssem3.L3().isEnablePutSettingsIntoMoreOption()) {
                        tuxTextView.setTextColorRes(R.attr.gx);
                    } else {
                        tuxTextView.setTextColorRes(R.attr.go);
                    }
                    tuxTextView.setText(poiData.getName());
                    tuxTextView.setGravity(16);
                    tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(7)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(7)), 0);
                    tuxTextView.setTag(poiData);
                    C110614Vt c110614Vt = new C110614Vt();
                    if (poiPublishExtensionAssem3.L3().isEnablePutSettingsIntoMoreOption()) {
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
                        c110614Vt.LIZJ = C61328O5c.LIZJ(4);
                    } else {
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
                        c110614Vt.LJFF = Integer.valueOf(R.attr.e0);
                        c110614Vt.LIZLLL = C1FJ.LIZIZ(1);
                        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
                    }
                    Context context3 = tuxTextView.getContext();
                    o.LJIIIIZZ(context3, "context");
                    tuxTextView.setBackground(c110614Vt.LIZ(context3));
                    tuxTextView.setSingleLine(true);
                    tuxTextView.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(126)));
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    C16880lQ.LJJJJI(tuxTextView, new ViewOnClickListenerC85352Xee(poiPublishExtensionAssem3, booleanValue, c71895SJn));
                    C78897Uxp.LJJJJJL(tuxTextView, C32151Nz.LJIIZILJ(4));
                    ((ArrayList) poiPublishExtensionAssem3.LLFF).add(tuxTextView);
                    c71895SJn.addView(tuxTextView, new ViewGroup.MarginLayoutParams(-2, C7MY.LIZIZ(28)));
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    if (i3 == 0 && !booleanValue) {
                        LIZIZ = C7MY.LIZIZ(16);
                    } else {
                        LIZIZ = C7MY.LIZIZ(8);
                    }
                    marginLayoutParams.setMarginStart(LIZIZ);
                    K3.addView(c71895SJn, marginLayoutParams);
                } else {
                    o.LJIJI("content");
                    throw null;
                }
            }
            ((ArrayList) this.LJLJJL.LJLL).add(Boolean.FALSE);
        }
        PoiPublishExtensionAssem poiPublishExtensionAssem4 = this.LJLJJL;
        if (poiPublishExtensionAssem4.getContext() != null) {
            LinearLayout K32 = poiPublishExtensionAssem4.K3();
            View view2 = poiPublishExtensionAssem4.LJLJJI;
            if (view2 != null) {
                Context context4 = view2.getContext();
                o.LJIIIIZZ(context4, "content.context");
                C71895SJn c71895SJn2 = new C71895SJn(context4, null, 6);
                c71895SJn2.setAnimationDuration(800L);
                c71895SJn2.setSkeletonWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(88)));
                c71895SJn2.setRadius(C32151Nz.LJIIZILJ(4));
                LinearLayout linearLayout = new LinearLayout(c71895SJn2.getContext());
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                C110614Vt c110614Vt2 = new C110614Vt();
                if (poiPublishExtensionAssem4.L3().isEnablePutSettingsIntoMoreOption()) {
                    c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cf);
                    c110614Vt2.LIZJ = C61328O5c.LIZJ(4);
                } else {
                    c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cl);
                    c110614Vt2.LJFF = Integer.valueOf(R.attr.e0);
                    c110614Vt2.LIZLLL = C1FJ.LIZIZ(1);
                    c110614Vt2.LIZJ = C61328O5c.LIZJ(2);
                }
                Context context5 = linearLayout.getContext();
                o.LJIIIIZZ(context5, "context");
                linearLayout.setBackground(c110614Vt2.LIZ(context5));
                linearLayout.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(7)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(7)), 0);
                Context context6 = linearLayout.getContext();
                o.LJIIIIZZ(context6, "context");
                TuxIconView tuxIconView = new TuxIconView(context6, null, 0, 6, null);
                tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                tuxIconView.setIconRes(R.raw.icon_magnifying_glass);
                if (poiPublishExtensionAssem4.L3().isEnablePutSettingsIntoMoreOption()) {
                    tuxIconView.setTintColorRes(R.attr.gx);
                } else {
                    tuxIconView.setTintColorRes(R.attr.go);
                }
                linearLayout.addView(tuxIconView, new ViewGroup.LayoutParams(C7MY.LIZIZ(12), C7MY.LIZIZ(12)));
                Context context7 = linearLayout.getContext();
                o.LJIIIIZZ(context7, "context");
                TuxTextView tuxTextView2 = new TuxTextView(context7, null, 6, 0);
                tuxTextView2.setTuxFont(poiPublishExtensionAssem4.O3());
                if (poiPublishExtensionAssem4.L3().isEnablePutSettingsIntoMoreOption()) {
                    tuxTextView2.setTextColorRes(R.attr.gx);
                } else {
                    tuxTextView2.setTextColorRes(R.attr.go);
                }
                tuxTextView2.setText(tuxTextView2.getContext().getString(R.string.e58));
                tuxTextView2.setSingleLine(true);
                tuxTextView2.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(103)));
                tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                linearLayout.addView(tuxTextView2, marginLayoutParams2);
                C16880lQ.LJIIZILJ(linearLayout, new ACListenerS35S0100000_15(poiPublishExtensionAssem4, 179));
                C78897Uxp.LJJJJJL(linearLayout, C32151Nz.LJIIZILJ(4));
                c71895SJn2.addView(linearLayout, new ViewGroup.LayoutParams(-2, C7MY.LIZIZ(28)));
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams3.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                marginLayoutParams3.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                K32.addView(c71895SJn2, marginLayoutParams3);
            } else {
                o.LJIJI("content");
                throw null;
            }
        }
        PoiPublishExtensionAssem poiPublishExtensionAssem5 = this.LJLJJL;
        if (poiPublishExtensionAssem5.LLFZ && !poiPublishExtensionAssem5.LJLJJLL) {
            this.LJLJJL.K3().post(new ARunnableS17S0100100_15(System.currentTimeMillis(), this.LJLJJL, 0));
        }
        Integer num3 = this.LJLJJL.LLF;
        if ((num3 == null || num3.intValue() != 1) && (((num = this.LJLJJL.LLF) == null || num.intValue() != 2) && ((num2 = this.LJLJJL.LLF) == null || num2.intValue() != 6))) {
            Integer num4 = this.LJLJJL.LLF;
            if (num4 == null || num4.intValue() != 5) {
                PoiPublishExtensionAssem poiPublishExtensionAssem6 = this.LJLJJL;
                poiPublishExtensionAssem6.b4(1, true, new AqS165S0100000_15(poiPublishExtensionAssem6, 766));
            } else {
                PoiPublishExtensionAssem.c4(this.LJLJJL, 6, null, 6);
            }
            View view3 = this.LJLJJL.LJLJJI;
            if (view3 != null) {
                if (C90193gN.LIZIZ(view3.getContext())) {
                    this.LJLJJL.H3().post(new ARunnableS51S0100000_15(this.LJLJJL, 80));
                }
                this.LJLJJL.H3().getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserverOnScrollChangedListenerC85394XfK(this.LJLJJL));
            } else {
                o.LJIJI("content");
                throw null;
            }
        }
        int size2 = list.size();
        if (size2 > 5) {
            size2 = 5;
        }
        String creationId = this.LJLJJL.F3().LJLILLLLZI.getMobParam().getCreationId();
        String str = "";
        if (creationId == null) {
            creationId = "";
        }
        String contentType = this.LJLJJL.F3().LJLIL.getContentType();
        String shootWay = this.LJLJJL.F3().LJLILLLLZI.getMobParam().getShootWay();
        if (shootWay != null) {
            str = shootWay;
        }
        View view4 = this.LJLJJL.LJLJJI;
        if (view4 != null) {
            C225248si.LJJI(size2, C45243HpH.LIZJ(view4, "content.context") ? 1 : 0, !this.LJLJJL.LJLJI ? 1 : 0, creationId, contentType, str);
            return C76800UCe.LIZ;
        }
        o.LJIJI("content");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
