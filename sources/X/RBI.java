package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.ChildrenChangePasswordFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RBI implements C9X1 {
    public final /* synthetic */ ChildrenChangePasswordFragment LIZ;

    public RBI(ChildrenChangePasswordFragment childrenChangePasswordFragment) {
        this.LIZ = childrenChangePasswordFragment;
    }

    @Override // X.C9X1
    public final void LIZ(int i, Editable editable) {
        C252949wI c252949wI;
        String text;
        String text2;
        String text3;
        int i2;
        String str;
        String obj;
        if (!this.LIZ.isViewValid()) {
            return;
        }
        if (i == R.id.czb) {
            if (editable != null) {
                i2 = editable.length();
            } else {
                i2 = 0;
            }
            if (i2 < 8) {
                C74088T5w c74088T5w = (C74088T5w) this.LIZ._$_findCachedViewById(R.id.bab);
                if (c74088T5w != null) {
                    c74088T5w.setEnabled(false);
                }
            } else if (i2 > 20) {
                ChildrenChangePasswordFragment childrenChangePasswordFragment = this.LIZ;
                String string = childrenChangePasswordFragment.getString(R.string.idl);
                o.LJIIIIZZ(string, "getString(R.string.mus_password_too_long)");
                childrenChangePasswordFragment.Sg(0, string);
                C74088T5w c74088T5w2 = (C74088T5w) this.LIZ._$_findCachedViewById(R.id.bab);
                if (c74088T5w2 != null) {
                    c74088T5w2.setEnabled(false);
                }
            } else {
                String str2 = "";
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                if (RBH.LIZ.matcher(str).matches() && RBH.LIZIZ.matcher(str).matches() && RBH.LIZJ.matcher(str).matches()) {
                    RBJ rbj = new RBJ();
                    if (editable != null && (obj = editable.toString()) != null) {
                        str2 = obj;
                    }
                    if (!rbj.LIZ.matcher(str2).matches()) {
                        ChildrenChangePasswordFragment childrenChangePasswordFragment2 = this.LIZ;
                        String string2 = childrenChangePasswordFragment2.getString(R.string.dyz);
                        o.LJIIIIZZ(string2, "getString(R.string.createpw_error_6)");
                        childrenChangePasswordFragment2.Sg(0, string2);
                        C74088T5w c74088T5w3 = (C74088T5w) this.LIZ._$_findCachedViewById(R.id.bab);
                        if (c74088T5w3 != null) {
                            c74088T5w3.setEnabled(false);
                        }
                    } else {
                        C74088T5w c74088T5w4 = (C74088T5w) this.LIZ._$_findCachedViewById(R.id.bab);
                        if (c74088T5w4 != null) {
                            c74088T5w4.setEnabled(true);
                        }
                        C252949wI c252949wI2 = (C252949wI) this.LIZ._$_findCachedViewById(R.id.ba_);
                        if (c252949wI2 != null) {
                            c252949wI2.LIZ();
                        }
                    }
                } else {
                    ChildrenChangePasswordFragment childrenChangePasswordFragment3 = this.LIZ;
                    String string3 = childrenChangePasswordFragment3.getString(R.string.dyx);
                    o.LJIIIIZZ(string3, "getString(R.string.createpw_error_3)");
                    childrenChangePasswordFragment3.Sg(0, string3);
                    C74088T5w c74088T5w5 = (C74088T5w) this.LIZ._$_findCachedViewById(R.id.bab);
                    if (c74088T5w5 != null) {
                        c74088T5w5.setEnabled(false);
                    }
                }
            }
        }
        C74090T5y c74090T5y = (C74090T5y) this.LIZ._$_findCachedViewById(R.id.bac);
        if (c74090T5y == null || (text3 = c74090T5y.getText()) == null || text3.length() == 0) {
            C74090T5y c74090T5y2 = (C74090T5y) this.LIZ._$_findCachedViewById(R.id.baa);
            if (c74090T5y2 == null || (text2 = c74090T5y2.getText()) == null || text2.length() == 0) {
                C74090T5y c74090T5y3 = (C74090T5y) this.LIZ._$_findCachedViewById(R.id.ba9);
                if ((c74090T5y3 == null || (text = c74090T5y3.getText()) == null || text.length() == 0) && (c252949wI = (C252949wI) this.LIZ._$_findCachedViewById(R.id.ba_)) != null) {
                    c252949wI.LIZ();
                }
            }
        }
    }
}
