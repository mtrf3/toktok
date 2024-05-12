package com.ss.android.ugc.aweme.effectcreator.models;

import X.C61878OQg;
import X.ESR;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EffectCommandDataWrapper extends F9E implements Parcelable {
    public static final Parcelable.Creator<EffectCommandDataWrapper> CREATOR = new ESR();
    public final int actionCount;
    public final List<String> actionNameList;
    public final String commandAddFrom;
    public final int index;
    public final boolean isValid;
    public final String triggerName;
    public final int validActionCount;
    public final int validObjectCount;

    public EffectCommandDataWrapper() {
        this(false, 0, "", 0, 0, 0, "", C61878OQg.INSTANCE);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isValid), Integer.valueOf(this.index), this.commandAddFrom, Integer.valueOf(this.actionCount), Integer.valueOf(this.validActionCount), Integer.valueOf(this.validObjectCount), this.triggerName, this.actionNameList};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isValid ? 1 : 0);
        out.writeInt(this.index);
        out.writeString(this.commandAddFrom);
        out.writeInt(this.actionCount);
        out.writeInt(this.validActionCount);
        out.writeInt(this.validObjectCount);
        out.writeString(this.triggerName);
        out.writeStringList(this.actionNameList);
    }

    public EffectCommandDataWrapper(boolean z, int i, String commandAddFrom, int i2, int i3, int i4, String triggerName, List<String> actionNameList) {
        o.LJIIIZ(commandAddFrom, "commandAddFrom");
        o.LJIIIZ(triggerName, "triggerName");
        o.LJIIIZ(actionNameList, "actionNameList");
        this.isValid = z;
        this.index = i;
        this.commandAddFrom = commandAddFrom;
        this.actionCount = i2;
        this.validActionCount = i3;
        this.validObjectCount = i4;
        this.triggerName = triggerName;
        this.actionNameList = actionNameList;
    }
}
