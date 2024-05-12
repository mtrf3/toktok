package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import org.json.JSONObject;

/* renamed from: X.099, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass099 implements LayoutInflater.Factory2 {
    public final FragmentManager LJLIL;

    public AnonymousClass099(FragmentManager fragmentManager) {
        this.LJLIL = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        Fragment fragment;
        String name;
        int i;
        if (C08X.class.getName().equals(str)) {
            return new C08X(context, attributeSet, this.LJLIL);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.name, R.attr.id, R.attr.tag});
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            try {
                C0MA<String, Class<?>> c0ma = AnonymousClass098.LIZ;
                Class<?> orDefault = c0ma.getOrDefault(attributeValue, null);
                if (orDefault == null) {
                    orDefault = Class.forName(attributeValue, false, classLoader);
                    c0ma.put(attributeValue, orDefault);
                }
                z = Fragment.class.isAssignableFrom(orDefault);
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i2 = view.getId();
                }
                if (i2 != -1 || resourceId != -1 || LLLZLZ != null) {
                    if (resourceId != -1) {
                        fragment = this.LJLIL.LJJJI(resourceId);
                    } else {
                        fragment = null;
                    }
                    if (fragment == null && LLLZLZ != null) {
                        fragment = this.LJLIL.LJJJIL(LLLZLZ);
                    }
                    if (fragment == null && i2 != -1) {
                        fragment = this.LJLIL.LJJJI(i2);
                    }
                    if (fragment == null) {
                        AnonymousClass098 LJJJJL = this.LJLIL.LJJJJL();
                        context.getClassLoader();
                        fragment = Fragment.instantiate(((C1B0) LJJJJL).LIZIZ.mHost.LJLILLLLZI, attributeValue, null);
                        fragment.mFromLayout = true;
                        if (resourceId != 0) {
                            i = resourceId;
                        } else {
                            i = i2;
                        }
                        fragment.mFragmentId = i;
                        fragment.mContainerId = i2;
                        fragment.mTag = LLLZLZ;
                        fragment.mInLayout = true;
                        FragmentManager fragmentManager = this.LJLIL;
                        fragment.mFragmentManager = fragmentManager;
                        C1BB<?> c1bb = fragmentManager.mHost;
                        fragment.mHost = c1bb;
                        fragment.onInflate(c1bb.LJLILLLLZI, attributeSet, fragment.mSavedFragmentState);
                        this.LJLIL.LIZLLL(fragment);
                        FragmentManager fragmentManager2 = this.LJLIL;
                        FragmentManager.LIZ(fragmentManager2, fragment, fragmentManager2.mCurState);
                    } else if (!fragment.mInLayout) {
                        fragment.mInLayout = true;
                        C1BB<?> c1bb2 = this.LJLIL.mHost;
                        fragment.mHost = c1bb2;
                        fragment.onInflate(c1bb2.LJLILLLLZI, attributeSet, fragment.mSavedFragmentState);
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + LLLZLZ + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
                    }
                    FragmentManager fragmentManager3 = this.LJLIL;
                    int i3 = fragmentManager3.mCurState;
                    if (i3 < 1 && fragment.mFromLayout) {
                        try {
                            fragmentManager3.LJJLI(1, fragment);
                        } catch (Exception e) {
                            try {
                                String name2 = fragment.getClass().getName();
                                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                                if (LJIIIIZZ == null) {
                                    name = "";
                                } else {
                                    name = LJIIIIZZ.getClass().getName();
                                }
                                C198517qh c198517qh = new C198517qh();
                                c198517qh.LIZ.put("fragmentname", name2);
                                c198517qh.LIZ.put("newState", 1);
                                c198517qh.LIZ.put("currentActivity", name);
                                c198517qh.LIZ.put("errorMsg", android.util.Log.getStackTraceString(e));
                                JSONObject LJ = c198517qh.LJ();
                                C198517qh c198517qh2 = new C198517qh();
                                c198517qh2.LIZ.put("errorDesc", LJ.toString());
                                c198517qh2.LIZ.put("fragment_name", name2);
                                C8HX.LIZIZ("fragment_crash_log", "", c198517qh2.LJ());
                                System.err.println("fragment_name ---> ".concat(name2));
                                System.err.println("fragment_crash_log ---> " + LJ);
                            } catch (Exception unused2) {
                            }
                        }
                    } else {
                        FragmentManager.LIZ(fragmentManager3, fragment, i3);
                    }
                    View view2 = fragment.mView;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (fragment.mView.getTag() == null) {
                            fragment.mView.setTag(LLLZLZ);
                        }
                        return fragment.mView;
                    }
                    throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                }
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
        }
        return null;
    }
}
