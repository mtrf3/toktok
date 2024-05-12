package com.ss.android.ugc.aweme.sharer.model;

import X.C62374Odu;
import X.C62376Odw;
import Y.IDCreatorS53S0000000_10;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class SharePackage extends BaseSharePackage {
    public final C62374Odu builder;
    public final SendMessageTemplateTask sendMessageTemplateTask;
    public static final C62376Odw Companion = new C62376Odw();
    public static final Parcelable.Creator<SharePackage> CREATOR = new IDCreatorS53S0000000_10(3);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePackage(C62374Odu builder) {
        super(builder);
        o.LJIIIZ(builder, "builder");
        this.builder = builder;
        this.sendMessageTemplateTask = builder.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        super.writeToParcel(dest, i);
        dest.writeParcelable(this.sendMessageTemplateTask, i);
    }
}
