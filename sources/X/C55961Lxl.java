package X;

import Y.IDDListenerS148S0100000_9;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.cell.ToolEntryCell;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallHamburgerAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lxl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55961Lxl extends TAT {
    public final /* synthetic */ java.util.Map LJLJJI;
    public final /* synthetic */ MallHamburgerAssem LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns LJLJJLL;

    @Override // X.TAT
    public final void LIZ(View view) {
        Context context;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        TuxSheet tuxSheet;
        int i;
        if (view != null) {
            java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJLJJI);
            LJJLIL.put("button_name", "more");
            String str = "";
            if (((TuxAlertBadgeLayout) this.LJLJJL._$_findCachedViewById(R.id.e29)).LJLJL) {
                LJJLIL.put("notice_type", "red_dot");
                LJJLIL.put("notice_number", "");
            }
            InterfaceC88472Yns interfaceC88472Yns = this.LJLJJLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(LJJLIL);
            }
            this.LJLJJL.LJLLLLLL = System.currentTimeMillis();
            MallHamburgerAssem mallHamburgerAssem = this.LJLJJL;
            if (mallHamburgerAssem.LJLLI == null) {
                if (mallHamburgerAssem.getContext() != null) {
                    mallHamburgerAssem.LJLLI = C16880lQ.LLLLIILL(C16880lQ.LLZIL(mallHamburgerAssem.getContext()), R.layout.aof, null, false);
                }
                View view2 = mallHamburgerAssem.LJLLI;
                if (view2 != null) {
                    ((SYL) view2.findViewById(R.id.ftw)).LLLF.LJZL(ToolEntryCell.class);
                    if (mallHamburgerAssem.getContext() == null) {
                        view2.getContext();
                    }
                    ((RecyclerView) view2.findViewById(R.id.ftw)).setLayoutManager(new GridLayoutManager(4, 1, false));
                    ((SYL) view2.findViewById(R.id.ftw)).setLifecycleOwner(mallHamburgerAssem);
                    Context context2 = mallHamburgerAssem.getContext();
                    if (context2 != null && C32151Nz.LJJII(context2) <= 320) {
                        i = 64;
                    } else {
                        i = 74;
                    }
                    final int LIZIZ = C7MY.LIZIZ(i);
                    RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.ftw);
                    final int LIZIZ2 = C7MY.LIZIZ(16);
                    final int LIZIZ3 = C7MY.LIZIZ(16);
                    recyclerView.LJII(new AbstractC030309z(LIZIZ2, LIZIZ3, LIZIZ) { // from class: X.4KR
                        public final int LJLIL;
                        public final int LJLILLLLZI;
                        public final int LJLJI;

                        {
                            this.LJLIL = LIZIZ2;
                            this.LJLILLLLZI = LIZIZ3;
                            this.LJLJI = LIZIZ;
                        }

                        @Override // X.AbstractC030309z
                        public final void LJ(Rect outRect, View view3, RecyclerView parent, C0AC state) {
                            int i2;
                            int LIZIZ4;
                            int LJJJJJ;
                            o.LJIIIZ(outRect, "outRect");
                            o.LJIIIZ(view3, "view");
                            o.LJIIIZ(parent, "parent");
                            o.LJIIIZ(state, "state");
                            C0A2 layoutManager = parent.getLayoutManager();
                            if ((layoutManager instanceof GridLayoutManager) && (LIZIZ4 = state.LIZIZ()) > (i2 = ((GridLayoutManager) layoutManager).LLIIIL) && (LJJJJJ = RecyclerView.LJJJJJ(view3)) < LIZIZ4 && LJJJJJ >= 0) {
                                if (LIZIZ4 % i2 != 0) {
                                    LIZIZ4 += i2;
                                }
                                if (LJJJJJ / i2 != (LIZIZ4 / i2) - 1) {
                                    outRect.bottom = this.LJLIL;
                                }
                            }
                            C0A2 layoutManager2 = parent.getLayoutManager();
                            if (layoutManager2 instanceof GridLayoutManager) {
                                int i3 = ((GridLayoutManager) layoutManager2).LLIIIL;
                                RecyclerView.LJJJJJ(view3);
                                Context context3 = view3.getContext();
                                o.LJIIIIZZ(context3, "view.context");
                                int LJJII = ((C32151Nz.LJJII(context3) - (this.LJLILLLLZI * 2)) - (this.LJLJI * i3)) / i3;
                                if (view3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                    int i4 = (LJJII / 2) + 1;
                                    marginLayoutParams.setMarginStart(i4);
                                    marginLayoutParams.setMarginEnd(i4);
                                }
                            }
                        }
                    }, -1);
                    mallHamburgerAssem.withState((AssemViewModel) mallHamburgerAssem.LJLJLLL.getValue(), new AqS175S0100000_9(view2, 509));
                    AssemViewModel.asyncSubscribe$default((AssemViewModel) mallHamburgerAssem.LJLJLLL.getValue(), new TBT() { // from class: X.Lxr
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C55978Ly2) obj).LJLL;
                        }
                    }, null, null, null, new AqS175S0100000_9(view2, 510), 14, null);
                }
            }
            View view3 = mallHamburgerAssem.LJLLI;
            if (view3 != null) {
                mallHamburgerAssem.LJLLILLLL = SystemClock.elapsedRealtime();
                ASL asl = new ASL();
                asl.LIZ.LJLLI = view3;
                asl.LJI(1);
                TuxSheet tuxSheet2 = asl.LIZ;
                tuxSheet2.LJZL = true;
                tuxSheet2.LJLILLLLZI = new IDDListenerS148S0100000_9(mallHamburgerAssem, 4);
                mallHamburgerAssem.LJLLL = tuxSheet2;
                Fragment LIZLLL = C212428Vi.LIZLLL(mallHamburgerAssem);
                if (LIZLLL != null && (context = LIZLLL.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null && (tuxSheet = mallHamburgerAssem.LJLLL) != null) {
                    tuxSheet.show(supportFragmentManager, "mall_main_tools_sheet");
                }
                long currentTimeMillis = System.currentTimeMillis() - mallHamburgerAssem.LJLLLLLL;
                C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
                int i2 = !((C56020Lyi) mallHamburgerAssem.LJLL.getValue()).LJLLL ? 1 : 0;
                c56045Lz7.getClass();
                C76542zS.LIZJ("rd_new_user_tool_panel_open_result", new C51525KKb(i2, currentTimeMillis));
                mallHamburgerAssem.LJLLLLLL = -1L;
                mallHamburgerAssem.withState((AssemViewModel) mallHamburgerAssem.LJLJLLL.getValue(), C55955Lxf.LJLIL);
                FashionMallFragment.LJZ.getClass();
                String str2 = FashionMallFragment.LJZI;
                if (str2 != null) {
                    str = str2;
                }
                C76542zS.LIZJ("tiktokec_enter_actionsheet", new AqS174S0100000_8(E2C.LIZJ("previous_page", str), (java.util.Map<String, String>) 201));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55961Lxl(java.util.Map map, MallHamburgerAssem mallHamburgerAssem, InterfaceC88472Yns interfaceC88472Yns) {
        super(700L);
        this.LJLJJI = map;
        this.LJLJJL = mallHamburgerAssem;
        this.LJLJJLL = interfaceC88472Yns;
    }
}
