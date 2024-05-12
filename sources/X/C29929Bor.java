package X;

import android.os.Bundle;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Bor, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29929Bor {
    public String LIZ;
    public long LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public final String LJ;
    public final ImageModel LJFF;
    public final ImageModel LJI;
    public final ImageModel LJII;
    public final ImageModel LJIIIIZZ;
    public final String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public final Room LJIJJ;
    public java.util.Map<String, String> LJIJJLI;
    public final List<AbstractC62607Ohf> LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public final List<User> LJJIIZI;
    public final List<User> LJJIJ;
    public String LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    public boolean LJJIJL;
    public AdLiveEnterRoomConfig LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public String LJJJ;
    public Bundle LJJJI;
    public InterfaceC29938Bp0 LJJJIL;
    public InterfaceC62555Ogp LJJJJ;
    public InterfaceC31607Cap LJJJJI;
    public InterfaceC29961BpN LJJJJIZL;
    public String LJJJJJ;
    public String LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJLL;
    public int LJJJJZ;
    public String LJJJJZI;
    public boolean LJJJLIIL;
    public InterfaceC29939Bp1 LJJJLL;

    public final C29930Bos LIZLLL() {
        return new C29930Bos(this);
    }

    public C29929Bor() {
        this.LJIIJ = "";
        this.LJIIJJI = "";
        this.LJIIL = "";
        this.LJIILIIL = "";
        this.LJIL = new ArrayList();
        this.LJJIIZI = new ArrayList();
        this.LJJIJ = new ArrayList();
        this.LJJIL = true;
        this.LJJIZ = false;
        this.LJJJJL = false;
        this.LJJJJLI = false;
        this.LJJJJLL = false;
        this.LJJJJZ = 0;
        this.LJJJJZI = "";
        this.LJJJLIIL = false;
    }

    public C29929Bor(Room room) {
        this.LJIIJ = "";
        this.LJIIJJI = "";
        this.LJIIL = "";
        this.LJIILIIL = "";
        this.LJIL = new ArrayList();
        this.LJJIIZI = new ArrayList();
        this.LJJIJ = new ArrayList();
        this.LJJIL = true;
        this.LJJIZ = false;
        this.LJJJJL = false;
        this.LJJJJLI = false;
        this.LJJJJLL = false;
        this.LJJJJZ = 0;
        this.LJJJJZI = "";
        this.LJJJLIIL = false;
        this.LIZIZ = room.getId();
        this.LJIIIIZZ = room.getCover();
        this.LJIIZILJ = room.getRequestId();
        this.LJIIJ = room.getShareUrl();
        this.LJIIJJI = room.getTitle();
        this.LJIJJ = room;
        User owner = room.getOwner();
        if (owner != null) {
            this.LIZJ = owner.getId();
            owner.getIdStr();
            this.LJFF = owner.getAvatarThumb();
            this.LJI = owner.getAvatarMedium();
            this.LJII = owner.getAvatarLarge();
            this.LJIIIZ = C05220Ik.LIZ(owner);
            this.LJ = C05220Ik.LIZIZ(owner);
            this.LJIJI = owner.getSecUid();
        }
    }

    public C29929Bor(User user) {
        this.LJIIJ = "";
        this.LJIIJJI = "";
        this.LJIIL = "";
        this.LJIILIIL = "";
        this.LJIL = new ArrayList();
        this.LJJIIZI = new ArrayList();
        this.LJJIJ = new ArrayList();
        this.LJJIL = true;
        this.LJJIZ = false;
        this.LJJJJL = false;
        this.LJJJJLI = false;
        this.LJJJJLL = false;
        this.LJJJJZ = 0;
        this.LJJJJZI = "";
        this.LJJJLIIL = false;
        if (user != null) {
            this.LIZJ = user.getId();
            user.getIdStr();
            this.LJFF = user.getAvatarThumb();
            this.LJI = user.getAvatarMedium();
            this.LJII = user.getAvatarLarge();
            this.LJIIIZ = C05220Ik.LIZ(user);
            this.LJ = C05220Ik.LIZIZ(user);
            this.LJIJI = user.getSecUid();
        }
    }

    public final void LIZ(Boolean bool, String str) {
        if (this.LJJJI == null) {
            this.LJJJI = new Bundle();
        }
        this.LJJJI.putBoolean(str, bool.booleanValue());
    }

    public final void LIZIZ(String str, String str2) {
        if (this.LJJJI == null) {
            this.LJJJI = new Bundle();
        }
        this.LJJJI.putString(str, str2);
    }

    public final void LIZJ(String str, ArrayList arrayList) {
        if (this.LJJJI == null) {
            this.LJJJI = new Bundle();
        }
        this.LJJJI.putStringArrayList(str, arrayList);
    }
}
