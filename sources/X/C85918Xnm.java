package X;

import Y.ACListenerS35S0100000_15;
import android.content.Context;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItemDisplay;
import kotlin.jvm.internal.AqS57S0110000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85918Xnm extends C85938Xo6 implements InterfaceC85949XoH {
    public final PushItem LJLJL;
    public final InterfaceC85953XoL LJLJLJ;
    public final ACListenerS35S0100000_15 LJLJLLL;

    @Override // X.InterfaceC85949XoH
    public final void LJ(Context context) {
    }

    @Override // X.C85938Xo6, X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        boolean z;
        C2068389v c2068389v;
        boolean z2;
        C85933Xo1 c85933Xo1 = new C85933Xo1(this.LJLJL.itemId);
        if (c85933Xo1.LIZIZ && c85933Xo1.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        PushItemDisplay pushItemDisplay = this.LJLJL.display;
        String str = pushItemDisplay.title;
        if (pushItemDisplay.LIZ()) {
            c2068389v = C85926Xnu.LIZLLL(this.LJLJL.display.icon);
        } else {
            c2068389v = null;
        }
        PushItem pushItem = this.LJLJL;
        String str2 = pushItem.display.description;
        ACListenerS35S0100000_15 aCListenerS35S0100000_15 = this.LJLJLLL;
        if ((pushItem.clientControlFlags & 1) == 0) {
            z2 = C40322Fs6.LIZJ(EF7.LIZIZ());
        } else {
            z2 = true;
        }
        return new C25848ACm(z, str, aCListenerS35S0100000_15, C85919Xnn.LIZ(this.LJLJL), c85933Xo1, aCListenerS35S0100000_15, c2068389v, str2, z2, false, false, null, 62096);
    }

    @Override // X.C85938Xo6, X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    @Override // X.InterfaceC85949XoH
    public final void LIZIZ(boolean z) {
        C85933Xo1 c85933Xo1;
        boolean z2 = true;
        if ((this.LJLJL.clientControlFlags & 1) == 0) {
            LJIIJ(new AqS57S0110000_15(this, z, 2));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = LJFF().LLFF;
            if (!(obj instanceof C85933Xo1) || (c85933Xo1 = (C85933Xo1) obj) == null) {
                return;
            }
            C62822Ol8 c62822Ol8 = C85950XoI.LIZ;
            Object value = c62822Ol8.getValue();
            o.LJIIIIZZ(value, "<get-needSyncKeva>(...)");
            String string = ((Keva) value).getString("need_sync_channel_name", "");
            o.LJIIIIZZ(string, "needSyncKeva.getString(NEED_SYNC_CHANNEL, \"\")");
            boolean LIZ = C85926Xnu.LIZ(c85933Xo1.LIZ);
            c85933Xo1.LIZJ = LIZ;
            if (!c85933Xo1.LIZIZ && LIZ && string.length() > 0 && string.equals(c85933Xo1.LIZ)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" on page resume ");
                LIZ2.append(c85933Xo1);
                LIZ2.append(", needSyncChannelId: ");
                LIZ2.append(string);
                C85934Xo2.LIZ(X1D.LIZIZ(LIZ2));
                Object value2 = c62822Ol8.getValue();
                o.LJIIIIZZ(value2, "<get-needSyncKeva>(...)");
                ((Keva) value2).storeString("need_sync_channel_name", "");
                c85933Xo1.LIZIZ = true;
                InterfaceC85953XoL interfaceC85953XoL = this.LJLJLJ;
                if (interfaceC85953XoL != null) {
                    interfaceC85953XoL.LIZ(1, c85933Xo1.LIZ);
                }
            }
            if (!c85933Xo1.LIZIZ || !c85933Xo1.LIZJ) {
                z2 = false;
            }
            LJIILIIL(z2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85918Xnm(PushItem pushItem, InterfaceC85953XoL interfaceC85953XoL) {
        super(null);
        o.LJIIIZ(pushItem, "pushItem");
        this.LJLJL = pushItem;
        this.LJLJLJ = interfaceC85953XoL;
        this.LJLJLLL = new ACListenerS35S0100000_15(this, 195);
    }

    @Override // X.InterfaceC85949XoH
    public final void LIZLLL(int i, String otherItemId) {
        o.LJIIIZ(otherItemId, "otherItemId");
        if (o.LJ(this.LJLJL.itemId, "im_push_preview_v2") && o.LJ(otherItemId, "im_push")) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            LJIIJ(new AqS57S0110000_15(this, z, 3));
        }
    }
}
