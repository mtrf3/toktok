package com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo;

import X.F9E;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MallToolPanelVO extends F9E {
    public final List<ToolEntryVO> toolEntryList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallToolPanelVO copy$default(MallToolPanelVO mallToolPanelVO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mallToolPanelVO.toolEntryList;
        }
        return mallToolPanelVO.copy(list);
    }

    public final MallToolPanelVO copy(List<ToolEntryVO> toolEntryList) {
        o.LJIIIZ(toolEntryList, "toolEntryList");
        return new MallToolPanelVO(toolEntryList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.toolEntryList};
    }

    public final List<ToolEntryVO> getToolEntryList() {
        return this.toolEntryList;
    }

    public MallToolPanelVO(List<ToolEntryVO> toolEntryList) {
        o.LJIIIZ(toolEntryList, "toolEntryList");
        this.toolEntryList = toolEntryList;
    }
}
