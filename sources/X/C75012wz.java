package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75012wz extends F9E implements InterfaceC60152Xr {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("group_id", this.LJLIL);
        linkedHashMap.put("user_id", this.LJLILLLLZI);
        linkedHashMap.put("author_id", this.LJLJI);
        linkedHashMap.put("enter_from", this.LJLJJI);
        linkedHashMap.put("item_duration", this.LJLJJL);
        linkedHashMap.put("target_lang", this.LJLJJLL);
        linkedHashMap.put("is_author", Integer.valueOf(this.LJLJL));
        linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LJLJLJ));
        return linkedHashMap;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ)};
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C75012wz(int i, int i2, String groupId, String userId, String authorId, String enterFrom, String itemDuration, String targetLang) {
        o.LJIIIZ(groupId, "groupId");
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(itemDuration, "itemDuration");
        o.LJIIIZ(targetLang, "targetLang");
        this.LJLIL = groupId;
        this.LJLILLLLZI = userId;
        this.LJLJI = authorId;
        this.LJLJJI = enterFrom;
        this.LJLJJL = itemDuration;
        this.LJLJJLL = targetLang;
        this.LJLJL = i;
        this.LJLJLJ = i2;
    }
}
