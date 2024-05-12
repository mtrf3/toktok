package com.ss.android.ugc.aweme.ecommerce.fashionmall.bean;

import X.C76800UCe;
import X.EnumC55971Lxv;
import X.EnumC56002LyQ;
import X.InterfaceC88473Ynt;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallMainToolPanelBean {
    public InterfaceC88473Ynt<? super List<ToolEntryVO>, ? super Integer, ? super Integer, C76800UCe> sendButtonShowBlock;
    public final ArrayList<ToolEntryVO> toolList;
    public EnumC55971Lxv userType;
    public EnumC56002LyQ viewType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallMainToolPanelBean copy$default(MallMainToolPanelBean mallMainToolPanelBean, EnumC56002LyQ enumC56002LyQ, ArrayList arrayList, EnumC55971Lxv enumC55971Lxv, InterfaceC88473Ynt interfaceC88473Ynt, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC56002LyQ = mallMainToolPanelBean.viewType;
        }
        if ((i & 2) != 0) {
            arrayList = mallMainToolPanelBean.toolList;
        }
        if ((i & 4) != 0) {
            enumC55971Lxv = mallMainToolPanelBean.userType;
        }
        if ((i & 8) != 0) {
            interfaceC88473Ynt = mallMainToolPanelBean.sendButtonShowBlock;
        }
        return mallMainToolPanelBean.copy(enumC56002LyQ, arrayList, enumC55971Lxv, interfaceC88473Ynt);
    }

    public final MallMainToolPanelBean copy(EnumC56002LyQ viewType, ArrayList<ToolEntryVO> toolList, EnumC55971Lxv userType, InterfaceC88473Ynt<? super List<ToolEntryVO>, ? super Integer, ? super Integer, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(viewType, "viewType");
        o.LJIIIZ(toolList, "toolList");
        o.LJIIIZ(userType, "userType");
        return new MallMainToolPanelBean(viewType, toolList, userType, interfaceC88473Ynt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallMainToolPanelBean)) {
            return false;
        }
        MallMainToolPanelBean mallMainToolPanelBean = (MallMainToolPanelBean) obj;
        return this.viewType == mallMainToolPanelBean.viewType && o.LJ(this.toolList, mallMainToolPanelBean.toolList) && this.userType == mallMainToolPanelBean.userType && o.LJ(this.sendButtonShowBlock, mallMainToolPanelBean.sendButtonShowBlock);
    }

    public int hashCode() {
        int hashCode = (this.userType.hashCode() + ((this.toolList.hashCode() + (this.viewType.hashCode() * 31)) * 31)) * 31;
        InterfaceC88473Ynt<? super List<ToolEntryVO>, ? super Integer, ? super Integer, C76800UCe> interfaceC88473Ynt = this.sendButtonShowBlock;
        return hashCode + (interfaceC88473Ynt == null ? 0 : interfaceC88473Ynt.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallMainToolPanelBean(viewType=");
        LIZ.append(this.viewType);
        LIZ.append(", toolList=");
        LIZ.append(this.toolList);
        LIZ.append(", userType=");
        LIZ.append(this.userType);
        LIZ.append(", sendButtonShowBlock=");
        LIZ.append(this.sendButtonShowBlock);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final InterfaceC88473Ynt<List<ToolEntryVO>, Integer, Integer, C76800UCe> getSendButtonShowBlock() {
        return this.sendButtonShowBlock;
    }

    public final ArrayList<ToolEntryVO> getToolList() {
        return this.toolList;
    }

    public final EnumC55971Lxv getUserType() {
        return this.userType;
    }

    public final EnumC56002LyQ getViewType() {
        return this.viewType;
    }

    public final void setSendButtonShowBlock(InterfaceC88473Ynt<? super List<ToolEntryVO>, ? super Integer, ? super Integer, C76800UCe> interfaceC88473Ynt) {
        this.sendButtonShowBlock = interfaceC88473Ynt;
    }

    public final void setUserType(EnumC55971Lxv enumC55971Lxv) {
        o.LJIIIZ(enumC55971Lxv, "<set-?>");
        this.userType = enumC55971Lxv;
    }

    public final void setViewType(EnumC56002LyQ enumC56002LyQ) {
        o.LJIIIZ(enumC56002LyQ, "<set-?>");
        this.viewType = enumC56002LyQ;
    }

    public MallMainToolPanelBean(EnumC56002LyQ viewType, ArrayList<ToolEntryVO> toolList, EnumC55971Lxv userType, InterfaceC88473Ynt<? super List<ToolEntryVO>, ? super Integer, ? super Integer, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(viewType, "viewType");
        o.LJIIIZ(toolList, "toolList");
        o.LJIIIZ(userType, "userType");
        this.viewType = viewType;
        this.toolList = toolList;
        this.userType = userType;
        this.sendButtonShowBlock = interfaceC88473Ynt;
    }

    public /* synthetic */ MallMainToolPanelBean(EnumC56002LyQ enumC56002LyQ, ArrayList arrayList, EnumC55971Lxv enumC55971Lxv, InterfaceC88473Ynt interfaceC88473Ynt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC56002LyQ, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? EnumC55971Lxv.UNKNOWN : enumC55971Lxv, (i & 8) != 0 ? null : interfaceC88473Ynt);
    }
}
