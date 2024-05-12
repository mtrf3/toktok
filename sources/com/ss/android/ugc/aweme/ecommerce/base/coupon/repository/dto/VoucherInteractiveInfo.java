package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C69634RUo;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VoucherInteractiveInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VoucherInteractiveInfo> CREATOR = new C69634RUo();

    @InterfaceC65349Pkn("author_nick_name")
    public String authorNickName;

    @InterfaceC65349Pkn("author_photo")
    public Image authorPhoto;

    @InterfaceC65349Pkn("seller_guide_interactive_text")
    public String interactiveText;

    @InterfaceC65349Pkn("interactive_voucher_task_info")
    public InteractiveUserTask taskInfo;

    @InterfaceC65349Pkn("waiting_time_for_claim_voucher")
    public String timeForClaimVoucher;

    /* JADX WARN: Multi-variable type inference failed */
    public VoucherInteractiveInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.authorPhoto, i);
        out.writeString(this.authorNickName);
        out.writeString(this.interactiveText);
        out.writeString(this.timeForClaimVoucher);
        InteractiveUserTask interactiveUserTask = this.taskInfo;
        if (interactiveUserTask == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            interactiveUserTask.writeToParcel(out, i);
        }
    }

    public final String getAuthorNickName() {
        return this.authorNickName;
    }

    public final Image getAuthorPhoto() {
        return this.authorPhoto;
    }

    public final String getInteractiveText() {
        return this.interactiveText;
    }

    public final InteractiveUserTask getTaskInfo() {
        return this.taskInfo;
    }

    public final String getTimeForClaimVoucher() {
        return this.timeForClaimVoucher;
    }

    public final void setAuthorNickName(String str) {
        this.authorNickName = str;
    }

    public final void setAuthorPhoto(Image image) {
        this.authorPhoto = image;
    }

    public final void setInteractiveText(String str) {
        this.interactiveText = str;
    }

    public final void setTaskInfo(InteractiveUserTask interactiveUserTask) {
        this.taskInfo = interactiveUserTask;
    }

    public final void setTimeForClaimVoucher(String str) {
        this.timeForClaimVoucher = str;
    }

    public VoucherInteractiveInfo(Image image, String str, String str2, String str3, InteractiveUserTask interactiveUserTask) {
        this.authorPhoto = image;
        this.authorNickName = str;
        this.interactiveText = str2;
        this.timeForClaimVoucher = str3;
        this.taskInfo = interactiveUserTask;
    }

    public /* synthetic */ VoucherInteractiveInfo(Image image, String str, String str2, String str3, InteractiveUserTask interactiveUserTask, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? interactiveUserTask : null);
    }
}
