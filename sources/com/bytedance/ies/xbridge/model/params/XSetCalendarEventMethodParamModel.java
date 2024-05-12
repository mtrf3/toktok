package com.bytedance.ies.xbridge.model.params;

import X.AbstractC37843EtD;
import X.C16880lQ;
import X.C77892Uhc;
import X.C77893Uhd;
import X.InterfaceC78280Uns;
import X.ORY;
import X.X1D;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class XSetCalendarEventMethodParamModel extends AbstractC37843EtD {
    public static final C77892Uhc Companion = new C77892Uhc();
    public final String action;
    public Long alarmOffsets;
    public Boolean allDay;
    public Long endDate;
    public String eventID;
    public String location;
    public String notes;
    public Long startDate;
    public String title;
    public String url;

    public String toString() {
        String LJLLILLLL = C16880lQ.LJLLILLLL(XSetCalendarEventMethodParamModel.class);
        if (LJLLILLLL == null) {
            LJLLILLLL = "XCalendarMethodParamModel";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLLILLLL);
        LIZ.append('(');
        sb.append(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("action = ");
        LIZ2.append(this.action);
        LIZ2.append(" ,");
        sb.append(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("eventID = ");
        LIZ3.append(this.eventID);
        LIZ3.append(" , ");
        sb.append(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("startDate = ");
        LIZ4.append(this.startDate);
        LIZ4.append(" , ");
        sb.append(X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("endDate = ");
        LIZ5.append(this.endDate);
        LIZ5.append(" , ");
        sb.append(X1D.LIZIZ(LIZ5));
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("alarmOffsets = [ ");
        LIZ6.append(this.alarmOffsets);
        LIZ6.append(' ');
        sb.append(X1D.LIZIZ(LIZ6));
        sb.append("], ");
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("allDay = ");
        LIZ7.append(this.allDay);
        LIZ7.append(" , ");
        sb.append(X1D.LIZIZ(LIZ7));
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append("title = ");
        LIZ8.append(this.title);
        LIZ8.append(" , ");
        sb.append(X1D.LIZIZ(LIZ8));
        StringBuilder LIZ9 = X1D.LIZ();
        LIZ9.append("notes = ");
        LIZ9.append(this.notes);
        LIZ9.append(" , ");
        sb.append(X1D.LIZIZ(LIZ9));
        StringBuilder LIZ10 = X1D.LIZ();
        LIZ10.append("location = ");
        LIZ10.append(this.location);
        LIZ10.append(" , ");
        sb.append(X1D.LIZIZ(LIZ10));
        StringBuilder LIZ11 = X1D.LIZ();
        LIZ11.append("url = ");
        LIZ11.append(this.url);
        LIZ11.append(')');
        sb.append(X1D.LIZIZ(LIZ11));
        String sb2 = sb.toString();
        o.LJFF(sb2, "ret.toString()");
        return sb2;
    }

    public final String getAction() {
        return this.action;
    }

    public final Long getAlarmOffsets() {
        return this.alarmOffsets;
    }

    public final Boolean getAllDay() {
        return this.allDay;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getEventID() {
        return this.eventID;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public XSetCalendarEventMethodParamModel(String action) {
        o.LJIIJ(action, "action");
        this.action = action;
        this.endDate = 0L;
        this.startDate = 0L;
    }

    public static final XSetCalendarEventMethodParamModel convert(InterfaceC78280Uns params) {
        String str;
        boolean z;
        Companion.getClass();
        o.LJIIJ(params, "params");
        String LJJIJIL = u.LJJIJIL(params, "eventID", "");
        if (o.LJ(LJJIJIL, "")) {
            str = "create";
        } else {
            str = "update";
        }
        C77893Uhd c77893Uhd = AbstractC37843EtD.Companion;
        Long LIZIZ = C77893Uhd.LIZIZ(c77893Uhd, params, "startDate");
        Long LIZIZ2 = C77893Uhd.LIZIZ(c77893Uhd, params, "endDate");
        String LJJIJIL2 = u.LJJIJIL(params, "location", "");
        String LJJIJIL3 = u.LJJIJIL(params, "url", "");
        String LJJIJIL4 = u.LJJIJIL(params, "title", "");
        String LJJIJIL5 = u.LJJIJIL(params, "notes", "");
        boolean LJJIIZI = u.LJJIIZI(params, "allDay", false);
        Long valueOf = Long.valueOf(C77893Uhd.LIZ(params, "alarmOffset", 0));
        XSetCalendarEventMethodParamModel xSetCalendarEventMethodParamModel = new XSetCalendarEventMethodParamModel(str);
        xSetCalendarEventMethodParamModel.setStartDate(LIZIZ);
        xSetCalendarEventMethodParamModel.setEndDate(LIZIZ2);
        xSetCalendarEventMethodParamModel.setTitle(LJJIJIL4);
        xSetCalendarEventMethodParamModel.setEventID(LJJIJIL);
        xSetCalendarEventMethodParamModel.setNotes(LJJIJIL5);
        xSetCalendarEventMethodParamModel.setAlarmOffsets(valueOf);
        xSetCalendarEventMethodParamModel.setLocation(LJJIJIL2);
        xSetCalendarEventMethodParamModel.setUrl(LJJIJIL3);
        xSetCalendarEventMethodParamModel.setAllDay(Boolean.valueOf(LJJIIZI));
        String action = xSetCalendarEventMethodParamModel.getAction();
        if (action == null || action.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (ORY.LJJIJIIJIL(xSetCalendarEventMethodParamModel.getAction(), new String[]{"create", "delete", "update", "read"})) {
                if (o.LJ(xSetCalendarEventMethodParamModel.getAction(), "create") || o.LJ(xSetCalendarEventMethodParamModel.getAction(), "update")) {
                    if ((!o.LJ(xSetCalendarEventMethodParamModel.getAction(), "update") || xSetCalendarEventMethodParamModel.getEventID() != null) && xSetCalendarEventMethodParamModel.getStartDate() != null && xSetCalendarEventMethodParamModel.getEndDate() != null) {
                        Long endDate = xSetCalendarEventMethodParamModel.getEndDate();
                        if (endDate != null) {
                            long longValue = endDate.longValue();
                            Long startDate = xSetCalendarEventMethodParamModel.getStartDate();
                            if (startDate != null) {
                                if (longValue >= startDate.longValue()) {
                                    Long endDate2 = xSetCalendarEventMethodParamModel.getEndDate();
                                    if (endDate2 != null) {
                                        if (endDate2.longValue() >= 0) {
                                            Long startDate2 = xSetCalendarEventMethodParamModel.getStartDate();
                                            if (startDate2 != null) {
                                                if (startDate2.longValue() >= 0 && xSetCalendarEventMethodParamModel.getAlarmOffsets() != null) {
                                                    Long alarmOffsets = xSetCalendarEventMethodParamModel.getAlarmOffsets();
                                                    if (alarmOffsets != null) {
                                                        if (alarmOffsets.longValue() >= 0 && xSetCalendarEventMethodParamModel.getAllDay() != null && xSetCalendarEventMethodParamModel.getTitle() != null && xSetCalendarEventMethodParamModel.getNotes() != null && xSetCalendarEventMethodParamModel.getLocation() != null && xSetCalendarEventMethodParamModel.getAllDay() != null && xSetCalendarEventMethodParamModel.getUrl() != null) {
                                                            return xSetCalendarEventMethodParamModel;
                                                        }
                                                    } else {
                                                        o.LJIIZILJ();
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                o.LJIIZILJ();
                                                throw null;
                                            }
                                        }
                                    } else {
                                        o.LJIIZILJ();
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIIZILJ();
                                throw null;
                            }
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                } else if ((!o.LJ(xSetCalendarEventMethodParamModel.getAction(), "delete") && !o.LJ(xSetCalendarEventMethodParamModel.getAction(), "read")) || xSetCalendarEventMethodParamModel.getEventID() != null) {
                    return xSetCalendarEventMethodParamModel;
                }
            }
        }
        return null;
    }

    public final void setAlarmOffsets(Long l) {
        this.alarmOffsets = l;
    }

    public final void setAllDay(Boolean bool) {
        this.allDay = bool;
    }

    public final void setEndDate(Long l) {
        this.endDate = l;
    }

    public final void setEventID(String str) {
        this.eventID = str;
    }

    public final void setLocation(String str) {
        this.location = str;
    }

    public final void setNotes(String str) {
        this.notes = str;
    }

    public final void setStartDate(Long l) {
        this.startDate = l;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
