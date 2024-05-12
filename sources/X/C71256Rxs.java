package X;

import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rxs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71256Rxs implements IFrameSlot {
    public final Context LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public View LJLJI;
    public C72269SXx LJLJJI;
    public ImageButton LJLJJL;
    public C72271SXz LJLJJLL;
    public RelativeLayout LJLJL;
    public C109174Qf LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public Room LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public IFrameSlot.SlotViewModel LJLLLLLL;

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC31687Cc7 LIZ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LIZJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LIZLLL() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void LJII(String str) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void getLocation() {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    public final Rect LIZIZ() {
        return (Rect) this.LJLL.getValue();
    }

    public C71256Rxs(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1233));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1231));
        this.LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1232));
        this.LJLLL = C221108m2.LIZIZ(C71258Rxu.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(C71257Rxt.LJLIL);
    }

    public final void LJ(EnumC75152xD state) {
        o.LJIIIZ(state, "state");
        if (!C78685UuP.LJJJZ(this.LJLLILLLL)) {
            return;
        }
        int i = C75162xE.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C72269SXx c72269SXx = this.LJLJJI;
                if (c72269SXx != null) {
                    c72269SXx.setVisibility(8);
                    C72271SXz c72271SXz = this.LJLJJLL;
                    if (c72271SXz != null) {
                        c72271SXz.setVisibility(0);
                        RelativeLayout relativeLayout = this.LJLJL;
                        if (relativeLayout != null) {
                            if (relativeLayout.getWidth() != 0) {
                                RelativeLayout relativeLayout2 = this.LJLJL;
                                if (relativeLayout2 != null) {
                                    int width = relativeLayout2.getWidth();
                                    RelativeLayout relativeLayout3 = this.LJLJL;
                                    if (relativeLayout3 != null) {
                                        if (width == relativeLayout3.getHeight()) {
                                            return;
                                        }
                                    } else {
                                        o.LJIJI("captureResult");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("captureResult");
                                    throw null;
                                }
                            }
                            C72271SXz c72271SXz2 = this.LJLJJLL;
                            if (c72271SXz2 != null) {
                                c72271SXz2.post(new ARunnableS48S0100000_12(this, 117));
                                return;
                            } else {
                                o.LJIJI("captureView");
                                throw null;
                            }
                        }
                        o.LJIJI("captureResult");
                        throw null;
                    }
                    o.LJIJI("captureView");
                    throw null;
                }
                o.LJIJI("entranceView");
                throw null;
            }
            C72269SXx c72269SXx2 = this.LJLJJI;
            if (c72269SXx2 != null) {
                c72269SXx2.setVisibility(0);
                C72271SXz c72271SXz3 = this.LJLJJLL;
                if (c72271SXz3 != null) {
                    c72271SXz3.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("captureView");
                    throw null;
                }
            }
            o.LJIJI("entranceView");
            throw null;
        }
        C72269SXx c72269SXx3 = this.LJLJJI;
        if (c72269SXx3 != null) {
            c72269SXx3.setVisibility(8);
            C72271SXz c72271SXz4 = this.LJLJJLL;
            if (c72271SXz4 != null) {
                c72271SXz4.setVisibility(8);
                return;
            } else {
                o.LJIJI("captureView");
                throw null;
            }
        }
        o.LJIJI("entranceView");
        throw null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final View LJFF(Context context) {
        o.LJIIIZ(context, "context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.arg, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(context)\n          …ct_entrance, null, false)");
        this.LJLJI = LLLLIILL;
        return LLLLIILL;
    }
}
