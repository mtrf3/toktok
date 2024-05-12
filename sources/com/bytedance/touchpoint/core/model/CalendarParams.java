package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CalendarParams extends F9E {

    @InterfaceC65349Pkn("alarmOffset")
    public final long alarmOffset;

    @InterfaceC65349Pkn("allDay")
    public final boolean allDay;

    @InterfaceC65349Pkn("endDate")
    public final long endDate;

    @InterfaceC65349Pkn("enterFrom")
    public final String enterFrom;

    @InterfaceC65349Pkn("identifier")
    public final String identifier;

    @InterfaceC65349Pkn("notes")
    public final String notes;

    @InterfaceC65349Pkn("repeatCount")
    public final int repeatCount;

    @InterfaceC65349Pkn("repeatFrequency")
    public final String repeatFrequency;

    @InterfaceC65349Pkn("repeatInterval")
    public final int repeatInterval;

    @InterfaceC65349Pkn("startDate")
    public final long startDate;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CalendarParams() {
        /*
            r17 = this;
            r1 = 0
            r3 = 0
            r5 = 0
            r15 = 2047(0x7ff, float:2.868E-42)
            r0 = r17
            r2 = r1
            r4 = r3
            r7 = r5
            r9 = r5
            r11 = r3
            r12 = r1
            r13 = r1
            r14 = r1
            r16 = r1
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.model.CalendarParams.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.identifier, this.repeatFrequency, Integer.valueOf(this.repeatInterval), Integer.valueOf(this.repeatCount), Long.valueOf(this.startDate), Long.valueOf(this.endDate), Long.valueOf(this.alarmOffset), Boolean.valueOf(this.allDay), this.title, this.notes, this.enterFrom};
    }

    public CalendarParams(String identifier, String repeatFrequency, int i, int i2, long j, long j2, long j3, boolean z, String title, String notes, String enterFrom) {
        o.LJIIIZ(identifier, "identifier");
        o.LJIIIZ(repeatFrequency, "repeatFrequency");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(notes, "notes");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.identifier = identifier;
        this.repeatFrequency = repeatFrequency;
        this.repeatInterval = i;
        this.repeatCount = i2;
        this.startDate = j;
        this.endDate = j2;
        this.alarmOffset = j3;
        this.allDay = z;
        this.title = title;
        this.notes = notes;
        this.enterFrom = enterFrom;
    }

    public /* synthetic */ CalendarParams(String str, String str2, int i, int i2, long j, long j2, long j3, boolean z, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? -1L : j, (i3 & 32) != 0 ? -1L : j2, (i3 & 64) == 0 ? j3 : -1L, (i3 & 128) == 0 ? z : false, (i3 & 256) != 0 ? "" : str3, (i3 & 512) != 0 ? "" : str4, (i3 & 1024) == 0 ? str5 : "");
    }
}
