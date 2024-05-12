package com.bytedance.effectcreatormobile.ckeapi.api.draft;

import X.C61878OQg;
import X.C94393agH;
import X.C94394agI;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EffectPackageData extends F9E {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public long LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public List<C94394agI> LJLLILLLL;
    public List<C94393agH> LJLLJ;
    public String LJLLL;
    public List<EffectHint> LJLLLL;

    @InterfaceC65349Pkn("total_duration")
    public long duration;

    @InterfaceC65349Pkn("interaction_duration")
    public long interactionDuration;

    @InterfaceC65349Pkn("layer_duration")
    public long layerDuration;

    @InterfaceC65349Pkn("project_id")
    public String projectId;

    @InterfaceC65349Pkn("project_source")
    public String projectSource;

    public EffectPackageData() {
        this(null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, 0, 0, 0, 0, null, null, null, null, 1048575, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.projectId, this.projectSource, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, Long.valueOf(this.LJLJL), Long.valueOf(this.duration), Long.valueOf(this.layerDuration), Long.valueOf(this.interactionDuration), Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLL), Integer.valueOf(this.LJLLI), this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL};
    }

    public EffectPackageData(String projectId, String projectSource, String publishSource, String enterFrom, String templateId, String defaultIconType, String defaultIconFeatureId, String templateResId, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, List<C94394agI> objectDataList, List<C94393agH> commandDataList, String ameSaveFrom, List<EffectHint> availableEffectHintList) {
        o.LJIIIZ(projectId, "projectId");
        o.LJIIIZ(projectSource, "projectSource");
        o.LJIIIZ(publishSource, "publishSource");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(defaultIconType, "defaultIconType");
        o.LJIIIZ(defaultIconFeatureId, "defaultIconFeatureId");
        o.LJIIIZ(templateResId, "templateResId");
        o.LJIIIZ(objectDataList, "objectDataList");
        o.LJIIIZ(commandDataList, "commandDataList");
        o.LJIIIZ(ameSaveFrom, "ameSaveFrom");
        o.LJIIIZ(availableEffectHintList, "availableEffectHintList");
        this.projectId = projectId;
        this.projectSource = projectSource;
        this.LJLIL = publishSource;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = templateId;
        this.LJLJJI = defaultIconType;
        this.LJLJJL = defaultIconFeatureId;
        this.LJLJJLL = templateResId;
        this.LJLJL = j;
        this.duration = j2;
        this.layerDuration = j3;
        this.interactionDuration = j4;
        this.LJLJLJ = i;
        this.LJLJLLL = i2;
        this.LJLL = i3;
        this.LJLLI = i4;
        this.LJLLILLLL = objectDataList;
        this.LJLLJ = commandDataList;
        this.LJLLL = ameSaveFrom;
        this.LJLLLL = availableEffectHintList;
    }

    public EffectPackageData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, List list, List list2, String str9, List list3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? "" : str4, (i5 & 16) != 0 ? "" : str5, (i5 & 32) != 0 ? "" : str6, (i5 & 64) != 0 ? "" : str7, (i5 & 128) != 0 ? "" : str8, (i5 & 256) != 0 ? 0L : j, (i5 & 512) != 0 ? 0L : j2, (i5 & 1024) != 0 ? 0L : j3, (i5 & 2048) == 0 ? j4 : 0L, (i5 & 4096) != 0 ? 0 : i, (i5 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i2, (i5 & 16384) != 0 ? 0 : i3, (32768 & i5) == 0 ? i4 : 0, (65536 & i5) != 0 ? C61878OQg.INSTANCE : list, (131072 & i5) != 0 ? C61878OQg.INSTANCE : list2, (262144 & i5) == 0 ? str9 : "", (i5 & 524288) != 0 ? C61878OQg.INSTANCE : list3);
    }
}
