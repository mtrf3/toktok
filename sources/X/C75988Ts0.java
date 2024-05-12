package X;

import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ts0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75988Ts0 extends AbstractC31414CUo<C75883TqJ, C75990Ts2> {
    public final InterfaceC75991Ts3 LIZIZ;

    public C75988Ts0(DataChannel dataChannel, InterfaceC75991Ts3 listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZIZ = listener;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C75990Ts2 c75990Ts2, C75883TqJ c75883TqJ) {
        ImageModel imageModel;
        String str;
        String str2;
        long LLI;
        int intValue;
        int i;
        ImageModel imageModel2;
        C75990Ts2 holder = c75990Ts2;
        C75883TqJ user = c75883TqJ;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(user, "user");
        holder.LJLJL = user;
        Long l = null;
        if (user.LJJI == EnumC75909Tqj.LINKED || user.LIZJ()) {
            C31597Caf M = holder.M();
            C75768ToS c75768ToS = user.LJIIZILJ;
            if (c75768ToS != null) {
                imageModel = c75768ToS.LIZJ;
            } else {
                imageModel = null;
            }
            C31665Cbl.LJIIJ(M, imageModel, M.getWidth(), M.getHeight(), R.drawable.cuk);
            Object value = holder.LJLJJL.getValue();
            o.LJIIIIZZ(value, "<get-viewUserName>(...)");
            TextView textView = (TextView) value;
            C75768ToS c75768ToS2 = user.LJIIZILJ;
            if (c75768ToS2 != null) {
                str = c75768ToS2.LIZ;
                str2 = c75768ToS2.LIZIZ;
            } else {
                str = null;
                str2 = null;
            }
            textView.setText(C05170If.LIZIZ(str, str2));
            if (user.LJIJ) {
                if (holder.L().getVisibility() != 0) {
                    C29306Beo.LJJLJLI(holder.L());
                    holder.L().LIZIZ(16.0f);
                }
            } else {
                C29306Beo.LJI(holder.L());
            }
        } else if (user.LJ()) {
            if (user.LJFF()) {
                C31597Caf M2 = holder.M();
                C75768ToS c75768ToS3 = user.LJIIZILJ;
                if (c75768ToS3 != null) {
                    imageModel2 = c75768ToS3.LIZJ;
                } else {
                    imageModel2 = null;
                }
                C31665Cbl.LJIIJ(M2, imageModel2, M2.getWidth(), M2.getHeight(), R.drawable.cuk);
            } else {
                C31597Caf M3 = holder.M();
                Integer num = user.LJJ;
                if (num != null) {
                    intValue = num.intValue();
                } else {
                    Integer num2 = (Integer) ORZ.LLIIJLIL(C123084sK.LIZ, V0Q.Default);
                    user.LJJ = num2;
                    o.LJI(num2);
                    intValue = num2.intValue();
                }
                M3.setImageResource(intValue);
            }
            Object value2 = holder.LJLJJL.getValue();
            o.LJIIIIZZ(value2, "<get-viewUserName>(...)");
            TextView textView2 = (TextView) value2;
            if (user.LJIILJJIL == EnumC75767ToR.PLAYTYPE_APPLY.value) {
                i = R.string.kk0;
            } else {
                i = R.string.kjz;
            }
            textView2.setText(i);
        }
        if (!user.LIZJ() && user.LJ()) {
            holder.N().setVisibility(0);
            C15490jB.LJ(holder.N(), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "ttlive_co_host_breathe_2.webp");
        } else {
            holder.N().clearAnimation();
            holder.N().setVisibility(8);
        }
        C75883TqJ c75883TqJ2 = holder.LJLJL;
        if (c75883TqJ2 != null) {
            if (!c75883TqJ2.LIZJ() && c75883TqJ2.LJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("updateCountDown, user.isWaiting, coHostUser?.uid = ");
                C75883TqJ c75883TqJ3 = holder.LJLJL;
                if (c75883TqJ3 != null) {
                    l = Long.valueOf(c75883TqJ3.LIZ);
                }
                LIZ.append(l);
                C0NB.LJIIIZ("MultiCoHostManageLinkUserBinder", X1D.LIZIZ(LIZ));
                Object value3 = holder.LJLJI.getValue();
                o.LJIIIIZZ(value3, "<get-viewCountDownText>(...)");
                ((View) value3).setVisibility(0);
                if (c75883TqJ2.LJIIIIZZ && c75883TqJ2.LJIIIZ) {
                    LLI = C8E.LIZLLL().LLI(c75883TqJ2.LJIIJJI);
                } else {
                    LLI = C8E.LIZLLL().LLI(c75883TqJ2.LIZ);
                }
                Object value4 = holder.LJLJI.getValue();
                o.LJIIIIZZ(value4, "<get-viewCountDownText>(...)");
                ((TextView) value4).setText(BML.LIZ(C15380j0.LJIILJJIL(R.string.mi0), Long.valueOf(LLI)));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("updateCountDown, GONE, coHostUser?.uid = ");
                C75883TqJ c75883TqJ4 = holder.LJLJL;
                if (c75883TqJ4 != null) {
                    l = Long.valueOf(c75883TqJ4.LIZ);
                }
                LIZ2.append(l);
                C0NB.LJIIIZ("MultiCoHostManageLinkUserBinder", X1D.LIZIZ(LIZ2));
                Object value5 = holder.LJLJI.getValue();
                o.LJIIIIZZ(value5, "<get-viewCountDownText>(...)");
                ((View) value5).setVisibility(8);
            }
        }
        if (!user.LIZJ() && user.LJ() && user.LJFF()) {
            Object value6 = holder.LJLJJI.getValue();
            o.LJIIIIZZ(value6, "<get-viewCancelInvite>(...)");
            ((View) value6).setVisibility(0);
        } else {
            Object value7 = holder.LJLJJI.getValue();
            o.LJIIIIZZ(value7, "<get-viewCancelInvite>(...)");
            ((View) value7).setVisibility(8);
        }
        C16880lQ.LJJIJIIJI(holder.M(), new ACListenerS33S0100000_13(user, 202));
        Object value8 = holder.LJLJJI.getValue();
        o.LJIIIIZZ(value8, "<get-viewCancelInvite>(...)");
        C16880lQ.LJIIJ(new ACListenerS47S0200000_13(this, user, 55), (View) value8);
    }

    @Override // X.AbstractC31414CUo
    public final C75990Ts2 LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(layoutInflater, R.layout.d84, parent, false);
        o.LJIIIIZZ(view, "view");
        return new C75990Ts2(view);
    }
}
