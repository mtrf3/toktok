package com.bytedance.helios.network.pipeline;

import X.C113554cx;
import X.C65902Pti;
import X.C65926Pu6;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.ORZ;
import com.bytedance.helios.network.api.service.INetworkApiService;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class ModifyConfig extends F9E {
    public static final /* synthetic */ int LJLIL = 0;

    @InterfaceC65349Pkn("content")
    public OperationConfig content;

    @InterfaceC65349Pkn("cookie")
    public OperationConfig cookie;

    @InterfaceC65349Pkn("domain")
    public OperationConfig domain;

    @InterfaceC65349Pkn("header")
    public OperationConfig header;

    @InterfaceC65349Pkn("path")
    public OperationConfig path;

    @InterfaceC65349Pkn("query")
    public OperationConfig query;

    @InterfaceC65349Pkn("scheme")
    public OperationConfig scheme;

    /* JADX WARN: Multi-variable type inference failed */
    public ModifyConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.query, this.header, this.cookie, this.content, this.scheme, this.domain, this.path};
    }

    public final void L(ModifyConfig modifyConfig) {
        if (modifyConfig != null) {
            OperationConfig operationConfig = this.query;
            if (operationConfig == null) {
                this.query = modifyConfig.query;
            } else {
                operationConfig.L(modifyConfig.query);
            }
            OperationConfig operationConfig2 = this.header;
            if (operationConfig2 == null) {
                this.header = modifyConfig.header;
            } else {
                operationConfig2.L(modifyConfig.header);
            }
            OperationConfig operationConfig3 = this.cookie;
            if (operationConfig3 == null) {
                this.cookie = modifyConfig.cookie;
            } else {
                operationConfig3.L(modifyConfig.cookie);
            }
            OperationConfig operationConfig4 = this.content;
            if (operationConfig4 == null) {
                this.content = modifyConfig.content;
            } else {
                operationConfig4.L(modifyConfig.content);
            }
            OperationConfig operationConfig5 = this.scheme;
            if (operationConfig5 == null) {
                this.scheme = modifyConfig.scheme;
            } else {
                operationConfig5.L(modifyConfig.scheme);
            }
            OperationConfig operationConfig6 = this.domain;
            if (operationConfig6 == null) {
                this.domain = modifyConfig.domain;
            } else {
                operationConfig6.L(modifyConfig.domain);
            }
            OperationConfig operationConfig7 = this.path;
            if (operationConfig7 == null) {
                this.path = modifyConfig.path;
            } else {
                operationConfig7.L(modifyConfig.path);
            }
        }
    }

    public final void M(C65902Pti c65902Pti, boolean z) {
        Map<String, ReplaceConfig> map;
        INetworkApiService iNetworkApiService;
        Map<String, ReplaceConfig> map2;
        INetworkApiService iNetworkApiService2;
        Map<String, ReplaceConfig> map3;
        INetworkApiService iNetworkApiService3;
        List<String> list;
        INetworkApiService iNetworkApiService4;
        Map<String, ReplaceConfig> map4;
        INetworkApiService iNetworkApiService5;
        Map<String, String> map5;
        INetworkApiService iNetworkApiService6;
        List<String> list2;
        INetworkApiService iNetworkApiService7;
        Map<String, ReplaceConfig> map6;
        INetworkApiService iNetworkApiService8;
        Map<String, String> map7;
        INetworkApiService iNetworkApiService9;
        List<String> list3;
        INetworkApiService iNetworkApiService10;
        Map<String, ReplaceConfig> map8;
        INetworkApiService iNetworkApiService11;
        Map<String, String> map9;
        INetworkApiService iNetworkApiService12;
        try {
            OperationConfig operationConfig = this.query;
            if (operationConfig != null && (map9 = operationConfig.add) != null && !map9.isEmpty() && (iNetworkApiService12 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService12.addQueries(c65902Pti, C113554cx.LJJLIIIJLLLLLLLZ(map9));
            }
            OperationConfig operationConfig2 = this.query;
            if (operationConfig2 != null && (map8 = operationConfig2.replace) != null && !map8.isEmpty() && (iNetworkApiService11 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService11.replaceQueries(c65902Pti, C113554cx.LJJLIIIJLLLLLLLZ(map8), z);
            }
            OperationConfig operationConfig3 = this.query;
            if (operationConfig3 != null && (list3 = operationConfig3.remove) != null && !list3.isEmpty() && (iNetworkApiService10 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService10.removeQueries(c65902Pti, ORZ.LLJI(list3), z);
            }
            OperationConfig operationConfig4 = this.header;
            if (operationConfig4 != null && (map7 = operationConfig4.add) != null && !map7.isEmpty() && (iNetworkApiService9 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService9.addHeaders(c65902Pti, C113554cx.LJJLIIIJLLLLLLLZ(map7));
            }
            OperationConfig operationConfig5 = this.header;
            if (operationConfig5 != null && (map6 = operationConfig5.replace) != null && !map6.isEmpty() && (iNetworkApiService8 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService8.replaceHeaders(c65902Pti, C113554cx.LJJLIIIJLLLLLLLZ(map6), z);
            }
            OperationConfig operationConfig6 = this.header;
            if (operationConfig6 != null && (list2 = operationConfig6.remove) != null && !list2.isEmpty() && (iNetworkApiService7 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService7.removeHeaders(c65902Pti, ORZ.LLJI(list2), z);
            }
            OperationConfig operationConfig7 = this.cookie;
            if (operationConfig7 != null && (map5 = operationConfig7.add) != null && !map5.isEmpty() && (iNetworkApiService6 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService6.addCookies(c65902Pti, C113554cx.LJJLIIIJLLLLLLLZ(map5));
            }
            OperationConfig operationConfig8 = this.cookie;
            if (operationConfig8 != null && (map4 = operationConfig8.replace) != null && !map4.isEmpty() && (iNetworkApiService5 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService5.replaceCookies(c65902Pti, C113554cx.LJJLIIIJLLLLLLLZ(map4), z);
            }
            OperationConfig operationConfig9 = this.cookie;
            if (operationConfig9 != null && (list = operationConfig9.remove) != null && !list.isEmpty() && (iNetworkApiService4 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService4.removeCookies(c65902Pti, ORZ.LLJI(list), z);
            }
            OperationConfig operationConfig10 = this.scheme;
            if (operationConfig10 != null && (map3 = operationConfig10.replace) != null && !map3.isEmpty() && (iNetworkApiService3 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService3.replaceScheme(c65902Pti, C113554cx.LJJLIIIJLLLLLLLZ(map3));
            }
            OperationConfig operationConfig11 = this.domain;
            if (operationConfig11 != null && (map2 = operationConfig11.replace) != null && !map2.isEmpty() && (iNetworkApiService2 = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService2.replaceDomain(c65902Pti, C113554cx.LJJLIIIJLLLLLLLZ(map2));
            }
            OperationConfig operationConfig12 = this.path;
            if (operationConfig12 != null && (map = operationConfig12.replace) != null && !map.isEmpty() && (iNetworkApiService = c65902Pti.LJLILLLLZI) != null) {
                iNetworkApiService.replacePath(c65902Pti, C113554cx.LJJLIIIJLLLLLLLZ(map));
            }
        } catch (Throwable th) {
            C65926Pu6.LIZ("Helios:Network-Invoke", new AqS158S0200000_11(this, c65902Pti, 1), 6, th);
        }
    }

    public ModifyConfig(OperationConfig operationConfig, OperationConfig operationConfig2, OperationConfig operationConfig3, OperationConfig operationConfig4, OperationConfig operationConfig5, OperationConfig operationConfig6, OperationConfig operationConfig7) {
        this.query = operationConfig;
        this.header = operationConfig2;
        this.cookie = operationConfig3;
        this.content = operationConfig4;
        this.scheme = operationConfig5;
        this.domain = operationConfig6;
        this.path = operationConfig7;
    }

    public /* synthetic */ ModifyConfig(OperationConfig operationConfig, OperationConfig operationConfig2, OperationConfig operationConfig3, OperationConfig operationConfig4, OperationConfig operationConfig5, OperationConfig operationConfig6, OperationConfig operationConfig7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : operationConfig, (i & 2) != 0 ? null : operationConfig2, (i & 4) != 0 ? null : operationConfig3, (i & 8) != 0 ? null : operationConfig4, (i & 16) != 0 ? null : operationConfig5, (i & 32) != 0 ? null : operationConfig6, (i & 64) == 0 ? operationConfig7 : null);
    }
}
