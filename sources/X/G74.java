package X;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
public class G74 extends G75 implements View.OnClickListener {
    public ArrayList<View.OnClickListener> LJLJL;
    public int LJLJLJ;
    public List<User> LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final boolean LJLLL;
    public final boolean LJLLLL;
    public final boolean LJLLLLLL;

    public final void LIZ() {
        AIF aif = (AIF) this.LJLIL.getAccessory();
        Objects.requireNonNull(aif);
        aif.LJIILIIL("");
    }

    public int getAllowRecommend() {
        return this.LJLL;
    }

    public List<User> getExcludeUserList() {
        return this.LJLJLLL;
    }

    public int getPermission() {
        return this.LJLJLJ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if ((C00F.LIZ(31744, 0, "creative_tools_publish_first_frame_opt", true) & 4) != 0) {
            if (this.LJLIL.getShowAlertBadge()) {
                this.LJLIL.setShowAlertBadge(false);
            }
        } else {
            this.LJLIL.setShowAlertBadge(false);
        }
        if (C79004UzY.LJJIFFI(this.LJLJL)) {
            return;
        }
        Iterator<View.OnClickListener> it = this.LJLJL.iterator();
        while (it.hasNext()) {
            it.next().onClick(view);
        }
    }

    public void setAdvPromotable(boolean z) {
        this.LJLLILLLL = z;
    }

    public void setAllowRecommend(int i) {
        this.LJLL = i;
    }

    public void setImageMode(boolean z) {
        this.LJLLJ = z;
    }

    @Override // X.G75
    public void setLeftTuxIcon(int i) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        if (C40981G6n.LIZ()) {
            c2068389v.LJ = Integer.valueOf(R.attr.go);
        }
        this.LJLIL.setIcon(c2068389v);
    }

    @Override // X.G75
    public void setTitle(int i) {
        this.LJLJI = getContext().getString(i);
        if (C40981G6n.LIZ()) {
            C26012AIu.LIZIZ(this.LJLIL, this.LJLJI);
        } else {
            this.LJLIL.setTitle(this.LJLJI);
        }
    }

    public G74(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        int i;
        int i2;
        this.LJLJLJ = -1;
        if (C00F.LIZ(31744, 0, "studio_creation_post_privacy_grammar", true) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLLL = z;
        this.LJLLLLLL = C00F.LIZ(31744, 0, "studio_creation_post_privacy_text", true) == 1;
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            this.LJLLL = LJ.LJIILIIL();
        }
        setLeftTuxIcon(R.raw.icon_unlock);
        if (z) {
            if (this.LJLLL) {
                i2 = R.string.p5t;
            } else {
                i2 = R.string.p5s;
            }
            setTitle(i2);
        } else {
            if (this.LJLLJ) {
                i = R.string.p6e;
            } else {
                i = R.string.sdz;
            }
            setTitle(i);
            if (this.LJLLL) {
                setLabelText(R.string.pig);
            } else {
                setLabelText(R.string.blo);
            }
        }
        if (!C19N.LJ("private_available", true)) {
            setVisibility(8);
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(this));
    }

    public final void LIZIZ(int i, boolean z) {
        if (z) {
            this.LJLJJL = getContext().getString(i);
            T5R t5r = new T5R(this.LJLJJL);
            if (C79045V0n.LJI(R.attr.eb, getContext()) != null) {
                t5r.setSpan(new ForegroundColorSpan(C79045V0n.LJI(R.attr.eb, getContext()).intValue()), 0, this.LJLJJL.length(), 33);
            }
            AIF aif = (AIF) this.LJLIL.getAccessory();
            Objects.requireNonNull(aif);
            aif.LJIILIIL(t5r);
            return;
        }
        setLabelText(i);
    }

    public final void LIZJ(int i, boolean z) {
        if (z && this.LJLLLL) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = i;
            c2068389v.LJ = Integer.valueOf(R.attr.eb);
            this.LJLIL.setIcon(c2068389v);
            return;
        }
        setLeftTuxIcon(i);
    }

    public final void LJ(int i, boolean z) {
        if (z) {
            this.LJLJI = getContext().getString(i);
            T5R t5r = new T5R(this.LJLJI);
            if (C40981G6n.LIZ()) {
                t5r.LIZ(42);
            }
            if (C79045V0n.LJI(R.attr.eb, getContext()) != null) {
                t5r.setSpan(new ForegroundColorSpan(C79045V0n.LJI(R.attr.eb, getContext()).intValue()), 0, this.LJLJI.length(), 33);
            }
            this.LJLIL.setTitle(t5r);
            return;
        }
        setTitle(i);
    }

    public final void LIZLLL(int i, int i2, List list) {
        String str;
        int i3;
        int size;
        this.LJLJLJ = i;
        this.LJLJLLL = list;
        this.LJLL = i2;
        if (list == null || (size = list.size()) <= 0 || (size <= 1 ? (str = C78963Uyt.LJJI((User) ListProtector.get(list, 0))) == null : (str = C5L7.LIZ().getString(R.string.pix, C78963Uyt.LJJI((User) ListProtector.get(list, 0)), Integer.valueOf(size))) == null)) {
            str = "";
        }
        if (this.LJLLJ) {
            i3 = R.string.p6e;
        } else {
            i3 = R.string.sdz;
        }
        setTitle(i3);
        boolean z = this.LJLLILLLL;
        int i4 = R.raw.icon_earth_w;
        if (z) {
            if (i == 0 && !this.LJLLL) {
                if (this.LJLLLL) {
                    setTitle(R.string.p5s);
                } else {
                    setLabelText(R.string.pif);
                }
                if (!G6X.LIZIZ()) {
                    i4 = R.raw.icon_unlock;
                }
                setLeftTuxIcon(i4);
                return;
            }
            setLabelText(R.string.ipj);
            setLeftTuxIcon(R.raw.icon_lock_small);
            return;
        }
        if (i == -1) {
            setLabelText(R.string.p68);
            return;
        }
        if (i == 0) {
            if (this.LJLLL) {
                if (this.LJLLLL) {
                    setTitle(R.string.p5t);
                    LIZ();
                } else {
                    setLabelText(R.string.pig);
                }
            } else if (this.LJLLLL) {
                setTitle(R.string.p5s);
                LIZ();
            } else {
                setLabelText(R.string.blo);
            }
            if (this.LJLLL && G9P.LIZIZ()) {
                i4 = R.raw.icon_person_arrow_left;
            } else if (!G6X.LIZIZ()) {
                i4 = R.raw.icon_unlock;
            }
            setLeftTuxIcon(i4);
            return;
        }
        if (i == 1) {
            if (this.LJLLLL) {
                LJ(R.string.p5v, this.LJLLLLLL);
                LIZ();
            } else {
                LIZIZ(R.string.tnp, this.LJLLLLLL);
            }
            LIZJ(R.raw.icon_lock_small, this.LJLLLLLL);
            return;
        }
        if (i == 3) {
            setTitle(C5L7.LIZ().getString(R.string.piw));
            LIZJ(R.drawable.tx, this.LJLLLLLL);
            setLabelText(str);
        } else {
            if (i == 4) {
                if (this.LJLLLL) {
                    LJ(R.string.rug, this.LJLLLLLL);
                } else {
                    LIZIZ(R.string.ruf, this.LJLLLLLL);
                }
                LIZJ(R.raw.icon_star_ring, this.LJLLLLLL);
                return;
            }
            if (this.LJLLLL) {
                LJ(R.string.p5u, this.LJLLLLLL);
                LIZ();
            } else {
                LIZIZ(R.string.gn_, this.LJLLLLLL);
            }
            LIZJ(R.raw.icon_person_arrow_left_right, this.LJLLLLLL);
        }
    }
}
