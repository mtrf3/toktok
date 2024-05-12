package com.ss.android.ugc.aweme.ecommerce.base.address.candinput;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C221108m2;
import X.C27029AjB;
import X.C27162AlK;
import X.C27253Amn;
import X.C27273An7;
import X.C32151Nz;
import X.C47135Ieh;
import X.C62822Ol8;
import X.C70991Rtb;
import X.C71312Rym;
import X.C78946Uyc;
import X.C7MY;
import X.KL2;
import X.O6R;
import Y.IDHandlerS17S0100000_4;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CandHelper {
    public static final int LJIIL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(-5));
    public static final int LJIILIIL = C7MY.LIZIZ(8);
    public final Context LIZ;
    public final EditText LIZIZ;
    public PopupWindow LIZJ;
    public RecyclerView LIZLLL;
    public C27029AjB LJ;
    public boolean LJFF;
    public int LJI;
    public String LJII;
    public String LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public String LJIIJ;
    public final IDHandlerS17S0100000_4 LJIIJJI;

    public final int LIZIZ() {
        int i;
        C27029AjB c27029AjB = this.LJ;
        if (c27029AjB != null) {
            List<CandInputData> list = c27029AjB.LJLIL;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            C27029AjB c27029AjB2 = this.LJ;
            if (c27029AjB2 != null) {
                if (c27029AjB2.LJLJJI) {
                    return i - 1;
                }
                return i;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    /* loaded from: classes4.dex */
    public static final class CustomLinearLayoutMgr extends LinearLayoutManager {
        public CustomLinearLayoutMgr(Context context) {
            o.LJIIIZ(context, "context");
        }

        @Override // X.C0A2
        public final void LLFFF(int i, int i2, Rect childrenBounds) {
            o.LJIIIZ(childrenBounds, "childrenBounds");
            super.LLFFF(i, View.MeasureSpec.makeMeasureSpec(O6R.LJJIIZ(C32151Nz.LJIIZILJ(260)), LiveLayoutPreloadThreadPriority.DEFAULT), childrenBounds);
        }
    }

    public CandHelper(Context context, EditText anchorView) {
        o.LJIIIZ(anchorView, "anchorView");
        this.LIZ = context;
        this.LIZIZ = anchorView;
        this.LJI = 1;
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = C221108m2.LIZIZ(C27273An7.INSTANCE);
        this.LJIIJ = "";
        this.LJIIJJI = new IDHandlerS17S0100000_4(this, C16880lQ.LLJJJJ(), 0);
    }

    public final void LIZ(AddressEditViewModel addressEditViewModel, String str) {
        AddressEditFragment addressEditFragment;
        PopupWindow popupWindow = this.LIZJ;
        if (popupWindow != null) {
            if (popupWindow.isShowing() && str != null && addressEditViewModel != null && (addressEditFragment = AddressEditFragment.LLD) != null) {
                C78946Uyc.LJJII(addressEditFragment, new C70991Rtb(), new AqS58S1100000_4(addressEditViewModel, str, 1));
            }
            PopupWindow popupWindow2 = this.LIZJ;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
                return;
            } else {
                o.LJIJI("mPopupWindow");
                throw null;
            }
        }
        o.LJIJI("mPopupWindow");
        throw null;
    }

    public final void LIZJ(AddressEditViewModel viewModel, String str) {
        int i;
        o.LJIIIZ(viewModel, "viewModel");
        this.LJII = str;
        RecyclerView recyclerView = new RecyclerView(this.LIZ, null);
        this.LIZLLL = recyclerView;
        recyclerView.LJII(new C71312Rym(KL2.LIZJ(this.LIZ, 12.0f), AnonymousClass636.LJIIIIZZ(R.attr.dz, this.LIZ), 2, 0), -1);
        RecyclerView recyclerView2 = this.LIZLLL;
        if (recyclerView2 != null) {
            recyclerView2.setVerticalScrollBarEnabled(false);
            RecyclerView recyclerView3 = this.LIZLLL;
            if (recyclerView3 != null) {
                if (o.LJ(str, "address")) {
                    i = C47135Ieh.LIZ(24, C27162AlK.LIZ);
                } else {
                    i = -2;
                }
                PopupWindow popupWindow = new PopupWindow((View) recyclerView3, i, -2, false);
                this.LIZJ = popupWindow;
                popupWindow.setInputMethodMode(1);
                PopupWindow popupWindow2 = this.LIZJ;
                if (popupWindow2 != null) {
                    popupWindow2.setSoftInputMode(16);
                    C27029AjB c27029AjB = new C27029AjB();
                    this.LJ = c27029AjB;
                    c27029AjB.LJLJJL = new C27253Amn(this, viewModel, str);
                    RecyclerView recyclerView4 = this.LIZLLL;
                    if (recyclerView4 != null) {
                        recyclerView4.setAdapter(c27029AjB);
                        RecyclerView recyclerView5 = this.LIZLLL;
                        if (recyclerView5 != null) {
                            CustomLinearLayoutMgr customLinearLayoutMgr = new CustomLinearLayoutMgr(this.LIZ);
                            customLinearLayoutMgr.LLJJIII(1);
                            recyclerView5.setLayoutManager(customLinearLayoutMgr);
                            PopupWindow popupWindow3 = this.LIZJ;
                            if (popupWindow3 != null) {
                                popupWindow3.setBackgroundDrawable(this.LIZ.getResources().getDrawable(R.drawable.af7));
                                return;
                            } else {
                                o.LJIJI("mPopupWindow");
                                throw null;
                            }
                        }
                        o.LJIJI("mCandListView");
                        throw null;
                    }
                    o.LJIJI("mCandListView");
                    throw null;
                }
                o.LJIJI("mPopupWindow");
                throw null;
            }
            o.LJIJI("mCandListView");
            throw null;
        }
        o.LJIJI("mCandListView");
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r0.enableFocusCandidateInput, java.lang.Boolean.TRUE) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0094, code lost:
    
        r3 = android.os.Message.obtain(r10.LJIIJJI, new X.RunnableC27262Amw(r11, r10, r13, r12, r14));
        r3.what = 1;
        r10.LJIIJJI.removeMessages(1);
        r10.LJIIJJI.sendMessageDelayed(r3, 300);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r0.length() <= 3) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r12.equals("phone") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r0 = r1.items;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r3.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r1 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1.key, r12) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        r0 = r1.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r0.length() != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005b, code lost:
    
        if (r12.equals("alternate_phone") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0064, code lost:
    
        if (r12.equals("email") != false) goto L30;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.widget.EditText r11, java.lang.String r12, com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r13, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "editText"
            r5 = r11
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "viewModel"
            r7 = r13
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r1 = r7.Ov0()
            android.text.Editable r3 = r5.getText()
            r2 = 1
            r6 = r10
            r8 = r12
            if (r8 == 0) goto L20
            int r0 = r8.hashCode()
            switch(r0) {
                case -1147692044: goto L24;
                case 96619420: goto L5e;
                case 106642798: goto L4c;
                case 2127764841: goto L55;
                default: goto L20;
            }
        L20:
            r6.LIZ(r7, r8)
        L23:
            return
        L24:
            java.lang.String r0 = "address"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L2d
            goto L20
        L2d:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r7.LLIIJI
            if (r0 == 0) goto L3c
            java.lang.Boolean r1 = r0.enableFocusCandidateInput
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L3c
            goto L94
        L3c:
            if (r3 == 0) goto L20
            java.lang.CharSequence r0 = ujb.s.LJZI(r3)
            if (r0 == 0) goto L20
            int r1 = r0.length()
            r0 = 3
            if (r1 <= r0) goto L20
            goto L94
        L4c:
            java.lang.String r0 = "phone"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L66
            goto L20
        L55:
            java.lang.String r0 = "alternate_phone"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L66
            goto L20
        L5e:
            java.lang.String r0 = "email"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L20
        L66:
            r4 = 0
            if (r1 == 0) goto L94
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem> r0 = r1.items
            if (r0 == 0) goto L94
            java.util.Iterator r3 = r0.iterator()
        L71:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r0
            java.lang.String r0 = r0.key
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r8)
            if (r0 == 0) goto L71
        L86:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r1
            if (r1 == 0) goto L94
            java.lang.String r0 = r1.value
            if (r0 == 0) goto L94
            int r0 = r0.length()
            if (r0 != 0) goto L20
        L94:
            X.Amw r4 = new X.Amw
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            Y.IDHandlerS17S0100000_4 r0 = r6.LJIIJJI
            android.os.Message r3 = android.os.Message.obtain(r0, r4)
            r3.what = r2
            Y.IDHandlerS17S0100000_4 r0 = r6.LJIIJJI
            r0.removeMessages(r2)
            Y.IDHandlerS17S0100000_4 r2 = r6.LJIIJJI
            r0 = 300(0x12c, double:1.48E-321)
            r2.sendMessageDelayed(r3, r0)
            goto L23
        Lb0:
            r1 = r4
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper.LIZLLL(android.widget.EditText, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, boolean):void");
    }
}
