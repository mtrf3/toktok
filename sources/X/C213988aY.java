package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesVM;
import kotlin.jvm.internal.o;

/* renamed from: X.8aY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213988aY implements InterfaceC57784Mm4 {
    public final SpannableStringBuilder LJLIL;
    public final String LJLILLLLZI;
    public final Context LJLJI;
    public final LocationServicesVM LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C213988aY)) {
            return false;
        }
        C213988aY c213988aY = (C213988aY) obj;
        return o.LJ(this.LJLIL, c213988aY.LJLIL) && o.LJ(this.LJLILLLLZI, c213988aY.LJLILLLLZI) && o.LJ(this.LJLJI, c213988aY.LJLJI) && o.LJ(this.LJLJJI, c213988aY.LJLJJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Context context = this.LJLJI;
        return this.LJLJJI.hashCode() + ((hashCode2 + (context != null ? context.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GPSPermissionItem(subtitle=");
        LIZ.append((Object) this.LJLIL);
        LIZ.append(", previousPage=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", context=");
        LIZ.append(this.LJLJI);
        LIZ.append(", vm=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C213988aY(SpannableStringBuilder spannableStringBuilder, String str, Context context, LocationServicesVM vm) {
        o.LJIIIZ(vm, "vm");
        this.LJLIL = spannableStringBuilder;
        this.LJLILLLLZI = str;
        this.LJLJI = context;
        this.LJLJJI = vm;
    }
}
