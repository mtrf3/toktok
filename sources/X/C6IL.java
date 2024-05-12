package X;

import Y.ACListenerS37S0200000_2;
import Y.IDObjectS384S0100000_2;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6IL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IL extends FrameLayout {
    public List<TextFontStyleData> LJLIL;
    public C6IP LJLILLLLZI;
    public final List<C6IK> LJLJI;
    public String LJLJJI;
    public C158046Ie LJLJJL;
    public LinearLayout LJLJJLL;
    public int LJLJL;

    public final void LIZJ() {
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            C6IK c6ik = (C6IK) it.next();
            String LIZJ = C6IH.LJ().LIZJ(this.LJLJL);
            if (!TextUtils.isEmpty(LIZJ) && LIZJ.equals(c6ik.getTag())) {
                TextFontStyleData textFontStyleData = c6ik.LJLJJL;
                if (textFontStyleData != null && textFontStyleData.LIZIZ == 1) {
                    c6ik.setBackground(1);
                    c6ik.LIZIZ();
                    this.LJLJJL.LIZ(c6ik);
                }
            } else {
                c6ik.setBackground(0);
            }
        }
    }

    public final void LIZ(List<TextFontStyleData> list) {
        TextFontStyleData textFontStyleData;
        TextFontStyleData textFontStyleData2;
        if (!C78934UyQ.LJIJJ(this.LJLIL)) {
            return;
        }
        if (C78934UyQ.LJIJJ(list)) {
            C6IH LJ = C6IH.LJ();
            if (getContext() == null) {
                LJ.getClass();
                return;
            } else {
                LJ.LJ.LJJJJLI("textfont", false, false, new IDObjectS384S0100000_2(LJ, 1));
                return;
            }
        }
        this.LJLIL = list;
        for (int i = 0; i < this.LJLIL.size(); i++) {
            if (ListProtector.get(this.LJLIL, i) != null) {
                TextFontStyleData textFontStyleData3 = (TextFontStyleData) ListProtector.get(this.LJLIL, i);
                C6IK c6ik = new C6IK(getContext());
                c6ik.LIZJ(textFontStyleData3);
                c6ik.setBackground(0);
                if ("default".equals(C6IH.LJ().LIZJ(this.LJLJL))) {
                    if (i == 0 && textFontStyleData3 != null && (textFontStyleData2 = c6ik.LJLJJL) != null && textFontStyleData2.LIZIZ == 1) {
                        C6IH.LJ().LJII(this.LJLJL, textFontStyleData3.fileName);
                        c6ik.setBackground(1);
                    }
                } else {
                    String LIZJ = C6IH.LJ().LIZJ(this.LJLJL);
                    if (!TextUtils.isEmpty(LIZJ) && LIZJ.equals(textFontStyleData3.fileName) && (textFontStyleData = c6ik.LJLJJL) != null && textFontStyleData.LIZIZ == 1) {
                        c6ik.setBackground(1);
                    }
                }
                c6ik.setTag(textFontStyleData3.fileName);
                c6ik.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS37S0200000_2(this, c6ik, 10)));
                c6ik.setDownloadCallback(new C6IJ() { // from class: X.6IM
                    @Override // X.C6IJ
                    public final void onError() {
                    }

                    @Override // X.C6IJ
                    public final void LIZ(TextFontStyleData textFontStyleData4, boolean z) {
                        if (z && textFontStyleData4 != null && !TextUtils.isEmpty(textFontStyleData4.fileName) && textFontStyleData4.fileName.equals(C6IL.this.LJLJJI)) {
                            C6IL.this.LIZIZ(textFontStyleData4);
                        }
                    }
                });
                ((ArrayList) this.LJLJI).add(c6ik);
                this.LJLJJLL.addView(c6ik);
            }
        }
    }

    public final void LIZIZ(TextFontStyleData textFontStyleData) {
        C6IP c6ip = this.LJLILLLLZI;
        if (c6ip != null) {
            C6IQ c6iq = ((C6IO) c6ip).LIZ;
            if (textFontStyleData == null) {
                c6iq.getClass();
            } else {
                c6iq.LJFF(textFontStyleData);
                C6IH.LJ().LJII(c6iq.getScene(), textFontStyleData.fileName);
                c6iq.LJLJI.setFontType(C6IH.LJ().LIZIZ(c6iq.getScene()));
                c6iq.LJLJI.LJI(c6iq.LJLJJL, c6iq.LJLJLJ);
                if (c6iq.getScene() == 0) {
                    int i = textFontStyleData.fontSize;
                    if (i > 0) {
                        c6iq.LJLJI.setFontSize(i);
                    } else {
                        c6iq.LJLJI.setFontSize(64);
                    }
                }
            }
        }
        LIZJ();
    }

    public void setClickFontStyleListener(C6IP c6ip) {
        this.LJLILLLLZI = c6ip;
    }

    public C6IL(Context context, int i) {
        super(context, null);
        this.LJLIL = new ArrayList();
        this.LJLJI = new ArrayList();
        this.LJLJL = i;
        this.LJLJJLL = new LinearLayout(getContext());
        this.LJLJJL = new C158046Ie(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.LJLJJLL.setPadding((int) C74275TDb.LIZIZ(getContext(), 12.0f), 0, 0, 0);
        this.LJLJJL.addView(this.LJLJJLL, layoutParams);
        this.LJLJJL.setHorizontalScrollBarEnabled(false);
        addView(this.LJLJJL, new FrameLayout.LayoutParams(-1, -1));
    }
}
