package X;

import Y.IDCListenerS371S0100000_2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.68s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1555868s extends LinearLayout {
    public List<C1555768r> LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public InnerEffectTextLayoutConfig LJLJLJ;
    public final IDCListenerS371S0100000_2 LJLJLLL;
    public final Drawable LJLL;
    public float LJLLI;

    public final C19K getFocusableEditText() {
        C1555768r c1555768r;
        Iterator<C1555768r> it = this.LJLIL.iterator();
        while (true) {
            if (it.hasNext()) {
                c1555768r = it.next();
                if (c1555768r.LIZ.hasFocus()) {
                    break;
                }
            } else {
                c1555768r = null;
                break;
            }
        }
        C1555768r c1555768r2 = c1555768r;
        if (c1555768r2 == null) {
            return null;
        }
        return c1555768r2.LIZ;
    }

    public final List<C1555768r> getEditTextList() {
        return this.LJLIL;
    }

    public final boolean getEditable() {
        return this.LJLILLLLZI;
    }

    public final String getHintString() {
        return this.LJLJJL;
    }

    public final InnerEffectTextLayoutConfig getInnerLayoutConfig() {
        return this.LJLJLJ;
    }

    public final int getMaxTextWidth() {
        return this.LJLJI;
    }

    public final int getMaxViewWidth() {
        return this.LJLJJI;
    }

    public final boolean getShowHint() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555868s(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = true;
        this.LJLJI = -1;
        this.LJLJJI = -1;
        this.LJLJJL = " ";
        this.LJLJLLL = new IDCListenerS371S0100000_2(this, 1);
        this.LJLL = C04270Et.LIZIZ(getContext(), R.drawable.at3);
    }

    public final void setEditTextList(List<C1555768r> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLIL = list;
    }

    public final void setEditable(boolean z) {
        if (this.LJLILLLLZI != z) {
            this.LJLILLLLZI = z;
            Iterator<C1555768r> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                C1DH.LJJIJL(it.next().LIZ, this.LJLILLLLZI);
            }
        }
    }

    public final void setHintString(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJL = str;
    }

    public final void setInnerLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        if (!o.LJ(this.LJLJLJ, innerEffectTextLayoutConfig)) {
            this.LJLJLJ = innerEffectTextLayoutConfig;
            setOrientation(1);
            this.LJLLI = 0.0f;
            setRotation(0.0f);
            setPadding(0, 0, 0, 0);
            InnerEffectTextLayoutConfig innerEffectTextLayoutConfig2 = this.LJLJLJ;
            if (innerEffectTextLayoutConfig2 != null) {
                setOrientation(innerEffectTextLayoutConfig2.getOrientation());
                this.LJLLI = innerEffectTextLayoutConfig2.getRotation();
                setRotation(0.0f);
                setPadding(innerEffectTextLayoutConfig2.getPaddingStart(), innerEffectTextLayoutConfig2.getPaddingTop(), innerEffectTextLayoutConfig2.getPaddingEnd(), innerEffectTextLayoutConfig2.getPaddingBottom());
                List<InnerEffectTextConfig> textConfigs = innerEffectTextLayoutConfig2.getTextConfigs();
                if (textConfigs.size() < this.LJLIL.size()) {
                    int size = this.LJLIL.size() - 1;
                    int size2 = textConfigs.size();
                    if (size2 <= size) {
                        while (true) {
                            View view = ((C1555768r) ListProtector.get(this.LJLIL, size)).LIZ;
                            if (C78996UzQ.LJJIIJZLJL(view)) {
                                C78996UzQ.LJI();
                            }
                            removeView(view);
                            ListProtector.remove(this.LJLIL, size);
                            if (size == size2) {
                                break;
                            } else {
                                size--;
                            }
                        }
                    }
                } else if (textConfigs.size() > this.LJLIL.size()) {
                    int size3 = textConfigs.size();
                    for (int size4 = this.LJLIL.size(); size4 < size3; size4++) {
                        Context context = getContext();
                        o.LJIIIIZZ(context, "context");
                        WH4 wh4 = new WH4(context, null);
                        wh4.setMaxWidth(this.LJLJI);
                        wh4.setMaxViewWidth(this.LJLJJI);
                        addView(wh4);
                        wh4.setOnFocusChangeListener(this.LJLJLLL);
                        this.LJLIL.add(new C1555768r(wh4));
                    }
                }
                int size5 = textConfigs.size();
                for (int i = 0; i < size5; i++) {
                    InnerEffectTextConfig innerEffectTextConfig = (InnerEffectTextConfig) ListProtector.get(textConfigs, i);
                    ListProtector.get(this.LJLIL, i).getClass();
                    WH4 wh42 = ((C1555768r) ListProtector.get(this.LJLIL, i)).LIZ;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = innerEffectTextConfig.getMarginStart();
                    layoutParams.rightMargin = innerEffectTextConfig.getMarginEnd();
                    layoutParams.topMargin = innerEffectTextConfig.getMarginTop();
                    layoutParams.bottomMargin = innerEffectTextConfig.getMarginBottom();
                    wh42.setLayoutParams(layoutParams);
                    wh42.setInnerTextConfig(innerEffectTextConfig);
                    wh42.setBackground(null);
                    C1DH.LJJIJL(wh42, this.LJLILLLLZI);
                }
                return;
            }
            return;
        }
        invalidate();
    }

    public final void setMaxTextWidth(int i) {
        if (this.LJLJI != i) {
            this.LJLJI = i;
            Iterator<C1555768r> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                it.next().LIZ.setMaxWidth(this.LJLJI);
            }
        }
    }

    public final void setMaxViewWidth(int i) {
        if (this.LJLJJI != i) {
            this.LJLJJI = i;
            Iterator<C1555768r> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                it.next().LIZ.setMaxViewWidth(this.LJLJJI);
            }
        }
    }

    @Override // android.view.View
    public void setRotation(float f) {
        if (this.LJLJLJ != null) {
            super.setRotation(this.LJLLI + f);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        super.setRotation(f);
    }

    public final void setShowHint(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setText(List<C1555968t> textList) {
        C76800UCe c76800UCe;
        int i;
        boolean z;
        C1555968t c1555968t;
        o.LJIIIZ(textList, "textList");
        Iterator<C1555968t> it = textList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1555968t next = it.next();
            if (next.LIZLLL) {
                if (next != null) {
                    this.LJLJL = textList.indexOf(next);
                    c76800UCe = C76800UCe.LIZ;
                }
            }
        }
        c76800UCe = null;
        r2 = false;
        boolean z2 = false;
        if (c76800UCe == null && (!textList.isEmpty())) {
            int size = textList.size();
            int i2 = this.LJLJL;
            if (size > i2) {
                ((C1555968t) ListProtector.get(textList, i2)).LIZLLL = true;
            } else {
                ((C1555968t) ListProtector.get(textList, 0)).LIZLLL = true;
            }
        }
        if (textList.size() > this.LJLIL.size()) {
            int size2 = this.LJLIL.size() - 1;
            for (int i3 = 0; i3 < size2; i3++) {
                LIZ(((C1555768r) ListProtector.get(this.LJLIL, i3)).LIZ, this, (C1555968t) ListProtector.get(textList, i3));
            }
            ArrayList arrayList = new ArrayList();
            int size3 = textList.size();
            for (int size4 = this.LJLIL.size() - 1; size4 < size3; size4++) {
                arrayList.add(ListProtector.get(textList, size4));
            }
            if (arrayList.isEmpty()) {
                c1555968t = new C1555968t(0, false, (String) null, 15);
            } else {
                StringBuilder sb = new StringBuilder("");
                if (arrayList.size() == 1) {
                    sb.append(((C1555968t) ListProtector.get(arrayList, 0)).LIZ);
                    i = ((C1555968t) ListProtector.get(arrayList, 0)).LIZIZ;
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        C1555968t c1555968t2 = (C1555968t) next2;
                        if (!c1555968t2.LIZJ && s.LJZI(c1555968t2.LIZ).toString().length() > 0) {
                            if (next2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    C1555968t c1555968t3 = (C1555968t) next3;
                                    if (!c1555968t3.LIZJ && s.LJZI(c1555968t3.LIZ).toString().length() > 0) {
                                        arrayList2.add(next3);
                                    }
                                }
                                if (arrayList2.size() == 1) {
                                    sb.append(((C1555968t) ListProtector.get(arrayList2, 0)).LIZ);
                                    i = ((C1555968t) ListProtector.get(arrayList2, 0)).LIZIZ;
                                } else {
                                    int size5 = arrayList2.size() - 1;
                                    i = 0;
                                    for (int i4 = 0; i4 < size5; i4 = C0EH.LIZIZ(sb, ((C1555968t) ListProtector.get(arrayList2, i4)).LIZ, "\n", i4, 1)) {
                                        if (((C1555968t) ListProtector.get(arrayList2, i4)).LIZLLL) {
                                            i = sb.toString().length() + ((C1555968t) ListProtector.get(arrayList2, i4)).LIZIZ;
                                        }
                                    }
                                    if (((C1555968t) AnonymousClass028.LIZIZ(arrayList2, 1, arrayList2)).LIZLLL) {
                                        i = sb.toString().length() + ((C1555968t) AnonymousClass028.LIZIZ(arrayList2, 1, arrayList2)).LIZIZ;
                                    }
                                    sb.append(((C1555968t) AnonymousClass028.LIZIZ(arrayList2, 1, arrayList2)).LIZ);
                                }
                            }
                        }
                    }
                    sb.append(((C1555968t) ListProtector.get(arrayList, 0)).LIZ);
                    i = ((C1555968t) ListProtector.get(arrayList, 0)).LIZIZ;
                }
                String sb2 = sb.toString();
                o.LJIIIIZZ(sb2, "textBuilder.toString()");
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next4 = it4.next();
                    if (!((C1555968t) next4).LIZJ) {
                        if (next4 != null) {
                            z = false;
                        }
                    }
                }
                z = true;
                Iterator it5 = arrayList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next5 = it5.next();
                    if (((C1555968t) next5).LIZLLL) {
                        if (next5 != null) {
                            z2 = true;
                        }
                    }
                }
                c1555968t = new C1555968t(i, sb2, z, z2);
            }
            List<C1555768r> list = this.LJLIL;
            LIZ(((C1555768r) DIX.LIZJ(list, 1, list)).LIZ, this, c1555968t);
            return;
        }
        if (textList.size() < this.LJLIL.size()) {
            ArrayList LJ = C61328O5c.LJ(textList);
            int size6 = this.LJLIL.size();
            for (int size7 = textList.size(); size7 < size6; size7++) {
                LJ.add(new C1555968t(0, false, (String) null, 15));
            }
            int size8 = LJ.size();
            for (int i5 = 0; i5 < size8; i5++) {
                LIZ(((C1555768r) ListProtector.get(this.LJLIL, i5)).LIZ, this, (C1555968t) ListProtector.get(LJ, i5));
            }
            return;
        }
        int size9 = textList.size();
        for (int i6 = 0; i6 < size9; i6++) {
            LIZ(((C1555768r) ListProtector.get(this.LJLIL, i6)).LIZ, this, (C1555968t) ListProtector.get(textList, i6));
        }
    }

    public static final void LIZ(WH4 wh4, C1555868s c1555868s, C1555968t c1555968t) {
        Editable text;
        wh4.setText(c1555968t.LIZ);
        if (c1555968t.LIZLLL) {
            wh4.setSelection(Math.min(String.valueOf(wh4.getText()).length(), c1555968t.LIZIZ));
            C1DH.LJJIJIL(wh4);
        } else {
            String str = " ";
            if (c1555868s.LJLJJLL && ((text = wh4.getText()) == null || text.length() == 0)) {
                str = c1555868s.LJLJJL;
            }
            wh4.setHint(str);
        }
        wh4.setTextColor(c1555968t.LIZJ);
    }
}
