package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Oic, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62666Oic extends AbstractC62304Ocm {
    public final IWrapChannel LJLIL;
    public final Activity LJLILLLLZI;

    @Override // X.AbstractC62304Ocm
    public final String LJJI() {
        return "com.facebook.orca";
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "messenger";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        return "Messenger";
    }

    public C62666Oic(C62297Ocf c62297Ocf) {
        Activity activity;
        InterfaceC62671Oih interfaceC62671Oih;
        IWrapChannel LIZ = C62667Oid.LIZ("messenger");
        this.LJLIL = LIZ;
        if (LIZ == null) {
            this.LJLIL = C62667Oid.LIZ("wrap_messenger");
        }
        if (c62297Ocf != null && (interfaceC62671Oih = c62297Ocf.LIZ) != null) {
            activity = interfaceC62671Oih.get();
        } else {
            activity = null;
        }
        this.LJLILLLLZI = activity;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        C25600zU LJJL;
        int i;
        if (context != null && (LJJL = C78857UxB.LJJL(context)) != null) {
            C2068389v c2068389v = new C2068389v();
            Integer LJIIIZ = C78857UxB.LJIIIZ(R.attr.fr, LJJL);
            if (LJIIIZ != null) {
                i = LJIIIZ.intValue();
            } else {
                i = 0;
            }
            c2068389v.LIZ = i;
            return c2068389v.LIZ(LJJL);
        }
        return null;
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        IWrapChannel iWrapChannel;
        Boolean valueOf;
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Activity activity = this.LJLILLLLZI;
        if (activity == null || (iWrapChannel = this.LJLIL) == null || (valueOf = Boolean.valueOf(iWrapChannel.LJJIIJ(content, activity, interfaceC62573Oh7))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // X.AbstractC62304Ocm, X.InterfaceC62225ObV
    public final boolean LJIILIIL(C62314Ocw content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        IWrapChannel iWrapChannel;
        Boolean valueOf;
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Activity activity = this.LJLILLLLZI;
        if (activity == null || (iWrapChannel = this.LJLIL) == null || (valueOf = Boolean.valueOf(iWrapChannel.LJJIIJZLJL(content, activity, interfaceC62573Oh7))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // X.AbstractC62223ObT, X.InterfaceC62225ObV
    public final boolean LJIJ(OYP content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        IWrapChannel iWrapChannel;
        Boolean valueOf;
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Activity activity = this.LJLILLLLZI;
        if (activity == null || (iWrapChannel = this.LJLIL) == null || (valueOf = Boolean.valueOf(iWrapChannel.LJJIII(content, activity, interfaceC62573Oh7))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }
}