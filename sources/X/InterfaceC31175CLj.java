package X;

@InterfaceC31182CLq
/* renamed from: X.CLj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31175CLj extends InterfaceC31180CLo {
    @InterfaceC36563EWp(isGetter = true, keyPath = "code", required = true)
    Number getCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "msg", required = true)
    String getMsg();

    @InterfaceC36563EWp(isGetter = true, keyPath = "share_platfrom", required = true)
    String getSharePlatfrom();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shareType", required = false)
    String getShareType();

    @Override // X.InterfaceC31180CLo
    @InterfaceC36563EWp(isGetter = false, keyPath = "code", required = true)
    void setCode(Number number);

    @Override // X.InterfaceC31180CLo
    @InterfaceC36563EWp(isGetter = false, keyPath = "msg", required = true)
    void setMsg(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "share_platfrom", required = true)
    void setSharePlatfrom(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "shareType", required = false)
    void setShareType(String str);
}
