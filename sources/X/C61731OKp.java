package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.LiveEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.OKp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61731OKp implements InterfaceC62486Ofi {
    public final LiveEvent LJLIL;
    public final C38049EwX LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_flag;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_2pt_flag;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.g6r;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "report_music";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        String eventID = this.LJLIL.getEventID();
        JSONObject LIZJ = C65232Piu.LIZJ("type", "report");
        C38049EwX c38049EwX = this.LJLILLLLZI;
        if (c38049EwX != null) {
            c38049EwX.LJIIIIZZ("live_event_operation", LIZJ);
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "live_event").appendQueryParameter("object_id", eventID);
        User organizer = this.LJLIL.getOrganizer();
        String str2 = null;
        if (organizer == null || (str = organizer.getUid()) == null) {
            str = "";
        }
        a.LJIILLIIL().LIZIZ(C78609UtB.LJJLIIIJ(context), appendQueryParameter.appendQueryParameter("owner_id", str));
        C188727au c188727au = new C188727au();
        User organizer2 = this.LJLIL.getOrganizer();
        if (organizer2 != null) {
            str2 = organizer2.getSecUid();
        }
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("object_type", "live_event");
        c188727au.LJIIIZ("object_id", eventID);
        c188727au.LJIIIZ("enter_method", "button");
        C67142kI.LIZIZ(c188727au, this.LJLJI);
        FMX.LJIIL("click_report", c188727au.LIZ);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C61731OKp(LiveEvent liveEvent, C38049EwX c38049EwX, String str) {
        this.LJLIL = liveEvent;
        this.LJLILLLLZI = c38049EwX;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
