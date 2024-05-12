package X;

import Y.ACListenerS20S0201000_2;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.68j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1554968j extends FrameLayout {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final HashSet<TextFontStyleData> LJLIL;
    public InterfaceC1555668q LJLILLLLZI;
    public final List<C1554868i> LJLJI;
    public String LJLJJI;
    public C1555268m LJLJJL;
    public LinearLayout LJLJJLL;
    public int LJLJL;
    public String LJLJLJ;

    public final void LIZJ() {
        String LJI;
        String str = this.LJLJLJ;
        if (str != null && !str.isEmpty()) {
            LJI = this.LJLJLJ;
        } else {
            LJI = C68M.LJIIJ().LJI(this.LJLJL);
        }
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            C1554868i c1554868i = (C1554868i) it.next();
            if (!TextUtils.isEmpty(LJI) && LJI.equals(c1554868i.getTag())) {
                TextFontStyleData textFontStyleData = c1554868i.LJLJJL;
                if (textFontStyleData != null && textFontStyleData.LIZJ()) {
                    c1554868i.setBackground(1);
                    c1554868i.LIZIZ();
                    this.LJLJJL.LIZ(c1554868i);
                }
            } else {
                c1554868i.setBackground(0);
            }
        }
    }

    public final void LIZIZ(List<TextFontStyleData> list) {
        TextFontStyleData textFontStyleData;
        TextFontStyleData textFontStyleData2;
        if (!this.LJLIL.isEmpty() && this.LJLIL.size() == list.size()) {
            return;
        }
        if (C77413UZt.LJIILL(list)) {
            C68M.LJIIJ().LJIJ(getContext());
            return;
        }
        ((ArrayList) this.LJLJI).clear();
        this.LJLJJLL.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            Object obj = ListProtector.get(list, i);
            if (obj != null && !this.LJLIL.contains(obj)) {
                TextFontStyleData textFontStyleData3 = (TextFontStyleData) ListProtector.get(list, i);
                C1554868i c1554868i = new C1554868i(getContext());
                c1554868i.LIZJ(textFontStyleData3);
                c1554868i.setBackground(0);
                if ("default".equals(C68M.LJIIJ().LJI(this.LJLJL))) {
                    if (i == 0 && textFontStyleData3 != null && (textFontStyleData2 = c1554868i.LJLJJL) != null && textFontStyleData2.LIZJ()) {
                        C68M.LJIIJ().LJIJJLI(this.LJLJL, textFontStyleData3.fileName);
                        c1554868i.setBackground(1);
                    }
                } else {
                    String LJI = C68M.LJIIJ().LJI(this.LJLJL);
                    if (!TextUtils.isEmpty(LJI) && LJI.equals(textFontStyleData3.fileName) && (textFontStyleData = c1554868i.LJLJJL) != null && textFontStyleData.LIZJ()) {
                        c1554868i.setBackground(1);
                    }
                }
                c1554868i.setTag(textFontStyleData3.fileName);
                c1554868i.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS20S0201000_2(1, this, c1554868i, 2)));
                c1554868i.setDownloadCallback(new C68T() { // from class: X.68n
                    @Override // X.C68T
                    public final void onError() {
                    }

                    @Override // X.C68T
                    public final void LIZ(TextFontStyleData textFontStyleData4, boolean z) {
                        if (z && textFontStyleData4 != null && !TextUtils.isEmpty(textFontStyleData4.fileName) && textFontStyleData4.fileName.equals(C1554968j.this.LJLJJI)) {
                            C1554968j c1554968j = C1554968j.this;
                            InterfaceC1555668q interfaceC1555668q = c1554968j.LJLILLLLZI;
                            if (interfaceC1555668q != null) {
                                interfaceC1555668q.LIZ(textFontStyleData4);
                            }
                            c1554968j.LIZJ();
                        }
                    }
                });
                ((ArrayList) this.LJLJI).add(c1554868i);
                this.LJLJJLL.addView(c1554868i);
            }
        }
        this.LJLIL.addAll(list);
    }

    public void setClickFontStyleListener(InterfaceC1555668q interfaceC1555668q) {
        this.LJLILLLLZI = interfaceC1555668q;
    }

    public void setSelectedFontType(String str) {
        this.LJLJLJ = str;
    }

    public C1554968j(Context context, int i) {
        super(context, null);
        this.LJLIL = new HashSet<>();
        this.LJLJI = new ArrayList();
        this.LJLJL = i;
        this.LJLJJLL = new LinearLayout(getContext());
        this.LJLJJL = new C1555268m(getContext(), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.LJLJJLL.setPadding((int) C74275TDb.LIZIZ(getContext(), 12.0f), 0, 0, 0);
        this.LJLJJL.addView(this.LJLJJLL, layoutParams);
        this.LJLJJL.setHorizontalScrollBarEnabled(false);
        addView(this.LJLJJL, new FrameLayout.LayoutParams(-1, -1));
    }

    public static C1554968j LIZ(int i, Context context) {
        C1554968j c1554968j = new C1554968j(context, i);
        c1554968j.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return c1554968j;
    }
}
