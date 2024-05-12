package com.ss.android.ugc.aweme.im.message.template.service;

import X.C117824jq;
import X.C1NE;
import X.C279017q;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SendMessageTemplateTask implements Parcelable {
    public static final Parcelable.Creator<SendMessageTemplateTask> CREATOR = new Parcelable.Creator<SendMessageTemplateTask>() { // from class: X.4Ry
        @Override // android.os.Parcelable.Creator
        public final SendMessageTemplateTask createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            BaseTemplate baseTemplate = (BaseTemplate) parcel.readParcelable(SendMessageTemplateTask.class.getClassLoader());
            SendMessageEventParcel createFromParcel = SendMessageEventParcel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            return new SendMessageTemplateTask(readString, baseTemplate, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SendMessageTemplateTask[] newArray(int i) {
            return new SendMessageTemplateTask[i];
        }
    };
    public final List<C117824jq> attachments;
    public final String scene;
    public final SendMessageEventParcel sendMessageEventParcel;
    public final BaseTemplate template;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMessageTemplateTask)) {
            return false;
        }
        SendMessageTemplateTask sendMessageTemplateTask = (SendMessageTemplateTask) obj;
        return o.LJ(this.scene, sendMessageTemplateTask.scene) && o.LJ(this.template, sendMessageTemplateTask.template) && o.LJ(this.sendMessageEventParcel, sendMessageTemplateTask.sendMessageEventParcel) && o.LJ(this.attachments, sendMessageTemplateTask.attachments);
    }

    public final int hashCode() {
        int hashCode = (this.sendMessageEventParcel.hashCode() + ((this.template.hashCode() + (this.scene.hashCode() * 31)) * 31)) * 31;
        List<C117824jq> list = this.attachments;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendMessageTemplateTask(scene=");
        LIZ.append(this.scene);
        LIZ.append(", template=");
        LIZ.append(this.template);
        LIZ.append(", sendMessageEventParcel=");
        LIZ.append(this.sendMessageEventParcel);
        LIZ.append(", attachments=");
        return C1NE.LIZIZ(LIZ, this.attachments, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.scene);
        out.writeParcelable(this.template, i);
        this.sendMessageEventParcel.writeToParcel(out, i);
        List<C117824jq> list = this.attachments;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            out.writeSerializable((Serializable) LIZIZ.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SendMessageTemplateTask(String scene, BaseTemplate template, SendMessageEventParcel sendMessageEventParcel, List<? extends C117824jq> list) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(template, "template");
        o.LJIIIZ(sendMessageEventParcel, "sendMessageEventParcel");
        this.scene = scene;
        this.template = template;
        this.sendMessageEventParcel = sendMessageEventParcel;
        this.attachments = list;
    }
}
