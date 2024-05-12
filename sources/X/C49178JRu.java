package X;

import Y.ARunnableS44S0100000_8;
import Y.IDCListenerS245S0100000_8;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JRu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49178JRu implements JSL {
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static final /* synthetic */ int LJIIL = 0;
    public final JTS LIZ;
    public RecyclerView LIZIZ;
    public C49177JRt LIZJ;
    public boolean LJ;
    public int LJFF;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 731));
    public final C62822Ol8 LJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 730));
    public final C62822Ol8 LJII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 729));

    @Override // X.JSL
    public final void LIZIZ(int i, InterfaceC49186JSc interfaceC49186JSc) {
    }

    @Override // X.JSL
    public final void LIZJ() {
    }

    @Override // X.JSL
    public final void LIZLLL(JU3 ju3) {
    }

    @Override // X.JSL
    public final void LJFF() {
    }

    @Override // X.JSL
    public final void LJ() {
        LJIIIIZZ = 0L;
        LJIIIZ = 0L;
        LJIIJ = 0L;
        LJIIJJI = 0L;
        JSONObject LIZJ = C65232Piu.LIZJ("isActive", "1");
        C50340JpI c50340JpI = this.LIZ.LJIILLIIL;
        if (c50340JpI != null) {
            c50340JpI.LIZ("updateAutoPlayStatus", LIZJ);
        }
        this.LJ = true;
    }

    @Override // X.JSL
    public final void LJI() {
        LJIIIIZZ = 0L;
        LJIIIZ = 0L;
        LJIIJ = 0L;
        LJIIJJI = 0L;
        JSONObject LIZJ = C65232Piu.LIZJ("isActive", CardStruct.IStatusCode.DEFAULT);
        C50340JpI c50340JpI = this.LIZ.LJIILLIIL;
        if (c50340JpI != null) {
            c50340JpI.LIZ("updateAutoPlayStatus", LIZJ);
        }
        this.LJ = false;
    }

    @Override // X.JSL
    public final Boolean isActive() {
        return Boolean.valueOf(this.LJ);
    }

    public C49178JRu(JTS jts) {
        this.LIZ = jts;
    }

    @Override // X.JSL
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        o.LJIIIZ(aweme, "aweme");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", C78939UyV.LJIILJJIL(aweme));
        C50340JpI c50340JpI = this.LIZ.LJIILLIIL;
        if (c50340JpI != null) {
            c50340JpI.LIZ("locateVideoByAid", jSONObject);
        }
        c49196JSm.LIZIZ();
    }

    @Override // X.JSL
    public final void LIZ(RecyclerView listView, InterfaceC49154JQw interfaceC49154JQw, int i, boolean z) {
        o.LJIIIZ(listView, "listView");
        this.LIZIZ = listView;
        listView.LJJLL((C0A6) this.LJI.getValue());
        listView.LJIIJJI((C0A6) this.LJI.getValue());
        listView.removeOnAttachStateChangeListener((IDCListenerS245S0100000_8) this.LJII.getValue());
        listView.addOnAttachStateChangeListener((IDCListenerS245S0100000_8) this.LJII.getValue());
        listView.post(new ARunnableS44S0100000_8(this, 206));
    }
}
