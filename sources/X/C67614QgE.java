package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.e1;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.QgE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67614QgE extends LayoutInflater {
    public final WM7 LIZ;
    public LayoutInflater LIZIZ;

    public final void LIZ() {
        Context requireSceneContext;
        if (this.LIZIZ != null) {
            return;
        }
        WM7 wm7 = this.LIZ;
        if (wm7.mThemeResource == 0) {
            requireSceneContext = wm7.requireActivity();
        } else {
            requireSceneContext = wm7.requireSceneContext();
        }
        this.LIZIZ = this.LIZ.requireActivity().getLayoutInflater().cloneInContext(requireSceneContext);
        LayoutInflater.Filter filter = getFilter();
        if (filter != null) {
            this.LIZIZ.setFilter(filter);
        }
        LayoutInflater.Factory2 factory2 = getFactory2();
        if (factory2 != null) {
            this.LIZIZ.setFactory2(factory2);
            return;
        }
        LayoutInflater.Factory factory = getFactory();
        if (factory == null) {
            return;
        }
        this.LIZIZ.setFactory(factory);
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return new C67614QgE(context, this.LIZ);
    }

    @Override // android.view.LayoutInflater
    public final void setFactory(LayoutInflater.Factory factory) {
        super.setFactory(factory);
        LayoutInflater layoutInflater = this.LIZIZ;
        if (layoutInflater != null) {
            layoutInflater.setFactory(factory);
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        super.setFactory2(factory2);
        LayoutInflater layoutInflater = this.LIZIZ;
        if (layoutInflater != null) {
            layoutInflater.setFactory2(factory2);
        }
    }

    public C67614QgE(Context context, WM7 wm7) {
        super(context);
        this.LIZ = wm7;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup) {
        LIZ();
        LayoutInflater layoutInflater = this.LIZIZ;
        if (e1.LIZ(31744, "tiktok_tux_text_view_opt", true, false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory(new LayoutInflaterFactoryC67612QgC());
            } catch (Exception unused) {
                return layoutInflater.inflate(xmlPullParser, viewGroup);
            }
        }
        return layoutInflater.inflate(xmlPullParser, viewGroup);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup) {
        LIZ();
        return C16880lQ.LLLZIIL(i, this.LIZIZ, viewGroup);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        LIZ();
        LayoutInflater layoutInflater = this.LIZIZ;
        if (e1.LIZ(31744, "tiktok_tux_text_view_opt", true, false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory(new LayoutInflaterFactoryC67612QgC());
            } catch (Exception unused) {
                return layoutInflater.inflate(xmlPullParser, viewGroup, z);
            }
        }
        return layoutInflater.inflate(xmlPullParser, viewGroup, z);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        LIZ();
        return C16880lQ.LLLLIILL(this.LIZIZ, i, viewGroup, z);
    }
}
