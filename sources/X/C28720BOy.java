package X;

import Y.IDCListenerS159S0100000_5;
import android.content.Context;
import com.bytedance.android.livesdk.api.BroadcastUserApi;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

/* renamed from: X.BOy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28720BOy implements InterfaceC28505BGr {
    public final long LIZ;
    public final long LIZIZ;
    public final Context LIZJ;
    public final C31870Cf4 LIZLLL;
    public final C73318Sq2 LJFF = new C73318Sq2();
    public final IDCListenerS159S0100000_5 LJI = new IDCListenerS159S0100000_5(this, 17);
    public final IDCListenerS159S0100000_5 LJII = new IDCListenerS159S0100000_5(this, 18);
    public int LJ = 0;

    @Override // X.InterfaceC28505BGr
    public final void LIZ() {
        this.LIZLLL.LIZ();
        this.LJFF.dispose();
    }

    public final HashMap<String, String> LIZJ() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("room_id", String.valueOf(this.LIZ));
        hashMap.put("anchor_id", String.valueOf(this.LIZIZ));
        return hashMap;
    }

    public final void LIZLLL(Throwable th) {
        String string;
        if (th instanceof FileNotFoundException) {
            string = this.LIZJ.getString(R.string.t01);
        } else if (th instanceof C29401Dk) {
            string = ((C29401Dk) th).getErrorMsg();
        } else {
            string = this.LIZJ.getString(R.string.t1v);
        }
        this.LIZLLL.LIZ();
        C30868C9o.LJFF(this.LIZJ, string);
    }

    public C28720BOy(BaseFragment baseFragment, Room room) {
        this.LIZJ = baseFragment.getContext();
        this.LIZ = room.getId();
        this.LIZIZ = room.getOwnerUserId();
        this.LIZLLL = new C31870Cf4(baseFragment.mo49getActivity(), baseFragment, 1, 1, 750, 750, this, false, false);
    }

    @Override // X.InterfaceC28505BGr
    public final void LIZIZ(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            LIZLLL(new FileNotFoundException(i0.LJFF("avatar file don't exists in path", str)));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        BP4 LIZ = C28718BOw.LIZ();
        LIZ.getClass();
        T28.LIZLLL(((BroadcastUserApi) LIZ.LIZIZ(BroadcastUserApi.class)).uploadAvatar(multipartTypedOutput)).LIZ(new C28719BOx(this, str));
    }
}
