package com.benchmark.inject;

import X.C06830Op;
import X.C09220Xu;
import X.C09580Ze;
import X.C16880lQ;
import X.C47261Igj;
import X.InterfaceC09240Xw;
import X.X1D;
import com.benchmark.entity.ABMockModel;
import com.benchmark.entity.Group;
import com.benchmark.entity.Language;
import com.benchmark.entity.Scope;
import com.benchmark.inject.InjectABMockConfig;
import com.benchmark.serializer.ABMockSerializer;
import com.benchmark.serializer.GroupSerializer;
import com.benchmark.serializer.LanguageSerializer;
import com.benchmark.serializer.ScopeSerializer;
import com.bytedance.ies.abmock.debugtool.mock.IMockComponent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.e;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class InjectABMockConfig implements IMockComponent {
    public static StringBuilder abmockModelJsonBuilder = null;
    public static String injectJson = "[]";
    public static int[] repoNameList;
    public Gson mGson;
    public int mHostId = 100001;
    public List<ABMockModel> mMockModels;

    @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent
    public Map<String, Object> getExtendInfo(String str) {
        return null;
    }

    public String getInjectConfig() {
        StringBuilder sb = abmockModelJsonBuilder;
        if (sb != null) {
            injectJson = sb.toString();
        }
        if (injectJson.length() > 4) {
            List<ABMockModel> asList = Arrays.asList((Object[]) GsonProtectorUtils.fromJson(this.mGson, injectJson, ABMockModel[].class));
            this.mMockModels = asList;
            for (ABMockModel aBMockModel : asList) {
                if (!aBMockModel.filedTypeName.equals("int") && !aBMockModel.filedTypeName.equals("long") && !aBMockModel.filedTypeName.equals("float") && !aBMockModel.filedTypeName.equals("boolean") && !aBMockModel.filedTypeName.equals("java.lang.String")) {
                    try {
                        Object newInstance = Class.forName(aBMockModel.filedTypeName).getConstructor(new Class[0]).newInstance(new Object[0]);
                        ((Group) ListProtector.get(aBMockModel.groups, 0)).value = this.mGson.LJIJJLI(newInstance);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            injectJson = GsonProtectorUtils.toJson(this.mGson, this.mMockModels);
        }
        return injectJson;
    }

    @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent
    public IMockComponent.HostInfo hostInfo() {
        return new IMockComponent.HostInfo() { // from class: X.1FN
            @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent.HostInfo
            public final String chineseDesc() {
                return "ByteBench";
            }

            @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent.HostInfo
            public final String englishDesc() {
                return "ByteBench";
            }

            @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent.HostInfo
            public final int hostId() {
                return InjectABMockConfig.this.mHostId;
            }
        };
    }

    public InjectABMockConfig() {
        C47261Igj.LJIILJJIL("BXInjectABMockConfig");
        e eVar = new e();
        eVar.LIZIZ(new ABMockSerializer(), ABMockModel.class);
        eVar.LIZIZ(new GroupSerializer(), Group.class);
        eVar.LIZIZ(new LanguageSerializer(), Language.class);
        eVar.LIZIZ(new ScopeSerializer(), Scope.class);
        this.mGson = eVar.LIZ();
    }

    @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent
    public String mockInfoListJson() {
        String injectConfig = getInjectConfig();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mockInfoListJson: ");
        LIZ.append(injectConfig);
        X1D.LIZIZ(LIZ);
        C47261Igj.LJIILJJIL("BXInjectABMockConfig");
        return injectConfig;
    }

    public int getHostId() {
        return this.mHostId;
    }

    private Object getABMockModelDefaultValue(ABMockModel aBMockModel) {
        if (aBMockModel.filedTypeName.equals("int")) {
            return Integer.valueOf(((Group) ListProtector.get(aBMockModel.groups, 0)).value.LJIILJJIL());
        }
        if (aBMockModel.filedTypeName.equals("long")) {
            return Long.valueOf(((Group) ListProtector.get(aBMockModel.groups, 0)).value.LJIJJLI());
        }
        if (aBMockModel.filedTypeName.equals("float")) {
            return Float.valueOf(((Group) ListProtector.get(aBMockModel.groups, 0)).value.LJIIJ());
        }
        if (aBMockModel.filedTypeName.equals("boolean")) {
            return Boolean.valueOf(((Group) ListProtector.get(aBMockModel.groups, 0)).value.LJFF());
        }
        return ((Group) ListProtector.get(aBMockModel.groups, 0)).value.toString();
    }

    private ABMockModel getMatchModel(String str) {
        List<ABMockModel> list = this.mMockModels;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (ABMockModel aBMockModel : this.mMockModels) {
            if (aBMockModel.key.equals(str)) {
                return aBMockModel;
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent
    public Object get(String str) {
        if (!C09220Xu.LIZ()) {
            C47261Igj.LJIILL("BXInjectABMockConfig");
            return null;
        }
        ABMockModel matchModel = getMatchModel(str);
        if (matchModel == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("can not get matched abmock model: ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXInjectABMockConfig");
            return null;
        }
        for (int i : repoNameList) {
            StringBuilder LIZ2 = C06830Op.LIZ("get bytebench mock value the repo: ", i, " key: ", str, " mock filedType: ");
            LIZ2.append(matchModel.filedTypeName);
            X1D.LIZIZ(LIZ2);
            C47261Igj.LJIILJJIL("BXInjectABMockConfig");
            InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(i);
            if (LIZIZ.LJIIIZ(str)) {
                try {
                    C47261Igj.LJIILJJIL("BXInjectABMockConfig");
                    if (matchModel.filedTypeName.equals("int")) {
                        return Integer.valueOf(LIZIZ.LJI(str, ((Group) ListProtector.get(matchModel.groups, 0)).value.LJIILJJIL()));
                    }
                    if (matchModel.filedTypeName.equals("long")) {
                        return Long.valueOf(LIZIZ.LJIILLIIL(str, ((Group) ListProtector.get(matchModel.groups, 0)).value.LJIJJLI()));
                    }
                    if (matchModel.filedTypeName.equals("float")) {
                        return Float.valueOf(LIZIZ.LJ(str, ((Group) ListProtector.get(matchModel.groups, 0)).value.LJIIJ()));
                    }
                    if (matchModel.filedTypeName.equals("boolean")) {
                        return Boolean.valueOf(LIZIZ.LJII(str, ((Group) ListProtector.get(matchModel.groups, 0)).value.LJFF()));
                    }
                    return LIZIZ.LIZIZ(str, ((Group) ListProtector.get(matchModel.groups, 0)).value.toString());
                } catch (Exception unused) {
                }
            }
            C47261Igj.LJIILL("BXInjectABMockConfig");
        }
        return getABMockModelDefaultValue(matchModel);
    }

    @Override // com.bytedance.ies.abmock.debugtool.mock.IMockComponent
    public Class<?> getFiledType(String str) {
        ABMockModel matchModel = getMatchModel(str);
        if (matchModel == null) {
            return null;
        }
        if (matchModel.filedTypeName.equals("int")) {
            return Integer.TYPE;
        }
        if (matchModel.filedTypeName.equals("long")) {
            return Long.TYPE;
        }
        if (matchModel.filedTypeName.equals("float")) {
            return Float.TYPE;
        }
        if (matchModel.filedTypeName.equals("boolean")) {
            return Boolean.TYPE;
        }
        if (matchModel.filedTypeName.equals("java.lang.String")) {
            return String.class;
        }
        try {
            return Class.forName(matchModel.filedTypeName);
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
