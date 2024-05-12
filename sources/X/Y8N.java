package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class Y8N extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.getUserInfo";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82966WhG> LIZ() {
        return C82966WhG.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<Y8Q> LIZLLL() {
        return Y8Q.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        C86291Xtn c86291Xtn;
        IHostUserDepend iHostUserDepend;
        String str;
        boolean z;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        C82963WhD.LIZ(params);
        Y8O y8o = new Y8O(this, interfaceC31943CgF);
        C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
        if ((c86291Xtn2 != null && (iHostUserDepend = c86291Xtn2.LJII) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostUserDepend = c86291Xtn.LJII) != null)) {
            Y8Q y8q = new Y8Q();
            y8q.LIZIZ = Boolean.valueOf(iHostUserDepend.hasLogin());
            y8q.LIZJ = Boolean.valueOf(iHostUserDepend.hasLogin());
            Y8S y8s = new Y8S();
            String userId = iHostUserDepend.getUserId();
            if (userId == null) {
                userId = "";
            }
            y8s.LIZ = userId;
            String secUid = iHostUserDepend.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            y8s.LIZIZ = secUid;
            String uniqueID = iHostUserDepend.getUniqueID();
            if (uniqueID == null) {
                uniqueID = "";
            }
            y8s.LIZJ = uniqueID;
            String nickname = iHostUserDepend.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            y8s.LJ = nickname;
            String avatarURL = iHostUserDepend.getAvatarURL();
            if (avatarURL == null) {
                avatarURL = "";
            }
            y8s.LJFF = avatarURL;
            IHostUserDepend.UserModelExt userModelExt = iHostUserDepend.getUserModelExt();
            if (userModelExt == null || (str = userModelExt.getShortID()) == null) {
                str = "";
            }
            y8s.LIZLLL = str;
            String boundPhone = iHostUserDepend.getBoundPhone();
            if (boundPhone == null) {
                boundPhone = "";
            }
            boolean z2 = true;
            if (boundPhone.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            y8s.LJI = valueOf;
            y8s.LJII = valueOf;
            String boundEmail = iHostUserDepend.getBoundEmail();
            if (boundEmail == null) {
                boundEmail = "";
            }
            if (boundEmail.length() <= 0) {
                z2 = false;
            }
            y8s.LJIIIIZZ = Boolean.valueOf(z2);
            List<String> boundThirdPartyPlatforms = iHostUserDepend.getBoundThirdPartyPlatforms();
            if (boundThirdPartyPlatforms != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = boundThirdPartyPlatforms.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(EnumC85538Xhe.valueOf(it.next()));
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                y8s.LJIIIZ = arrayList;
            }
            y8q.LIZ = y8s;
            y8o.LIZIZ(y8q, "");
            return;
        }
        y8o.LIZ();
    }
}
