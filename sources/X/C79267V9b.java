package X;

import X.C79276V9k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.V9b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C79267V9b<T extends C79276V9k> extends AppCompatImageView {
    public C79269V9d<V92> LJLIL;
    public List<? extends T> LJLILLLLZI;

    public final void LIZ() {
        C79269V9d<V92> c79269V9d = this.LJLIL;
        if (c79269V9d.LIZ) {
            return;
        }
        c79269V9d.LIZ = true;
        for (int i = 0; i < c79269V9d.LIZIZ.size(); i++) {
            c79269V9d.LIZIZ.get(i).LJ();
        }
    }

    public final void LIZIZ() {
        int size = this.LJLIL.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            this.LJLIL.LIZIZ.get(i).LIZJ().setCallback(null);
        }
        C79269V9d<V92> c79269V9d = this.LJLIL;
        if (!c79269V9d.LIZ) {
            return;
        }
        c79269V9d.LIZ = false;
        for (int i2 = 0; i2 < c79269V9d.LIZIZ.size(); i2++) {
            c79269V9d.LIZIZ.get(i2).LJFF();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LIZ();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZIZ();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        LIZ();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        LIZIZ();
    }

    public final List<T> getImageInfoList() {
        return this.LJLILLLLZI;
    }

    public final C79269V9d<V92> getMultiDraweeHolder() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79267V9b(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = new C79269V9d<>();
    }

    public final void setDrawables(List<? extends T> drawableList) {
        o.LJIIIZ(drawableList, "drawableList");
        this.LJLILLLLZI = drawableList;
        C79269V9d<V92> c79269V9d = this.LJLIL;
        if (c79269V9d.LIZ) {
            for (int i = 0; i < c79269V9d.LIZIZ.size(); i++) {
                c79269V9d.LIZIZ.get(i).LJFF();
            }
        }
        c79269V9d.LIZIZ.clear();
        int size = drawableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C79276V9k c79276V9k = (C79276V9k) ListProtector.get(drawableList, i2);
            C79077V1t c79077V1t = new C79077V1t(getResources());
            c79077V1t.LJIILL = c79276V9k.LIZLLL;
            c79077V1t.LIZLLL = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
            V92 LIZ = c79077V1t.LIZ();
            LIZ.LJ(c79276V9k.LIZ, 1.0f, true);
            getContext();
            C81250Vug<V92> c81250Vug = new C81250Vug<>(LIZ);
            C79269V9d<V92> c79269V9d2 = this.LJLIL;
            int size2 = c79269V9d2.LIZIZ.size();
            C32151Nz.LJII(size2, c79269V9d2.LIZIZ.size() + 1);
            c79269V9d2.LIZIZ.add(size2, c81250Vug);
            if (c79269V9d2.LIZ) {
                c81250Vug.LJ();
            }
        }
        int size3 = this.LJLIL.LIZIZ.size();
        for (int i3 = 0; i3 < size3; i3++) {
            this.LJLIL.LIZIZ.get(i3).LIZJ().setCallback(this);
        }
        requestLayout();
    }

    public final void setImageInfoList(List<? extends T> list) {
        this.LJLILLLLZI = list;
    }

    public final void setMultiDraweeHolder(C79269V9d<V92> c79269V9d) {
        o.LJIIIZ(c79269V9d, "<set-?>");
        this.LJLIL = c79269V9d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable dr) {
        o.LJIIIZ(dr, "dr");
        super.verifyDrawable(dr);
        C79269V9d<V92> c79269V9d = this.LJLIL;
        for (int i = 0; i < c79269V9d.LIZIZ.size(); i++) {
            if (dr == c79269V9d.LIZIZ.get(i).LIZJ()) {
                return true;
            }
        }
        return false;
    }
}
