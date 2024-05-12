package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aeI, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94270aeI extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final EnumC93823aX5 LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final Object LJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL};
    }

    public /* synthetic */ C94270aeI(String str, String str2, String str3, String str4, EnumC93823aX5 enumC93823aX5, String str5, String str6, String str7, String str8) {
        this(enumC93823aX5, null, str, str2, str3, str4, str5, str6, str7, str8);
    }

    public C94270aeI(EnumC93823aX5 resourceType, Object obj, String resourceName, String typeName, String effectPath, String resourcePath, String effectIdentity, String extra, String category, String capabilities) {
        o.LJIIIZ(resourceName, "resourceName");
        o.LJIIIZ(typeName, "typeName");
        o.LJIIIZ(effectPath, "effectPath");
        o.LJIIIZ(resourcePath, "resourcePath");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(effectIdentity, "effectIdentity");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(capabilities, "capabilities");
        this.LJLIL = resourceName;
        this.LJLILLLLZI = typeName;
        this.LJLJI = effectPath;
        this.LJLJJI = resourcePath;
        this.LJLJJL = resourceType;
        this.LJLJJLL = effectIdentity;
        this.LJLJL = extra;
        this.LJLJLJ = category;
        this.LJLJLLL = capabilities;
        this.LJLL = obj;
    }
}
